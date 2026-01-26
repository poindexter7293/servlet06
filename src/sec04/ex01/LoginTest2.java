package sec04.ex01;

import java.awt.Window;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginTest2")
public class LoginTest2 extends HttpServlet{

	@Override
	public void init() throws ServletException {
		System.out.println("init 호출");
	}
	@Override
	protected void doPost(HttpServletRequest req, 
						  HttpServletResponse resp)
						  throws ServletException, IOException {
	req.setCharacterEncoding("UTF-8");
	
	String uId = req.getParameter("user_id");
	String uPW = req.getParameter("user_pw");
	
	resp.setContentType("text/html; charset = UTF-8");
	
	PrintWriter out = resp.getWriter();
	
	if (uId.equals("admin")) {
		String data = "<html>";
		data += "<body>";
		data += "<font size='12'> 관리자 계정으로 로그인 하셨습니다.</font><br>";
		data += "<button>회원정보 수정</button>";
		data += "<button>회원정보 삭제</button>";
		data += "</body>";
		data += "</html>";
		out.print(data);
	} else {
	
	if (uId != null && (uId.length() != 0)) {
		String data = "<html>";
		data += "<body>";
		data += uId + "님이 로그인 하셨습니다.";
		data += "</body>";
		data += "</html>";
		out.print(data);
	}else {
		String data = "<html>";
		data += "<body>";
		data += "로그인에 실패하였습니다.<br>";
		data += "<a href = \"http://localhost:8090/pro06/test01/login.html\">다시 로그인 하러가기</a>";
		data += "</body>";
		data += "</html>";
		out.print(data);
			}
		}
	}

	@Override
	public void destroy() {
		System.out.println("destroy 호출");
	}


}
