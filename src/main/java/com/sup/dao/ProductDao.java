package com.sup.dao;

import java.util.List;

import com.sup.vo.ProductVO;

public interface ProductDao {
	List<ProductVO> selectAllProduct();

	List<ProductVO> selectOneProduct(int productId);

}
