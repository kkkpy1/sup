package com.sup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sup.dao.ProductDao;
import com.sup.vo.ProductVO;

@Service("productService")
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao productDao;

	@Override
	public List<ProductVO> selectAllProduct() {
		return this.productDao.selectAllProduct();
	}

	@Override
	public List<ProductVO> selectProductById(int productId) {
		return this.productDao.selectProductById(productId);
	}

	@Override
	public List<ProductVO> selectProductByName(String productName) {
		return this.productDao.selectProductByName(productName);
	}

}
