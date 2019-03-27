package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import Connection.Connectdb;
import Connection.HibernateUtil;
import Model.Custommer;
import Model.Product;

public class ProductDAO {
	public List<Product> showProduct(int first, int maxSize){
		List<Product> ls = new ArrayList<>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		try{
			session.beginTransaction();
			String sql = "from Product";
			Query query = session.createQuery(sql);
			query.setFirstResult(first);
			query.setMaxResults(maxSize);
			ls = query.list();
			session.close();
			return ls;
		}catch (Exception e) {}
			// TODO: handle exception
		return ls;
		
		/*List<Product> ls = new ArrayList<>();
		Connection con = Connectdb.getConnect();
		try {
			String sql = "select * from Product";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				Product pd = new Product();
				pd.setPid(rs.getInt("Pid"));
				pd.setCid(rs.getInt("Cid"));
				pd.setPname(rs.getString("Pname"));
				pd.setNote(rs.getString("Note"));
				pd.setPrice(rs.getInt("Price"));
				pd.setPicture(rs.getString("Piture"));
				ls.add(pd);
			}
			return ls;
		} catch (SQLException e) {
			
		}*/
	}
	public List<Product> getProductByCid(int Cid){
		List<Product> ls = new ArrayList<>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		try{
			session.beginTransaction();
			String sql = "from Product  where Cid = " + Cid +"" ;
    		ls = session.createQuery(sql).list();
    		session.close();
//		Connection con = Connectdb.getConnect();
//		try {
//			String sql = "select Pid,Pname,Note,Price,Piture from Product join Categories on Product.Cid = Categories.Cid where Product.Cid = ?";
//			PreparedStatement pst = con.prepareStatement(sql);
//			pst.setInt(1, Cid);
//			ResultSet rs = pst.executeQuery();
//			while(rs.next()) {
//				Product pd = new Product();
//				pd.setPid(rs.getInt("Pid"));
//				pd.setPname(rs.getString("Pname"));
//				pd.setNote(rs.getString("Note"));
//				pd.setPrice(rs.getInt("Price"));
//				pd.setPicture(rs.getString("Piture"));
//				ls.add(pd);
//			}
			return ls;
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}
	public List<Product> getProductDetail(int Pid){
		List<Product> ls = new ArrayList<>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		try{
			session.beginTransaction();
			String sql = "from Product where Pid= " + Pid +"" ;
			ls = session.createQuery(sql).list();
//		Connection con =Connectdb.getConnect();
//		try {
//			String sql = "select Pid,Pname,Note,Price,Piture,Manhinh,CPU,Hedieuhanh,Ram,Bonhotrong from Product where Pid=?";
//			PreparedStatement pst = con.prepareStatement(sql);
//			pst.setInt(1, Pid);
//			ResultSet rs= pst.executeQuery();
//			while(rs.next()) {
//				Product pd = new Product();
//				pd.setPid(rs.getInt("Pid"));
//				pd.setPname(rs.getString("Pname"));
//				pd.setNote(rs.getString("Note"));
//				pd.setPrice(rs.getInt("Price"));
//				pd.setPicture(rs.getString("Piture"));
//				pd.setManhinh(rs.getString("Manhinh"));
//				pd.setCPU(rs.getString("CPU"));
//				pd.setHedieuhanh(rs.getString("Hedieuhanh"));
//				pd.setRam(rs.getString("Ram"));
//				pd.setBonhotrong(rs.getString("Bonhotrong"));
//				ls.add(pd);
//				
//			}
			session.close();
			return ls;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public static List<Product> getProductByName(String Pname){
		List<Product> list =null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try{


			session.beginTransaction();
			
			String sql = "from Product ";
			
    		if (Pname.length() > 0) {
    			sql += "where Pname like '%" + Pname + "%'";
    		}
    		list = session.createQuery(sql).list();        
    		session.close();
			return list;
			
			
			
		}catch (Exception e) {
		
			return null;
			
		}
	}
		public boolean insertProduct(Product product) {
			Session  ss  = HibernateUtil.getSessionFactory().openSession();
			try {
				ss.beginTransaction();
				ss.save(product);
				ss.getTransaction().commit();
				ss.close();
				return true;
			} catch (Exception e) {
				ss.getTransaction().rollback();
				return false;
			}
			
			
		}
		public static List<Product> getAllProduct(){
				List<Product> list = null;
				Session session = HibernateUtil.getSessionFactory().getCurrentSession();
				try{

					session.beginTransaction();
					
					String sql = "from Product";
		    		
		    		list = session.createQuery(sql).list();        
					
					return list;
					
					
					
				}catch (Exception e) {
				
					return null;
				}
				
			}
		public boolean deleteProduct(int Pid) {
			/*Session session = HibernateUtil.getSessionFactory().openSession();
			try {
				session.beginTransaction();
				String sql = "delete Product where Pid="+Pid+"";
				Query q = session.createQuery(sql);
				q.executeUpdate();
				session.close();
				return true;
			} catch (Exception e) {
				session.getTransaction().rollback();
				return false;
			}*/
			Connection con = Connectdb.getConnect();
			try {
				String sql = "delete Product where Pid="+Pid+"";
				PreparedStatement st = con.prepareStatement(sql);
				st.execute();
				return true;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
			
		}
		public boolean updateProduct(Product product) {
			Session session = HibernateUtil.getSessionFactory().openSession();
			try {
				session.beginTransaction();
//				String sql = "update Product set Pname = 'Iphone x3' where Pid = 59";
				session.update(product);
				session.getTransaction().commit();
				session.close();
				return true;
			} catch (Exception e) {
				session.getTransaction().rollback();
				return false;
			}
			
		}
	}
	
	
	
	

