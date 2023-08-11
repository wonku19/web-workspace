package servlet.controller.component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.controller.Controller;
import servlet.controller.ModelAndView;
import servlet.model.dao.MemberDAO;
import servlet.model.vo.MemberVO;

public class RegisterController implements Controller{

	@Override
	public ModelAndView handle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name= request.getParameter("name");
		String address= request.getParameter("address");
		
		MemberVO vo = new MemberVO(id,password,name,address);
		MemberDAO.getInstance().registerMember(vo);
		// 데이터 바인딩 - request, session, context
		// setAttribute / getAttribute
		// request <--- 범위가 가장 좁음. 
		// session <--- 로그인 ~ 로그아웃 
		// context <--- 안씀 ㅋㅋ 왜? 범위가 가장 넓음 근데 부화 걸릴 수 있음.		
		
		return new ModelAndView("index.jsp",true);
	}

	
	
}
