package com.biz.iolist.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.iolist.mapper.IoMapper;
import com.biz.iolist.model.IoDTO;
import com.biz.iolist.model.IoDTO;
import com.biz.iolist.model.IoVO;

@Service
public class IoService {

	@Autowired
	SqlSession sqlSession;
	
	public List<IoVO> selectAllIO(){
		
		IoMapper ioMapper=sqlSession.getMapper(IoMapper.class);
		
		return ioMapper.selectAllIO();
	}
	
	public List<IoDTO> selectJoin(){
		
		IoMapper ioMapper=sqlSession.getMapper(IoMapper.class);
		
		return ioMapper.selectJoin();
	}

	public IoVO findByIOId(String io_id) {
		
		IoMapper ioMapper=sqlSession.getMapper(IoMapper.class);
		
		return ioMapper.findByIOId(io_id);
	}
	
	public int insertIO(IoVO ioVO) {
		
		IoMapper ioMapper=sqlSession.getMapper(IoMapper.class);
		
		ioVO.setIo_total(ioVO.getIo_price()*ioVO.getIo_quan());
		
		return ioMapper.insertIO(ioVO);
	}
	
	public int updateIO(IoVO ioVO) {
		
		IoMapper ioMapper=sqlSession.getMapper(IoMapper.class);
		
		ioVO.setIo_total(ioVO.getIo_price()*ioVO.getIo_quan());
		
		return ioMapper.updateIO(ioVO);
	}
	
	public int deleteIO(String io_id) {
		
		IoMapper ioMapper=sqlSession.getMapper(IoMapper.class);
		
		return ioMapper.deleteIO(io_id);
	}
	
}















