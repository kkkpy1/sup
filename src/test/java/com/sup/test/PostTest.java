package com.sup.test;


import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.sup.service.PostService;
import com.sup.vo.PostVO;

import lombok.extern.java.Log;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log
class PostTest {
	@Autowired
	private SqlSession sqlSession;

	@Autowired
	private PostService postService;
	
	@Test
	void test() {
		assertNotNull(sqlSession);
		assertNotNull(postService);
	}
	
	
	@Disabled @Test
	void insertOne() { // 글 작성하기. Service에서 따옴표처리 필요..
		int productId = 1;
		String memberId = "customer3";
		String postContent = "저도 1번 상품이 너무 좋아요 ㅎㅎ";
		PostVO postVO = new PostVO();
		postVO.setProductId(productId);
		postVO.setMemberId(memberId);
		postVO.setPostContent(postContent);

		this.postService.create(postVO);
	}
	
	@Disabled @Test
	void selectMyPost() { // 내 글 목록..
		String memberId = "customer1";
		List<PostVO> list = this.postService.selectMyPost(memberId);
		for (int i = 0; i < list.size(); i++) {
			log.info(list.get(i).getPostContent());
		}
	}
	@Disabled @Test
	void selectOnePost() { // 글번호로 글 가져오기
		int postId = 2;
		PostVO postVO = this.postService.selectOne(postId);
		log.info(postVO.getPostContent());
		log.info(postVO.getProductImg());
	}
	
	@Disabled @Test
	void updateT() { // update
		PostVO postVO = new PostVO();
		int postId = 2;
		int productId = 2;
		String memberId = "customer1";
		String postContent = "수정된 내용입니다. 상품2가 더 갖고싶어요.";
		
		postVO.setPostId(postId);
		postVO.setProductId(productId);
		postVO.setMemberId(memberId);
		postVO.setPostContent(postContent);
		this.postService.update(postVO);
	}
	
	@Test
	void deleteT() {
		int postId = 22;
		this.postService.delete(postId);
	}

}
