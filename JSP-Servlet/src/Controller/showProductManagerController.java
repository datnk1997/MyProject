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

import org.hibernate.metamodel.relational.Size;

import DAO.ProductDAO;
import Model.Product;

/**
 * Servlet implementation class ProductManagerController
 */
@WebServlet("/showProductManagerController")
public class showProductManagerController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		List<Product> ls = new ArrayList<>();
		ProductDAO proDAO = new ProductDAO();
		ls = proDAO.getAllProduct();
		request.setAttribute("list", ls);
		RequestDispatcher rd = request.getRequestDispatcher("view/product-manager.jsp");
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
