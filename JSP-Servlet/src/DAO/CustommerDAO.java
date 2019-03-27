package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import Connection.Connectdb;
import Connection.HibernateUtil;
import Model.Custommer;

public class CustommerDAO {
	public boolean saveAccount(Custommer custommer) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();

			session.save(custommer);

			session.getTransaction().commit();

			session.close();
			return true;

		} catch (Exception e) {
			session.getTransaction().rollback();
			return false;

		}
		// Connection con = Connectdb.getConnect();
		// int result = 0;
		// try {
		// String sql = "insert into Custommer(Cusname,Phone,Addr,Uname,Pword)
		// values(?,?,?,?,?)";
		// PreparedStatement ps = con.prepareStatement(sql);
		// ps.setString(1, custommer.getName());
		// ps.setString(2, custommer.getPhone());
		// ps.setString(3, custommer.getAdress());
		// ps.setString(4, custommer.getUname());
		// ps.setString(5, custommer.getPword());
		// result = ps.executeUpdate();
		//
		// } catch (SQLException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// return result>0;

	}

	/*
	 * public Custommer loginAccount(String uname) { Connection con =
	 * Connectdb.getConnect(); Custommer ls = new Custommer(); try { String sql =
	 * "select Cusid,Uname,Pword from custommer where Uname=?"; PreparedStatement ps
	 * = con.prepareStatement(sql); ps.setString(1, uname); ResultSet rs =
	 * ps.executeQuery(); while(rs.next()) { ls.setCusid(rs.getInt("Cusid"));
	 * ls.setUname(rs.getString("Uname")); ls.setPword(rs.getString("Pword")); }
	 * return ls; } catch (SQLException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } return null;
	 * 
	 * 
	 * 
	 * }
	 */
	public static boolean checkLogin(String Uname, String Pword) {

		List<Custommer> list = null;

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		String sql = "from Custommer where Uname= '" + Uname + "' and  Pword= '" + Pword + "'";

		Query query = session.createQuery(sql);

		list = query.list();
		session.close();
		if (list.size() > 0) {
			return true;
		} else {

			return false;
		}
	}

	public static boolean insertCustomer(Custommer kh) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {

			session.beginTransaction();

			session.save(kh);

			session.getTransaction().commit();
			session.close();
			return true;

		} catch (Exception e) {
			session.getTransaction().rollback();
			return false;

		}

	}

	public static List<Custommer> getListCustomer(String Cusname) {
		List<Custommer> listCustomer = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {

			session.beginTransaction();

			String sql = "from Custommer ";

			if (Cusname.length() > 0) {
				sql += "where Cusname like '%" + Cusname + "%'";
			}
			System.out.println(sql);
			listCustomer = session.createQuery(sql).list();
			session.close();
			return listCustomer;

		} catch (Exception e) {

			return null;

		}

	}

}
