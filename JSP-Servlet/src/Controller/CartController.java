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

import DAO.CartDAO;
import Model.CartDetail;
import Model.Product;

/**
 * Servlet implementation class CartController
 */
@WebServlet("/CartController")
public class CartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private CartDAO cartDAO = new CartDAO();
	protected void doGet(HttpServletRequest request, HttpServletResponse response)  {
		String action = request.getParameter("action");
		if("addtocart".equals(action)) {
			int Pid = Integer.parseInt(request.getParameter("Pid"));
			int price = Integer.parseInt(request.getParameter("price"));
			int qty = Integer.parseInt(request.getParameter("Quantity"));
			int total = price * qty;
			Product product = new Product();
			product.setPid(Pid);
			CartDetail Cdetail = new CartDetail(product, total, qty);
			boolean rs = cartDAO.save(Cdetail);
			List<CartDetail> cartDetails = cartDAO.getCartDetail(1);
			request.setAttribute("carts", cartDetails);
			int totalPrice = cartDAO.caculator(cartDetails);
			request.setAttribute("totalPrice", totalPrice);
			RequestDispatcher rd = request.getRequestDispatcher("view/cart.jsp");
			try {
				rd.forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if("delete".equals(action)) {
			int CDid = Integer.parseInt(request.getParameter("CDid"));
			cartDAO.deleteCartDetail(CDid);
			request.setAttribute("Ms", "Deleted");
			List<CartDetail> cartDetails = cartDAO.getCartDetail(1);
			request.setAttribute("carts", cartDetails);
			int totalPrice = cartDAO.caculator(cartDetails);
			request.setAttribute("totalPrice", totalPrice);
			RequestDispatcher rd = request.getRequestDispatcher("view/cart.jsp");
			try {
				rd.forward(request, response);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}else if("checkout".equals(action)) {
			RequestDispatcher rd = request.getRequestDispatcher("view/checkout.jsp");
			try {
				rd.forward(request, response);
			} catch (Exception e) {
				// TODO: handle exception
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
