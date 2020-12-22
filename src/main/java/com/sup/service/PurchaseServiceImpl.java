package com.sup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sup.dao.PurchaseDao;
import com.sup.vo.PurchaseVO;

@Service("purchaseService")
public class PurchaseServiceImpl implements PurchaseService {
	@Autowired
	private PurchaseDao purchaseDao;

	@Override
	public void purchase(int productId, String senderId, String recepientId) {
		this.purchaseDao.insert(productId, senderId, recepientId);
	}
	@Override
	public List<PurchaseVO> selectAllSend(String memberId) {
		return this.purchaseDao.selectAllSend(memberId);
	}

	@Override
	public List<PurchaseVO> selectAllReceive(String memberId) {
		return this.purchaseDao.selectAllReceive(memberId);
	}
	@Override
	public void useGift(int purchaseId) {
		this.purchaseDao.updateStateToUsed(purchaseId);
	}
	@Override
	public void rejectGift(int purchaseId) {
		this.purchaseDao.updateStateToRejected(purchaseId);
	}


}
