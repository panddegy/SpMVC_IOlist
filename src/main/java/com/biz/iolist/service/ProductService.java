package com.biz.iolist.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.iolist.mapper.ProductMapper;
import com.biz.iolist.model.ProductVO;

@Service
public class ProductService {

	@Autowired
	SqlSession sqlSession;
	
	public List<ProductVO> selectAllProduct(){
		
		ProductMapper productMapper=sqlSession.getMapper(ProductMapper.class);
		
		return productMapper.selectAllProduct();
	}
	
	public ProductVO findByProductId(String p_code) {
		
		ProductMapper productMapper=sqlSession.getMapper(ProductMapper.class);
		
		return productMapper.findByProductId(p_code);
	}
	
	public int insertProduct(ProductVO productVO) {
		
		ProductMapper productMapper=sqlSession.getMapper(ProductMapper.class);
		
		return productMapper.insertProduct(productVO);
	}
	
	public int updateProduct(ProductVO productVO) {
		
		ProductMapper productMapper=sqlSession.getMapper(ProductMapper.class);
		
		return productMapper.updateProduct(productVO);
	}
	
	public int deleteProduct(String p_code) {
		
		ProductMapper productMapper=sqlSession.getMapper(ProductMapper.class);
		
		return productMapper.deleteProduct(p_code);
	}
}















