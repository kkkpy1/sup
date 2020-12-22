package com.sup.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		logger.info("영진 테스트 완료");
		logger.info("준환 테스트 완료");
		logger.info("선아 테스트 완료");
		logger.info("--여기까지 확인 by 영진--");
		logger.info("남기 테스트 완료");
		logger.info("소희 테스트 완료");

		return "index"; // WEB-INF/views/index.jsp
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public String write() {
		return "/write/main";
	}

	@RequestMapping(value = "/gift", method = RequestMethod.GET)
	public String gift() {
		return "/gift/main";
	}

	@RequestMapping(value = "/purchase", method = RequestMethod.GET)
	public String purchase() {
		return "/purchase/main";
	}

	@RequestMapping(value = "/best", method = RequestMethod.GET)
	public String best() {
		return "/best/main";
	}

	@RequestMapping(value = "/category", method = RequestMethod.GET)
	public String category() {
		return "/category/main";
	}

	@RequestMapping(value = "/mypage", method = RequestMethod.GET)
	public String mypage() {
		return "/mypage/main";
	}

	@RequestMapping(value = "/qna", method = RequestMethod.GET)
	public String qna() {
		return "/qna/main";
	}

	@RequestMapping(value = "/report", method = RequestMethod.GET)
	public String report() {
		return "/report/main";
	}

	@RequestMapping(value = "/store", method = RequestMethod.GET)
	public String store() {
		return "/store/main";
	}

	@RequestMapping(value = "/mywishlist", method = RequestMethod.GET)
	public String wishlist() {
		return "/wishlist/main";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "/account/login";
	}

	@RequestMapping(value = "/login2", method = RequestMethod.GET)
	public String login2() {
		return "/account/login2";
	}

	@RequestMapping(value = "/login3", method = RequestMethod.GET)
	public String login3() {
		return "/account/login3";
	}

	@RequestMapping(value = "/register1", method = RequestMethod.GET)
	public String register1() {
		return "/account/register1";
	}

	@RequestMapping(value = "/register2", method = RequestMethod.GET)
	public String register2() {
		return "/account/register2";
	}

	@RequestMapping(value = "/register3", method = RequestMethod.GET)
	public String register3() {
		return "/account/register3";
	}

	@RequestMapping(value = "/p_detail", method = RequestMethod.GET)
	public String p_detail() {
		return "/purchase/p_detail";
	}

	@RequestMapping(value = "/pay", method = RequestMethod.GET)
	public String pay() {
		return "/purchase/pay";
	}

	@RequestMapping(value = "/post", method = RequestMethod.GET)
	public String post() {
		return "/write/post";
	}

	@RequestMapping(value = "/friendwishlist", method = RequestMethod.GET)
	public String friendwishlist() {
		return "/wishlist/friendwishlist";
	}

	@RequestMapping(value = "/friends", method = RequestMethod.GET)
	public String friends() {
		return "/wishlist/friends";
	}

	@RequestMapping(value = "/addproduct", method = RequestMethod.GET)
	public String addproduct() {
		return "/write/addproduct";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list() {
		return "/gift/list";
	}

	@RequestMapping(value = "/use", method = RequestMethod.GET)
	public String use() {
		return "/gift/use";
	}

	@RequestMapping(value = "/find_id", method = RequestMethod.GET)
	public String find_id() {
		return "/account/find_id";
	}

	@RequestMapping(value = "/find_pw", method = RequestMethod.GET)
	public String find_pw() {
		return "/account/find_pw";
	}

	@RequestMapping(value = "/admin_main", method = RequestMethod.GET)
	public String admin_main() {
		return "/admin/admin_main";
	}

	@RequestMapping(value = "/general_detail", method = RequestMethod.GET)
	public String general_detail() {
		return "/admin/general_detail";
	}

	@RequestMapping(value = "/general_account", method = RequestMethod.GET)
	public String general_account() {
		return "/admin/general_account";
	}

	@RequestMapping(value = "/seller_detail", method = RequestMethod.GET)
	public String seller_detail() {
		return "/admin/seller_detail";
	}

	@RequestMapping(value = "/seller_account", method = RequestMethod.GET)
	public String seller_account() {
		return "/admin/seller_account";
	}

	@RequestMapping(value = "/seller_main", method = RequestMethod.GET)
	public String seller_main() {
		return "/seller/seller_main";
	}

	@RequestMapping(value = "/product_report", method = RequestMethod.GET)
	public String product_report() {
		return "/admin/product_report";
	}

	@RequestMapping(value = "/p_report_detail", method = RequestMethod.GET)
	public String p_report_detail() {
		return "/admin/p_report_detail";
	}

	@RequestMapping(value = "/report_detail", method = RequestMethod.GET)
	public String report_detail() {
		return "/admin/report_detail";
	}
	
	@RequestMapping(value = "/reply", method = RequestMethod.GET)
	public String reply() {
		return "/admin/reply";
	}

}
