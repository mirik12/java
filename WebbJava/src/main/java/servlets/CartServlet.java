package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controllers.ProductController;
import models.Cart;
import models.Product;

/**
 * Servlet implementation class CartServlet
 */
public class CartServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;
       
    public CartServlet() {

    }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    ProductController pc = new ProductController();
    String productID = request.getParameter("id");
    Product product = pc.getProductByID(Integer.parseInt(productID));
    HttpSession session = request.getSession();
    Cart cart = null;
    if(session.getAttribute("cart")==null) {
      cart = new Cart();
    } else {
      cart = (Cart) session.getAttribute("cart");
    }
    
    cart.addProduct(product);
    session.setAttribute("cart", cart);
    response.sendRedirect("/product");
  }

}