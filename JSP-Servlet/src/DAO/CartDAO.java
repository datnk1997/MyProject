package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Connection.Connectdb;
import Model.CartDetail;
import Model.Product;

public class CartDAO {
	public boolean save(CartDetail cartDetail) {
		int result = 0;
		try {
			Connection con = Connectdb.getConnect();
			String sql = "insert into CartDetail(Pid, TotalPrice, Quanttity, Cartid)values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, cartDetail.getProduct().getPid());
			ps.setInt(2, cartDetail.getProduct().getPrice() * cartDetail.getQuantity());
			ps.setInt(3, cartDetail.getQuantity());
			ps.setInt(4, 1);
			result = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result > 0;
	}
	
	public List<CartDetail> getCartDetail(int id){
		List<CartDetail> cartDetails = new ArrayList<CartDetail>();
		try {
			Connection con = Connectdb.getConnect();
			String sql = "select * from CartDetail join Cart on CartDetail.Cartid = Cart.Cartid\r\n" + 
					"					join Product on CartDetail.Pid = Product.Pid\r\n" + 
					" where Cart.Cartid = 1";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				CartDetail cartDetail = new CartDetail();
				Product p = new Product();
				p.setPicture(rs.getString("Piture"));
				p.setPname(rs.getString("Pname"));
				p.setPrice(rs.getInt("Price"));
				cartDetail.setProduct(p);
				cartDetail.setCDid(rs.getInt("CDid"));
				int quantity = rs.getInt("Quanttity");
				cartDetail.setQuantity(quantity);
				cartDetail.setTotal(quantity * p.getPrice());
				cartDetails.add(cartDetail);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return cartDetails;
	}
	
	public int caculator(List<CartDetail> cartDetails) {
		int total = 0;
		for (CartDetail c : cartDetails) {
			total += c.getTotal();
		}
		return total;
	}
	public boolean deleteCartDetail(int CDid) {
		Connection con = Connectdb.getConnect();
		try {
			String sql = "delete from CartDetail where CDid ="+CDid+"";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.executeQuery();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
}
