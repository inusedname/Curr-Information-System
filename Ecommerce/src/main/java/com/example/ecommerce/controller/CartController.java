package com.example.ecommerce.controller;

import com.example.ecommerce.dao.CartDAO;
import com.example.ecommerce.model.Cart;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class CartController {
	@Autowired
	private CartDAO cartDAO;
	
	@RequestMapping(value="/cart")
	public String getCartInfo(Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		String user_id = (String) session.getAttribute("user_id");
		if (user_id == null) {
			return "redirect:/login?error=1";
		}
		List<Cart> listCart = cartDAO.getCartInfo(user_id);
		float totalPrice = 0; 
		for (Cart i: listCart) {
			totalPrice += i.getPrice();
		}
		model.addAttribute("total", totalPrice);
		model.addAttribute("listCart", listCart);
		model.addAttribute("username", (String) session.getAttribute("username"));
		return "cart";	
	}
	
	@RequestMapping(value = "/addCart/{id}/{quantity}/{price}", method = RequestMethod.GET)
	public String addToCart(@PathVariable String id, @PathVariable int quantity, @PathVariable float price, HttpServletRequest request) {
		HttpSession session = request.getSession();
		String user_id = (String) session.getAttribute("user_id");
		if (user_id == null) {
			return "redirect:/login?error=1";
		}
		String res = cartDAO.addToCart(id, quantity, price, user_id);
		if (res == null) {
			return "error";
		}
		return "redirect:/";
	}
	
	@RequestMapping(value = "/updateCart/{id}/{quantity}", method = RequestMethod.POST)
	public String updateCart(@PathVariable String id, @PathVariable int quantity, HttpServletRequest request) {
		HttpSession session = request.getSession();
		String user_id = (String) session.getAttribute("user_id");
		if (user_id == null) {
			return "redirect:/login";
		}
		String res = cartDAO.updateQuantity(id, quantity, user_id);
		if (res == null) {
			return "error";
		}
		return "redirect:/cart";
	}
	

	@RequestMapping(value="/removeCart/{id}/{quantity}", method = RequestMethod.POST)
	public String removeCart(@PathVariable String id, @PathVariable int quantity, HttpServletRequest request) {
		HttpSession session = request.getSession();
		String user_id = (String) session.getAttribute("user_id");
		if (user_id == null) {
			return "redirect:/login";
		}
		String res = cartDAO.remove(id, user_id, quantity);
		if (res == null) {
			return "error";
		}
		return "cart";
	}
}
