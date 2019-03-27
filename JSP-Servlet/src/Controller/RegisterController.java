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
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import DAO.CustommerDAO;
import DAO.ProductDAO;
import Model.Custommer;
import Model.Product;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) {

		// String uname = request.getParameter("Uname");
		// String pword = request.getParameter("Pword");
		// CustommerDAO cusDAO = new CustommerDAO();
		// Custommer cus = cusDAO.loginAccount(uname);
		// if(cus.getUname().equals(uname) || cus.getPword().equals(pword)) {
		// request.setAttribute("custommer", cus);
		// RequestDispatcher rd = request.getRequestDispatcher("view/index.jsp");
		// try {
		// rd.forward(request, response);
		// } catch (ServletException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }else {
		// request.setAttribute("error", "sai tai khoan hoac mat khau");
		// RequestDispatcher rd = request.getRequestDispatcher("view/register.jsp");
		// try {
		// rd.forward(request, response);
		// } catch (ServletException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }

		String uname = request.getParameter("Uname");
		String pword = request.getParameter("Pword");
		CustommerDAO cusDAO = new CustommerDAO();
		HttpSession httpSession = request.getSession();
		boolean rs = cusDAO.checkLogin(uname, pword);
		if (rs == true) {
			httpSession.setAttribute("custommer", "Xin Chào : " + uname);
			RequestDispatcher rd = request.getRequestDispatcher("view/index.jsp");
			try {
				List<Product> ls = new ArrayList<>();
				ProductDAO proDAO = new ProductDAO();
				ls = proDAO.showProduct(0, 9);
				request.setAttribute("list", ls);
				rd.forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} /*
			 * else if(rs=false){ request.setAttribute("error",
			 * "Tai Khoan hoac mat khac khong chinh xac"); RequestDispatcher rd =
			 * request.getRequestDispatcher("view/register.jsp"); try { rd.forward(request,
			 * response); } catch (ServletException e) { // TODO Auto-generated catch block
			 * e.printStackTrace(); } catch (IOException e) { // TODO Auto-generated catch
			 * block e.printStackTrace(); } }
			 */else if (uname.equals("admin") && pword.equals("12345")) {
			RequestDispatcher rd = request.getRequestDispatcher("view/add-product.jsp");
			try {
				rd.forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			request.setAttribute("error", "Tai Khoan hoac mat khac khong chinh xac");
			RequestDispatcher rd = request.getRequestDispatcher("view/register.jsp");
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
