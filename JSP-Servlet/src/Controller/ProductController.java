package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ProductDAO;
import Model.Product;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/products")
public class ProductController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		int rq = Integer.parseInt(request.getParameter("category"));
		ProductDAO DAO = new ProductDAO();
			List<Product> list = DAO.getProductByCid(rq);
			request.setAttribute("ls", list);
			RequestDispatcher rd = request.getRequestDispatcher("view/products.jsp");
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
