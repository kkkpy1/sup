package com.sup.service;

import java.util.List;

import com.sup.vo.PostVO;

public interface PostService {
	void create(PostVO postVO);
	List<PostVO> selectMyPost(String memberId);
	PostVO selectOne(int postId);
	void update(PostVO postVO);
	void delete(int postId);
}
