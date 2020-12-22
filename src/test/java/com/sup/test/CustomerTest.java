package com.sup.test;


import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.sup.service.CustomerService;
import com.sup.vo.CustomerVO;

import lombok.extern.java.Log;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log
class CustomerTest {
	@Autowired
	private SqlSession sqlSession;

	@Autowired
	private CustomerService customerService;
	
	@Test
	void test() {
		assertNotNull(sqlSession);
		assertNotNull(customerService);
	}
	
	@Disabled @Test
	void test2() { // 회원가입 Test 성공
		CustomerVO customerVO = new CustomerVO();
		customerVO.setMemberId("customer3");
		customerVO.setMemberPassword("1234");
		customerVO.setMemberName("소비자3");
		customerVO.setMemberGender("0");
		// Date memberBirthday = Date.valueOf("2020-12-21");
		String memberBirthday = "2020-12-21";
		customerVO.setMemberBirthday(memberBirthday);
		customerVO.setMemberEmail("bornin@2020.com");
		customerVO.setMemberPhone("01020201221");
		customerVO.setMemberTerms("1");
		this.customerService.create(customerVO);
		
	}
	
	@Disabled @Test
	void test3() { // login Test 성공
		int result = this.customerService.login("customer1", "1234");
		//result : -1, 0, 1
		if(result == -1) System.out.println("존재하지 않는 아이디 입니다.");
		else if(result == 0) System.out.println("비밀번호가 일치하지 않습니다.");
		else {
			System.out.println("result = 1");
		}
	}
	
	@Disabled @Test
	void findIdTest() { // find ID by phone, email Test 성공
		String name = "소비자";
		String phone = "01012345678";
		String email = "aaa@bbb.com";
		
		List<String> list = this.customerService.findIdByPhone(name, email);
		if(list.isEmpty()) System.out.println("가입된 아이디가 없습니다.");
		else {
			System.out.println("가입된 아이디 목록은 아래와 같습니다.");
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
			
		}
	}
	
	@Disabled @Test
	void findPasswordTest() { // find password by phone, email Test 성공
		String id = "customer1";
		String name = "소비자";
		String phone = "01012345678";
		String email = "aaa@bbb.com";
		
		int result = this.customerService.findPasswordByEmail(id, name, email);
		//result : -1, 0, 1
		if(result == -1) System.out.println("존재하지 않는 아이디 입니다.");
		else if(result == 0) System.out.println("이메일이 일치하지 않습니다.");
		else {
			System.out.println("result = 1");
		}
	}
	
	@Disabled @Test
	void findFriend() { // 이름으로 친구 검색 완료
		String memberName = "소비자3";
		List<CustomerVO> list = this.customerService.findUserByName(memberName);
		for (int i = 0; i < list.size(); i++) {
			log.info(list.get(i).getMemberId());
			log.info(list.get(i).getMemberEmail());
			log.info(list.get(i).getMemberPassword());
		}
	}
	
	@Disabled @Test
	void weAreFriend() { // 친구 추가 완료
		String memberId = "customer3";
		String friendId = "customer2";
		this.customerService.addFriend(memberId, friendId);
	}
	
	@Disabled @Test
	void showMyFriends() { // 친구 목록 가져오기~~ 성공!
		String memberId = "customer1";
		List<CustomerVO> list = this.customerService.getFriendsList(memberId);
		for (int i = 0; i < list.size(); i++) {
			log.info(list.get(i).getMemberId());
			log.info(list.get(i).getMemberEmail());
			log.info(list.get(i).getMemberGender());
			log.info(list.get(i).getMemberPassword());
		}
		
	}

}
