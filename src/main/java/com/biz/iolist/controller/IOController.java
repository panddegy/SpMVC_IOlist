package com.biz.iolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.biz.iolist.model.IoVO;
import com.biz.iolist.model.SearchVO;
import com.biz.iolist.service.DeptService;
import com.biz.iolist.service.IoService;
import com.biz.iolist.service.ProductService;

@Controller
@RequestMapping("/io")
public class IOController {

	@Autowired
	IoService ioService;
	
	@Autowired
	ProductService productService;
	
	@Autowired
	DeptService deptService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String ioList(Model model) {
		
		model.addAttribute("BODY", "LIST");
		model.addAttribute("LIST", ioService.selectAllIO());
		
		return "home";
	}
	
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public String ioWrite(@ModelAttribute IoVO ioVO, Model model) {
		
		model.addAttribute("BODY", "IOWRITE");
		model.addAttribute("DEPTLIST", deptService.selectAllDept());
		model.addAttribute("PRODUCTLIST", productService.selectAllProduct());
		model.addAttribute("ioVO", ioVO);
		
		return "home";
	}
	
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String ioWrite(@ModelAttribute IoVO ioVO) {
		
		ioService.insertIO(ioVO);
		
		return "redirect:/";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String ioUpdate(@ModelAttribute IoVO ioVO, Model model, String io_id) {
		
		model.addAttribute("BODY", "IOUPDATE");
		model.addAttribute("DEPTLIST", deptService.selectAllDept());
		model.addAttribute("PRODUCTLIST", productService.selectAllProduct());
		model.addAttribute("ioVO", ioService.findByIOId(io_id));
		
		return "home";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String ioUpdate(@ModelAttribute IoVO ioVO) {
		
		ioService.updateIO(ioVO);
		
		return "redirect:/";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String ioDelete(@RequestParam String io_id) {
		
		ioService.deleteIO(io_id);
		
		return "redirect:/";
	}
	
	@RequestMapping(value="/selectdcode", method=RequestMethod.GET)
	public String selectDcode(Model model) {
		
		model.addAttribute("LIST", deptService.selectAllDept());
		
		return "select_dcode";
	}
	
	@RequestMapping(value="/selectpcode", method=RequestMethod.GET)
	public String selectPcode(Model model) {
		
		model.addAttribute("LIST", productService.selectAllProduct());
		
		return "select_pcode";
	}
	
	
}

























