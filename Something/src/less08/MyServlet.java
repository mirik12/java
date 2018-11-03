package web;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import web.*;

public class MyServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ConfigReader cr = new ConfigReader();
	Config conf = cr.getConfig();
	MySQLConnector conn = new MySQLConnector(conf);
	LoginController lc = new LoginController(conn.getStatement());
	boolean form = true;
	@Override
	protected void doGet(HttpServletRequest req,
            HttpServletResponse resp)
     throws ServletException,
            java.io.IOException{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		HttpSession session = req.getSession();
		if(req.getParameter("logout")!=null){
			session.invalidate();
			session = req.getSession();
			form = true;
		}
		if(session.getAttribute("email")==null) {
		if(form) {
		out.write("<html><form method='post' action=''>\r\n" + 
				"<table>\r\n" + 
				"<tr><td>Login:</td><td><input type='text' name='login'/></td></tr>\r\n" + 
				"<tr><td>Password:</td><td><input type='text' name='password'/></td></tr>\r\n" + 
				"<tr><td></td><td><input type='submit' value='send' /></td></tr>\r\n" + 
				"</table>\r\n" + 
				"</form></html");
		}
		} else {
			out.write("<hr><a href='?logout'>LOGOUT</a><hr>");
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req,
            HttpServletResponse resp)
     throws ServletException,
            java.io.IOException{
		resp.setContentType("text/html");
		
		String email = req.getParameter("login");
		String password = req.getParameter("password");
		PrintWriter out = resp.getWriter();

		
		if(email!=null) {
			if(lc.login(email,password)) {
				HttpSession session = req.getSession();
				session.setAttribute("email", email);
				out.write("Access Granded");
				form = false;
				doGet(req,resp);
			} else {
				
				doGet(req,resp);
				out.write("Access Denied");
			}
		}
	}

}
