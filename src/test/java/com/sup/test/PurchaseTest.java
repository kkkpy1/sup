package com.sup.test;


import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.sup.dao.PurchaseDao;
import com.sup.service.PurchaseService;
import com.sup.vo.PurchaseVO;

import lombok.extern.java.Log;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log
class PurchaseTest {
	@Autowired
	private SqlSession sqlSession;

	@Autowired
	private PurchaseService purchaseService;
	
	@Autowired
	private PurchaseDao purchaseDao;
	
	@Disabled @Test
	void test() {
		assertNotNull(sqlSession);
		assertNotNull(purchaseDao);
	}
	
	
	@Disabled @Test
	void insertOne() { // 1개 구매하기 (구매테이블에 넣기) 성공
		int productId = 2;
		String senderId = "customer3";
		String recepientId = "customer2";
		this.purchaseService.purchase(productId, senderId, recepientId);
	}
	
	@Disabled @Test
	void selectSendAndReceive() { // 보낸 상품, 받은상품 목록 가져오기 성공
		String senderId= "customer1";
		List<PurchaseVO> list = this.purchaseService.selectAllSend(senderId);
		for (int i = 0; i < list.size(); i++) {
			log.info(list.get(i).getProductName());
			log.info(list.get(i).getPurchaseState());
		}
		String recepientId= "customer2";
		List<PurchaseVO> list2 = this.purchaseService.selectAllReceive(recepientId);
		for (int i = 0; i < list2.size(); i++) {
			log.info(list2.get(i).getPurchaseDate());
			System.out.println(list2.get(i).getPurchaseId());
		}
	}
	
	@Disabled @Test
	void updateState() { // 상품 사용하기, 거절하기 성공 (state 0->1, 0->2)
		int purchaseId1 = 21;
		int purchaseId2 = 1;
		this.purchaseService.useGift(purchaseId1);
		this.purchaseService.rejectGift(purchaseId2);
	}
	

}
