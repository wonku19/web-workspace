package servlet.controller.component;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import servlet.controller.Controller;
import servlet.controller.ModelAndView;
import servlet.model.dao.MemberDAO;
import servlet.model.vo.MemberVO;

public class AllMemberController implements Controller{

	@Override
	public ModelAndView handle(HttpServletRequest request, HttpServletResponse response) throws Exception {		
		ArrayList<MemberVO> list=MemberDAO.getInstance().showAllMember();
//		request.setAttribute("list", list);
		HttpSession session = request.getSession();
		session.setAttribute("list", list);
		return new ModelAndView("views/allShow.jsp",true);
	}
	
}
