package com.sup.dao;

import java.util.List;

import com.sup.vo.PurchaseVO;

public interface PurchaseDao {

	void insert(int productId, String senderId, String recepientId);

	List<PurchaseVO> selectAllSend(String memberId);

	List<PurchaseVO> selectAllReceive(String memberId);

	void updateStateToUsed(int purchaseId);

	void updateStateToRejected(int purchaseId);

	
}
