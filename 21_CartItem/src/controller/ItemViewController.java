package controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Item;
import model.ItemDAO;

public class ItemViewController implements Controller {

	@Override
	public ModelAndView handle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int id =  Integer.parseInt(request.getParameter("item_id"));		
		ItemDAO.getInstance().updateRecordCount(id);		
		
		// 오늘 본 상품정보를 저장하는 쿠키 로직
		// 1) 쿠키 생성
			
		Item item = ItemDAO.getInstance().getItem(id);	
		Cookie cookie = new Cookie("fruit-"+id,item.getPictureUrl());
		cookie.setMaxAge(24*60*60);
		
		
		
		// 2) 생성한 쿠키를 웹브라우저로 보냄
		response.addCookie(cookie);
				
	
		request.setAttribute("item", item);
		
		
		
		return new ModelAndView("itemView.jsp");			
	}

}
