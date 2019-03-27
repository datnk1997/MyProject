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
 * Servlet implementation class FaceController
 */
@WebServlet("/FaceController")
public class FaceController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)  {
		String rq = request.getParameter("stt");
		if(rq.equals("1")) {
			RequestDispatcher rd = request.getRequestDispatcher("");
			try {
				rd.forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(rq.equals("2")) {
			ProductDAO proDAO = new ProductDAO();
			List<Product> ls = proDAO.showProduct(10, 9);
			request.setAttribute("list", ls);
			RequestDispatcher rd = request.getRequestDispatcher("");
			try {
				rd.forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(rq.equals("3")) {
			ProductDAO proDAO = new ProductDAO();
			List<Product> ls = proDAO.showProduct(20, 9);
			request.setAttribute("list", ls);
			RequestDispatcher rd = request.getRequestDispatcher("");
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
