package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FirstServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		
		String n=req.getParameter("username");
		writer.print("Welcome "+n);
		
		HttpSession session=req.getSession();
		session.setAttribute("uname", n);
		
		writer.print("<a href='servlet2'>Visit</a>");
		writer.close();
	}
}
