package com.sup.service;

import java.util.List;

import com.sup.vo.CustomerVO;

public interface CustomerService {
	void create(CustomerVO customerVO);
	int login(String userid, String passwd);
	List<String> findIdByPhone(String name, String phone);
	List<String> findIdByEmail(String name, String email);
	int findPasswordByPhone(String userid, String name, String phone);
	int findPasswordByEmail(String userid, String name, String email);
	List<CustomerVO> findUserByName(String memberName);
	void addFriend(String memberId, String friendId);
	List<CustomerVO> getFriendsList(String memberId);
	List<CustomerVO> getCustomerInfo(String memberId);
}
