package com.sup.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sup.vo.ProductVO;

@Repository("productDao")
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private SqlSession sqlSession;
	

	@Override
	public List<ProductVO> selectAllProduct() {
		Map<String, Object> map = new HashMap<String, Object>();
		this.sqlSession.selectList("Product.selectAllSP", map);
		List<ProductVO> list = (List<ProductVO>)map.get("result");
		
		return (List<ProductVO>)map.get("result");
	}

	@Override
	public List<ProductVO> selectProductById(int productId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("productId", productId);   //INPUT Parameter
		this.sqlSession.selectList("Product.selectOneSP", map);
		return (List<ProductVO>) map.get("result");
	}

	@Override
	public List<ProductVO> selectProductByName(String productName) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("productName", productName);   //INPUT Parameter
		this.sqlSession.selectList("Product.selectProductByNameSP", map);
		return (List<ProductVO>) map.get("result");
	}
}
