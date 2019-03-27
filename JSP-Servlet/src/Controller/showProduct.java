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
import Model.Product;

/**
 * Servlet implementation class showProduct
 */
@WebServlet("")
public class showProduct extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)  {
		List<Product> ls = new ArrayList<>();
		ProductDAO proDAO = new ProductDAO();
		ls = proDAO.showProduct(0, 9);
		request.setAttribute("list", ls);
		RequestDispatcher rd = request.getRequestDispatcher("view/index.jsp");
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
