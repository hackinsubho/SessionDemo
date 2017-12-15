package org.jspiders.logApp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/log")
public class LogController extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String name = req.getParameter("nm");
	HttpSession session = req.getSession();
	session.setAttribute("uname", name);
	RequestDispatcher rd = req.getRequestDispatcher("disp");
	rd.forward(req, resp);
	System.out.println(session);
	session.invalidate();

	/*System.out.println(session);
	session.invalidate();
	HttpSession session1 = req.getSession(false);
	System.out.println(session1);
	HttpSession session2 = req.getSession(true);
	System.out.println(session2); */

}
}
