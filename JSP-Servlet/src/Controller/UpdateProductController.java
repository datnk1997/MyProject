package Controller;

import java.io.IOException;

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
 * Servlet implementation class UpdateProductController
 */
@WebServlet("/UpdateProductController")
public class UpdateProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductDAO proDAO = new ProductDAO();
		Product pro = null;
		int pid = Integer.parseInt(request.getParameter("Pid"));
		String cid = request.getParameter("Cid");
		String pname = request.getParameter("Pname");
		String note = request.getParameter("Note");
		int price = Integer.parseInt(request.getParameter("Price"));
		String picture = request.getParameter("Picture");
		String manhinh = request.getParameter("Manhinh");
		String cpu = request.getParameter("CPU");
		String hedieuhanh = request.getParameter("Hedieuhanh");
		String ram = request.getParameter("Ram");
		String bonhotrong = request.getParameter("Bonhotrong");
		if(cid.equals("Iphone")) {
			Categories cate = new Categories(1, "Iphone");
			pro = new Product(pid,cate, pname, note, price,"themes/images/ladies/"+picture, manhinh, cpu, hedieuhanh, ram, bonhotrong);
			boolean rs = proDAO.updateProduct(pro);
			if(rs==true) {
				request.setAttribute("ms", "Update sản phẩm thành công");
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
			}
		}else if(cid.equals("Sam Sung")) {
			Categories cate = new Categories(2, "SamSung");
			pro = new Product(pid,cate, pname, note, price,"themes/images/ladies/"+picture, manhinh, cpu, hedieuhanh, ram, bonhotrong);
			boolean rs = proDAO.updateProduct(pro);
			if(rs==true) {
				request.setAttribute("ms", "Update sản phẩm thành công");
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
			}
		}else if(cid.equals("Sony")) {
			Categories cate = new Categories(3, "Sony");
			pro = new Product(pid,cate, pname, note, price,"themes/images/ladies/"+picture, manhinh, cpu, hedieuhanh, ram, bonhotrong);
			boolean rs = proDAO.updateProduct(pro);
			if(rs==true) {
				request.setAttribute("ms", "Update sản phẩm thành công");
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
			}
		}else if(cid.equals("Oppo")) {
			Categories cate = new Categories(4, "Oppo");
			pro = new Product(pid,cate, pname, note, price,"themes/images/ladies/"+picture, manhinh, cpu, hedieuhanh, ram, bonhotrong);
			boolean rs = proDAO.updateProduct(pro);
			if(rs==true) {
				request.setAttribute("ms", "Update sản phẩm thành công");
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
