package sec03.ex03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login5")
public class LoginServlet5 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			doHandle(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			doHandle(req, resp);
	}

	protected void doHandle(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			req.setCharacterEncoding("UTF-8");

			String id = req.getParameter("user_id");
			String pw =	req.getParameter("user_pw");
			String address = req.getParameter("user_address");
			
			resp.setContentType("text/html; charset = UTF-8");
			
			PrintWriter out = resp.getWriter();
			
			String data = "<html>";
			data += "<body>";
			data += "클라이언트가 입력한 아이디 : " + id + "<br>";
			data += "클라이언트가 입력한 비밀번호 : " + pw + "<br>";
			data += "히든 주소 : " + address + "<br>";
			data += "</body>";
			data += "</html>";
			
			out.print(data);
	}

	
}
