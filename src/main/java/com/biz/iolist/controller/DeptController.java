package com.biz.iolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.biz.iolist.model.DeptVO;
import com.biz.iolist.model.SearchVO;
import com.biz.iolist.service.DeptService;

@Controller
@RequestMapping("/dept")
public class DeptController {

	@Autowired
	DeptService deptService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String deptList(Model model) {
		
		model.addAttribute("BODY", "DEPTLIST");
		model.addAttribute("LIST", deptService.selectAllDept());
		
		return "home";
	}
	
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public String deptWrite(@ModelAttribute DeptVO deptVO, Model model) {
		
		model.addAttribute("BODY", "DEPTWRITE");
		model.addAttribute("deptVO", deptVO);
		
		return "home";
	}
	
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String deptWrite(@ModelAttribute DeptVO deptVO) {

		deptService.insertDept(deptVO);
		
		return "redirect:/";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String deptUpdate(@ModelAttribute DeptVO deptVO, Model model, @RequestParam String d_code) {
		
		model.addAttribute("BODY", "DEPTUPDATE");
		model.addAttribute("deptVO", deptService.findByDeptId(d_code));
		
		return "home";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String deptUpdate(@ModelAttribute DeptVO deptVO) {
		
		deptService.updateDept(deptVO);
		
		return "redirect:/";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String deptDelete(@RequestParam String d_code) {
		
		deptService.deleteDept(d_code);
		
		return "redirect:/";
	}
	
}





