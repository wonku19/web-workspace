package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.vo.UserDTO;
import model.dao.UserDAO;



@WebServlet("/SelectUserServlet")
public class SelectUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String num = request.getParameter("user_No");

		UserDAO dao = new UserDAO();
		UserDTO dto = null;
		
		if(num!=null) {
			try {
				dto= dao.findByNameMember(num);
				request.setAttribute("dto", dto);
				request.getRequestDispatcher("searchSuccess.jsp").forward(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			request.getRequestDispatcher("searchFail.jsp").forward(request, response);
		}
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
