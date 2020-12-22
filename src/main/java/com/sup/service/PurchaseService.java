package com.sup.service;

import java.util.List;

import com.sup.vo.PurchaseVO;

public interface PurchaseService {
	void purchase(int productId, String senderId, String recepientId);

	List<PurchaseVO> selectAllSend(String memberId);
	List<PurchaseVO> selectAllReceive(String memberId);
	
	void useGift(int purchaseId);
	void rejectGift(int purchaseId);
	
}
