package com.sup.dao;

import java.util.List;

import com.sup.vo.ProductVO;

public interface ProductDao {
	List<ProductVO> selectAllProduct();

	List<ProductVO> selectProductById(int productId);

	List<ProductVO> selectProductByName(String productName);
}
