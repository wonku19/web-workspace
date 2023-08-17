package controller;

import java.util.ArrayList;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Item;
import model.ItemDAO;

public class ItemListController implements Controller{

	@Override
	public ModelAndView handle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ArrayList<Item> item = ItemDAO.getInstance().getAllItem();
		request.setAttribute("item", item);		
		ArrayList<String> fruits = new ArrayList<>();
		Cookie[] cookie = request.getCookies();
		if(cookie!=null) {
			for (Cookie c : cookie) {
				if(c.getName().startsWith("fruit-")) {
						fruits.add(c.getValue());
				}
			}
		}		
		
		request.setAttribute("fruits", fruits);


		return new ModelAndView("itemList.jsp");
		
	}

}
