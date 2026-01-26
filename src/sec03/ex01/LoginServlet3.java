package sec03.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login3")
public class LoginServlet3 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, 
				HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		String data = "<html>";
		data += "<body>";
		data += "클라이언트가 입력한 아이디 : " + user_id + "<br>";
		data += "클라이언트가 입력한 비밀번호 : " + user_pw + "<br>";
		data += "</body>";
		data += "</html>";
		
		out.print(data);
		
	}
	
}
