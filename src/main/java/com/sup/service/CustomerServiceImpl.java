package com.sup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sup.dao.CustomerDao;
import com.sup.vo.CustomerVO;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;

	@Override
	public void create(CustomerVO customerVO) {
		this.customerDao.insertUser(customerVO);
	}

	@Override
	public int login(String userid, String passwd) {
		return this.customerDao.loginUser(userid, passwd);
	}

	@Override
	public List<String> findIdByPhone(String name, String phone) {
		return this.customerDao.findIdByPhone(name, phone);
	}

	@Override
	public List<String> findIdByEmail(String name, String email)  {
		return this.customerDao.findIdByEmail(name, email);
	}
	
	@Override
	public 	int findPasswordByPhone(String userid, String name, String phone) {
		return this.customerDao.findPasswordByPhone(userid, name, phone);
	}

	@Override
	public int findPasswordByEmail(String userid, String name, String email) {
		return this.customerDao.findPasswordByEmail(userid, name, email);
	}

	@Override
	public List<CustomerVO> findUserByName(String memberName) {
		return this.customerDao.selectUserByName(memberName);
	}

	@Override
	public void addFriend(String memberId, String friendId) {
		this.customerDao.insertFriends(memberId, friendId);
	}

	@Override
	public List<CustomerVO> getFriendsList(String memberId) {
		return this.customerDao.selectFriends(memberId);
	}

	@Override
	public List<CustomerVO> getCustomerInfo(String memberId) {
		return this.customerDao.selectUserById(memberId);
	}

}
