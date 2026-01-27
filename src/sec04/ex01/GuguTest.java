package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/guguTest")
public class GuguTest extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		int dan = Integer.parseInt(req.getParameter("dan"));
		
		out.print("<table border=1 width=800 align=center>");
			out.print("<tr bgcolor='#FFFF66' align=center>");
				out.print("<td colspan=2>"+dan+"</td>");
			out.print("</tr>");
			
			for (int i = 1; i < 10; i++) {
				out.print("<tr align=center>");
				out.print("<td width=400>"+ dan+" * "+ i +"</td>");
				out.print("<td width=400>" +(dan *i) + "</td>");
				out.print("</tr>");
				
			}
		out.print("</table>");
	
	
	
	
	}
}
