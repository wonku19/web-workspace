package servlet.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HttpFormServlet
 */
public class HttpFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 한글처리..양방향 처리 해야함!
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String id = request.getParameter("userId");
		String password = request.getParameter("userPwd");
		String[] menuList = request.getParameterValues("menu");
		String gender = request.getParameter("gender");
		
		PrintWriter out = response.getWriter();
		out.println("<h2>정보를 출력합니다...</h2>");
		out.println("<p>당신의 아이디는" + id + "</p>");
		out.println("<p>당신의 비밀번호는" + password + "</p>");
		
		// 당신의 성별은 --> form.html 에서 라디오 사용하기
		// 3항연산자 사용해서 M과 F를 남자 여자로 출력시키기
		out.println("<p>당신의 성별은 " + (gender.charAt(0) == 'M' ? "남자" : "여자") + "</p>");
				
		out.println("<ul>");
		for(int i=0; i<menuList.length; i++) {
			out.println("<li>" + menuList[i] + "</li>");			
		}
//		for(String menu : menuList) {
//			out.println("<li>" + menu + "</li>");
//		}
		out.println("</ul>");
		
		out.close();
	}

}
