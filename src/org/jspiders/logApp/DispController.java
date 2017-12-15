package org.jspiders.logApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/disp")
public class DispController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession(false);
		session.setMaxInactiveInterval(2);
		String nm = (String) session.getAttribute("uname");
		String out = "<html><body>welcome "+nm+"</body></html>";
		PrintWriter pw = resp.getWriter();
		pw.println(out);
		
	}
	
}
