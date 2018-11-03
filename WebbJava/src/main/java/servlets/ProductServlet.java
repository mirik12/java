package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controllers.ProductController;
import models.Product;

/**
 * Servlet implementation class ProductServlet
 */
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProductServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher rd = null;
		ProductController pc = new ProductController();

		String id = request.getParameter("id");
		if (id != null) {
			rd = request.getRequestDispatcher("/WEB-INF/views/product.jsp");
			try {
				int idI = Integer.parseInt(id);
				Product product = pc.getProductByID(idI);
				request.setAttribute("product", product);
			} catch (Exception ex) {

			}
		} else {
			List<Product> products = pc.getProducts();
			request.setAttribute("products", products);
			rd = request.getRequestDispatcher("/WEB-INF/views/products.jsp");
		}
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = null;
		ProductController pc = new ProductController();
		String category = request.getParameter("category");
		int categoryID = Integer.parseInt(category);
			List<Product> products = pc.getProductsByCategory(categoryID);
			request.setAttribute("products", products);
			rd = request.getRequestDispatcher("/WEB-INF/views/products.jsp");
		
		rd.forward(request, response);
	}

}
