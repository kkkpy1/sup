package com.sup.test;


import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.sup.dao.ProductDao;
import com.sup.service.ProductService;
import com.sup.vo.ProductVO;

import lombok.extern.java.Log;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log
class ProductTest {
	@Autowired
	private SqlSession sqlSession;

	@Autowired
	private ProductService productService;
	
	@Autowired
	private ProductDao productDao;
	
	@Test
	void test() {
		assertNotNull(sqlSession);
		assertNotNull(productService);
	}
	
	@Disabled @Test
	void selectAll() { // 상품목록 가져오기 성공
		List<ProductVO> list = this.productService.selectAllProduct();
		if(list.isEmpty()) System.out.println("상품이 없습니다.");
		else {
			System.out.println("상품목록은 아래와 같습니다.");
			for (int i = 0; i < list.size(); i++) {
				ProductVO productVO = list.get(i);
				System.out.println(productVO.getProductName());
			}
		}
	}
	
	@Disabled @Test
	void selectOne() { // 상품 1개 가져오기
		int productId = 2;
		List<ProductVO> list = this.productService.selectProductById(productId);
		if(list.isEmpty()) System.out.println("상품이 없습니다.");
		else {
			System.out.println("상품목록은 아래와 같습니다.");
			for (int i = 0; i < list.size(); i++) {
				ProductVO productVO = list.get(i);
				System.out.println(productVO.getProductName());
			}
		}

	}
	
	@Disabled @Test
	void selectByName() { // 이름으로 상품목록 가져오기. LIKE문 이용해서 포함돼있으면 다가져온다
		String productName = "테스트";
		List<ProductVO> list = this.productService.selectProductByName(productName);
		if(list.isEmpty()) System.out.println("상품이 없습니다.");
		else {
			System.out.println("상품목록은 아래와 같습니다.");
			for (int i = 0; i < list.size(); i++) {
				ProductVO productVO = list.get(i);
				log.info(productVO.getProductName());
			}
		}

	}

}
