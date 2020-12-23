package com.sup.service;

import java.util.List;

import com.sup.vo.ProductVO;

public interface ProductService {
	List<ProductVO> selectAllProduct();
	List<ProductVO> selectProductById(int productId);
	List<ProductVO> selectProductByName(String productName);
	
}
