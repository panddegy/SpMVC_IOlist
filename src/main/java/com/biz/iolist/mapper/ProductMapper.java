package com.biz.iolist.mapper;

import java.util.List;

import com.biz.iolist.model.ProductVO;

public interface ProductMapper {

	public List<ProductVO> selectAllProduct();
	
	public ProductVO findByProductId(String p_code);
	
	public int insertProduct(ProductVO productVO);
	
	public int updateProduct(ProductVO productVO);
	
	public int deleteProduct(String p_code);
	
	public List<ProductVO> findByProductName(String p_name);
	
}
