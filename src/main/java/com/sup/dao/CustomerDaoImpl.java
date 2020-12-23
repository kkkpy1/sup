package com.sup.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sup.vo.CustomerVO;

@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private SqlSession sqlSession;


	@Override
	public void insertUser(CustomerVO customerVO) {
		this.sqlSession.insert("Customer.insertSP",customerVO);

	}


	@Override
	public int loginUser(String userid, String passwd) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("memberId", userid);       //INPUT Parameter
		map.put("memberPassword", passwd);   //INPUT Parameter
		this.sqlSession.selectList("Customer.loginSP", map);
		//log.info("result = " + map.get("result"));
		return (Integer)map.get("result");
	}

	@Override
	public List<String> findIdByPhone(String name, String phone) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("memberName", name);       //INPUT Parameter
		map.put("memberPhone", phone);   //INPUT Parameter
		this.sqlSession.selectList("Customer.findIdByPhoneSP", map);
		List<String> list = (List<String>)map.get("result");
		return (List<String>)map.get("result");
	}

	@Override
	public List<String> findIdByEmail(String name, String email) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("memberName", name);       //INPUT Parameter
		map.put("memberEmail", email);   //INPUT Parameter
		this.sqlSession.selectList("Customer.findIdByEmailSP", map);
		List<String> list = (List<String>)map.get("result");
		return (List<String>)map.get("result");
	}

	@Override
	public int findPasswordByPhone(String userid, String name, String phone) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("memberId", userid);       //INPUT Parameter
		map.put("memberName", name);       //INPUT Parameter
		map.put("memberPhone", phone);   //INPUT Parameter
		this.sqlSession.selectList("Customer.findPasswordByPhoneSP", map);
		return (Integer)map.get("result");
	}

	@Override
	public int findPasswordByEmail(String userid, String name, String email) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("memberId", userid);       //INPUT Parameter
		map.put("memberName", name);       //INPUT Parameter
		map.put("memberEmail", email);   //INPUT Parameter
		this.sqlSession.selectList("Customer.findPasswordByEmailSP", map);
		return (Integer)map.get("result");
	}

	@Override
	public List<CustomerVO> selectUserByName(String memberName) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("memberName", memberName);       //INPUT Parameter
		this.sqlSession.selectList("Customer.selectUserByNameSP", map);
		return (List<CustomerVO>)map.get("result");
	}


	@Override
	public void insertFriends(String memberId, String friendId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("memberId", memberId);       //INPUT Parameter
		map.put("friendId", friendId);       //INPUT Parameter
		this.sqlSession.insert("Customer.insertFriendsSP", map);
		
	}


	@Override
	public List<CustomerVO> selectFriends(String memberId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("memberId", memberId);       //INPUT Parameter
		this.sqlSession.selectList("Customer.selectFriendsSP", map);
		return (List<CustomerVO>)map.get("result");
	}


	@Override
	public List<CustomerVO> selectUserById(String memberId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("memberId", memberId);       //INPUT Parameter
		this.sqlSession.selectList("Customer.selectUserByIdSP", map);
		return (List<CustomerVO>)map.get("result");
	}

}
