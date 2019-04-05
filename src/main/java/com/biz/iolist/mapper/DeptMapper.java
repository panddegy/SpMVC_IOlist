package com.biz.iolist.mapper;

import java.util.List;

import com.biz.iolist.model.DeptVO;
import com.biz.iolist.model.IoVO;

public interface DeptMapper {

	public List<DeptVO> selectAllDept();
	
	public DeptVO findByDeptId(String d_code);
	
	public int insertDept(DeptVO deptVO);
	
	public int updateDept(DeptVO deptVO);
	
	public int deleteDept(String d_code);
}
