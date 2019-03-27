package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ProductDAO;
import Model.Categories;
import Model.Product;

/**
 * Servlet implementation class ProductManagerController
 */
@WebServlet("/ProductManagerController")
public class ProductManagerController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
	String  rq = request.getParameter("action");
	if(rq.equals("sua")) {
		int pid = Integer.parseInt(request.getParameter("Pid"));
		String pname = request.getParameter("Pname");
		String note = request.getParameter("Note");
		int price = Integer.parseInt(request.getParameter("Price"));
		String picture = request.getParameter("Picture");
		String manhinh = request.getParameter("Manhinh");
		String cpu = request.getParameter("CPU");
		String hedieuhanh = request.getParameter("Hedieuhanh");
		String ram = request.getParameter("Ram");
		String bonhotrong = request.getParameter("Bonhotrong");
		Product pro = new Product(pid, pname, note, price, picture, manhinh, cpu, hedieuhanh, ram, bonhotrong);
		System.out.println(pro.toString());
		request.setAttribute("product", pro);
		RequestDispatcher rd = request.getRequestDispatcher("view/update-product.jsp");
		try {
			rd.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}else if(rq.equals("xoa")) {
		int pid = Integer.parseInt(request.getParameter("Pid"));
		ProductDAO proDAO = new ProductDAO();
		boolean rs = proDAO.deleteProduct(pid);
		request.setAttribute("rs", "Xóa Sản Phẩm thành công !");
		RequestDispatcher rd = request.getRequestDispatcher("showProductManagerController");
		try {
			rd.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
