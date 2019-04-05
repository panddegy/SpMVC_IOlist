package com.biz.iolist.mapper;

import java.util.List;

import com.biz.iolist.model.IoVO;

public interface IoMapper {

	public List<IoVO> selectAllIO();

	public IoVO findByIOId(String io_id);
	
	public int insertIO(IoVO ioVO);
	
	public int updateIO(IoVO ioVO);
	
	public int deleteIO(String io_id);
	
}
