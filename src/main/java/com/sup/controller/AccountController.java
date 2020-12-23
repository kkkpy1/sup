package com.sup.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.security.auth.login.LoginException;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sup.service.CustomerService;
import com.sup.vo.CustomerVO;

import lombok.extern.java.Log;

@Controller
@RequestMapping("/account")
@Log
public class AccountController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "/account/login"; // WEB-INF/views/account/login.jsp
	}

	// 로그인
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login1(@RequestParam("userid") String userid, @RequestParam("passwd") String passwd,
			HttpSession session) throws LoginException {
		int result = this.customerService.login(userid, passwd);
		// result : -1, 0, 1
		String page = null;
		if (result == -1)
			throw new LoginException("존재하지 않는 아이디 입니다.");
		else if (result == 0)
			throw new LoginException("비밀번호가 일치하지 않습니다.");
		else {
			// CustomerVO customerVO = this.customerService.read(userid);
			// session.setAttribute("userInfo", userVO); // 로그인 후 회원 정보
			session.setAttribute("userid", userid); // 아이디만으로 괜찮을까?
			page = "redirect:/";
		}
		return page;
	}

	@RequestMapping(value = "/register1", method = RequestMethod.GET)
	public String register1() {
		return "/account/register1"; // WEB-INF/views/account/register1.jsp
	}

	// 회원 가입
	@RequestMapping(value = "/register1", method = RequestMethod.POST)
	public String register1(CustomerVO customerVO) {
		log.info(customerVO.toString());
		this.customerService.create(customerVO);
		return "redirect:/";
	}

	@RequestMapping(value = "/idcheck/{userid}", method = RequestMethod.POST)
	public @ResponseBody Map idcheck(@PathVariable String userid) {
		List<CustomerVO> list = this.customerService.getCustomerInfo(userid);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", "success");
		if (list.get(0) == null)
			map.put("result", true); // 사용할 수 있음.
		else
			map.put("result", false); // 사용할 수 없음.
		return map;
	}

	// 로그아웃
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session, Model model) {
//		UserVO userVO = (UserVO)session.getAttribute("userInfo");
//		session.invalidate();
//		model.addAttribute("username", userVO.getName());
		String userid = (String) session.getAttribute("userid");
		session.invalidate();
		return "account/logout"; // WEB-INF/views/account/logout.jsp
	}

	@RequestMapping(value = "/find_id", method = RequestMethod.GET)
	public String find_id() {
		return "/account/find_id";
	}

//	// 아이디 찾기
//	@RequestMapping(value = "/find_id", method = RequestMethod.POST)
//	public @ResponseBody Map find_id1(@RequestParam("memberName") String memberName,
//			@RequestParam("memberEmail") String memberEmail, HttpSession session) throws LoginException {
//		List<String> list = this.customerService.findIdByPhone(memberName, memberEmail);
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("code", "success");
//		if (list.get(0) == null)
//			map.put("result", true); // 사용할 수 있음.
//		else
//			map.put("result", false); // 사용할 수 없음.
//		return map;
//	}
	
	// 아이디 찾기
	@RequestMapping(value = "/find_id/{memberName,memberEmail}", method = RequestMethod.POST)
	public @ResponseBody Map find_id1(@PathVariable String memberName, @PathVariable String memberEmail) {
		List<String> list = this.customerService.findIdByPhone(memberName, memberEmail);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", "success");
		if (list.get(0) == null)
			map.put("result", false);
		else
			map.put("result", true);
		return map;
	}

}