package com.biz.iolist.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.iolist.mapper.DeptMapper;
import com.biz.iolist.mapper.ProductMapper;
import com.biz.iolist.model.DeptVO;
import com.biz.iolist.model.ProductVO;

@Service
public class DeptService {

	@Autowired
	SqlSession sqlSession;
	
	public List<DeptVO> selectAllDept(){
		
		DeptMapper deptMapper=sqlSession.getMapper(DeptMapper.class);
		
		return deptMapper.selectAllDept();
	}
	
	public DeptVO findByDeptId(String d_code) {
		
		DeptMapper deptMapper=sqlSession.getMapper(DeptMapper.class);
		
		return deptMapper.findByDeptId(d_code);
	}
	
	public int insertDept(DeptVO deptVO) {
		
		DeptMapper deptMapper=sqlSession.getMapper(DeptMapper.class);
		
		return deptMapper.insertDept(deptVO);
	}
	
	public int updateDept(DeptVO deptVO) {
		
		DeptMapper deptMapper=sqlSession.getMapper(DeptMapper.class);
		
		return deptMapper.updateDept(deptVO);
	}
	
	public int deleteDept(String d_code) {
		
		DeptMapper deptMapper=sqlSession.getMapper(DeptMapper.class);
		
		return deptMapper.deleteDept(d_code);
	}
}












