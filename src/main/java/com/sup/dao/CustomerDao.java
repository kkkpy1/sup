package com.sup.dao;

import java.util.List;

import com.sup.vo.CustomerVO;

public interface CustomerDao {
	//
	void insertUser(CustomerVO customerVO);
	int loginUser(String userid, String passwd);
	List<String> findIdByPhone(String name, String phone);
	List<String> findIdByEmail(String name, String email);
	int findPasswordByPhone(String userid, String name, String phone);
	int findPasswordByEmail(String userid, String name, String email);
	List<CustomerVO> selectUserByName(String memberName);
	void insertFriends(String memberId, String friendId);
	List<CustomerVO> selectFriends(String memberId);
	List<CustomerVO> selectUserById(String memberId);
}
