package DAO;

import java.util.ArrayList;
import java.util.List;

import Model.CartDetail;
import Model.Categories;
import Model.Custommer;
import Model.Product;

public class tesst {

//	public static void main(String[] args) {
//		CustommerDAO cusDAO = new CustommerDAO();
//		List<Custommer> ls = cusDAO.getListCustomer("dat");
//		System.out.println(ls);
//	}
//	public static void main(String[] args) {
//		List<Product> ls = new ArrayList<>();
//		ProductDAO proDAO = new ProductDAO();
//		ls = proDAO.getProductByCid(1);
//		System.out.println(ls);
//		
//	}
	/*public static void main(String[] args) {
		CustommerDAO cusDAO = new CustommerDAO();
		Custommer cus = new Custommer("datnkph11111", "test", "khac dat", "hanoi", "09898098");
		boolean rs = cusDAO.saveAccount(cubs);
		System.out.println(rs);
	}*/
	/*public static void main(String[] args) {
		CustommerDAO cusDAO = new CustommerDAO();
		boolean rs = cusDAO.checkLogin("asd", "123");
		System.out.println(rs);
	}*/
/*	public static void main(String[] args) {
		ProductDAO proDAO = new ProductDAO();
		List<Product> ls = null;
		List<Product> ls2 = null;
		ls= proDAO.showProduct(0,4);
		ls2= proDAO.showProduct(4,4);
		System.out.println(ls.toString());
		System.out.println(ls.size());
		System.out.println(ls2.toString());
		System.out.println(ls2.size());
	}*/
	/*public static void main(String[] args) {
		ProductDAO proDAO = new ProductDAO();
		Categories cate = new Categories(1, "Iphone");
		
		Product pro = new Product(cate, "Iphone X1", "99%", 10, "themes/images/ladies/"+"ip6.jpg", "5,5", "Ax", "IOS", "6gb", "128GB");
		boolean ls = proDAO.insertProduct(pro);
		System.out.println(ls);
		
	}*/
	public static void main(String[] args) {
		CartDAO cartDAO = new CartDAO();
		System.out.println(cartDAO.deleteCartDetail(33));
		
	}
	
}
