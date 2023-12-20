package com.example.ecommerce.controller;

import java.io.IOException;
import java.util.List;

import com.example.ecommerce.dao.ProductDAO;
import com.example.ecommerce.model.Product;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
	@Autowired
	private ProductDAO productDAO;
	
	@RequestMapping(value="/")
	public String listProduct(Model model, HttpServletRequest request) throws IOException{
		HttpSession session = request.getSession();
		String user_id = (String) session.getAttribute("user_id");
		int role = (int) session.getAttribute("role");
		if (user_id == null) {
			return "redirect:/login?error=1";
		}
		List<Product> listProduct = productDAO.getList();
		model.addAttribute("listProduct", listProduct);
		model.addAttribute("role", role);
		return "home";
	}
	
	@RequestMapping(value="/search", method = RequestMethod.GET)
	public String searchProduct(@RequestParam("keyword") String keyword, Model model) throws IOException{
		List<Product> listProduct = productDAO.searchProduct(keyword);
		model.addAttribute("listProduct", listProduct);
		return "home";
	}
	
	@RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
	public String editContact(@PathVariable String id, Model model) {
		Product product = productDAO.getDetail(id);
		model.addAttribute("product", product);
		return "detail";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addProductForm() {
		return "addproduct";
	}
	
	@RequestMapping(value = "/add/{type}", method = RequestMethod.GET)
	public String addProduct(@PathVariable String type, Model model) {
		if (type == "book") {
			
		}
		else if (type == "clothes") {
			
		}
		else if (type == "mobile") {
			
		}
		return "error";
	}
}
