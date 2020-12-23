package com.sup.dao;

import java.util.List;

import com.sup.vo.PostVO;

public interface PostDao {

	void insert(PostVO postVO);

	List<PostVO> selectMyPost(String memberId);

	PostVO selectOne(int postId);

	void update(PostVO postVO);

	void delete(int postId);

	
}
