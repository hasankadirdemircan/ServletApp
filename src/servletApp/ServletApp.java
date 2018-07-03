package servletApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;

public class ServletApp extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@GET
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String input = req.getParameter("input");
		ReverseAction reverseAction = new ReverseAction();
		String reversed = reverseAction.reverseMethod(input);
		PrintWriter pw = resp.getWriter();
		pw.print("<html><body> <h2>" + reversed + "</h2>");
		pw.print("</body></html>");
		
	}
	
}
