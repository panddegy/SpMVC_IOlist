package com.biz.iolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.biz.iolist.model.DeptVO;
import com.biz.iolist.model.ProductVO;
import com.biz.iolist.service.DeptService;
import com.biz.iolist.service.ProductService;

@RestController
public class IORestController {

	@Autowired
	DeptService deptService;
	
	@Autowired
	ProductService productService;
	
	@RequestMapping(value="deptsearch", method=RequestMethod.GET, produces="html/text;charset=utf8")
	public String deptSearch(@RequestParam String d_code) {
	
		DeptVO deptVO=deptService.findByDeptId(d_code);
		
		return deptVO.getD_name();
	}
	
	@RequestMapping(value="productsearch", method=RequestMethod.GET, produces="html/text;charset=utf8")
	public String productSearch(@RequestParam String p_code) {
	
		ProductVO productVO=productService.findByProductId(p_code);
		
		return productVO.getP_name();
	}
	
	/*
	@RequestMapping(value="/selectdcode", method=RequestMethod.POST, produces="html/text;charset=utf8")
	public List<DeptVO> selectDcode(@RequestParam String d_name) {
		
		return deptService.findByDeptName(d_name);
		
	}
	*/
}

















