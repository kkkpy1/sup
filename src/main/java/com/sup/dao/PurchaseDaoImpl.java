package com.sup.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sup.vo.PurchaseVO;

@Repository("purchaseDao")
public class PurchaseDaoImpl implements PurchaseDao {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public void insert(int productId, String senderId, String recepientId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("productId", productId);       //INPUT Parameter
		map.put("senderId", senderId);   //INPUT Parameter
		map.put("recepientId", recepientId);   //INPUT Parameter
		this.sqlSession.insert("Purchase.insertSP", map);
	}
	@Override
	public List<PurchaseVO> selectAllSend(String memberId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("senderId", memberId);   //INPUT Parameter
		this.sqlSession.selectList("Purchase.selectAllSendSP", map);
		return (List<PurchaseVO>) map.get("result");
	}

	@Override
	public List<PurchaseVO> selectAllReceive(String memberId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("recepientId", memberId);   //INPUT Parameter
		this.sqlSession.selectList("Purchase.selectAllReceiveSP", map);
		return (List<PurchaseVO>) map.get("result");
	}
	@Override
	public void updateStateToUsed(int purchaseId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("purchaseId", purchaseId);   //INPUT Parameter
		this.sqlSession.update("Purchase.updateStateToUsedSP", map);
	}
	@Override
	public void updateStateToRejected(int purchaseId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("purchaseId", purchaseId);   //INPUT Parameter
		this.sqlSession.update("Purchase.updateStateToRejectedSP", map);
	}


}
