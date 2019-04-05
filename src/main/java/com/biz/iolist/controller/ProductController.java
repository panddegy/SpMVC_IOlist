package com.biz.iolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.biz.iolist.model.ProductVO;
import com.biz.iolist.model.SearchVO;
import com.biz.iolist.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String productList(Model model) {

		model.addAttribute("BODY", "PRODUCTLIST");
		model.addAttribute("LIST", productService.selectAllProduct());
		
		return "home";
	}
	
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public String productWrite(@ModelAttribute ProductVO productVO, Model model) {
		
		model.addAttribute("BODY", "PRODUCTWRITE");
		model.addAttribute("productVO", productVO);
		
		return "home";
	}
	
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String productWrite(@ModelAttribute ProductVO productVO) {
		
		productService.insertProduct(productVO);
		
		return "redirect:/";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String productUpdate(@ModelAttribute ProductVO productVO, Model model, @RequestParam String p_code) {
		
		model.addAttribute("BODY", "PRODUCTUPDATE");
		model.addAttribute("productVO", productService.findByProductId(p_code));
		
		return "home";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String productUpdate(@ModelAttribute ProductVO productVO) {
		
		productService.updateProduct(productVO);
		
		return "redirect:/";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String productDelete(@RequestParam String p_code) {
		
		productService.deleteProduct(p_code);
		
		return "redirect:/";
	}
}


















