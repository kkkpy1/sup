package com.sup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sup.dao.PostDao;
import com.sup.vo.PostVO;

@Service("postService")
public class PostServiceImpl implements PostService {
	@Autowired
	private PostDao postDao;

	@Override
	public void create(PostVO postVO) {
		this.postDao.insert(postVO);
	}

	@Override
	public List<PostVO> selectMyPost(String memberId) {
		// TODO Auto-generated method stub
		return this.postDao.selectMyPost(memberId);
	}

	@Override
	public PostVO selectOne(int postId) {
		return this.postDao.selectOne(postId);
	}

	@Override
	public void update(PostVO postVO) {
		this.postDao.update(postVO);
	}

	@Override
	public void delete(int postId) {
		this.postDao.delete(postId);
	}

}
