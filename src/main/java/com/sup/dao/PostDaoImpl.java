package com.sup.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sup.vo.PostVO;
import com.sup.vo.ProductVO;

@Repository("postDao")
public class PostDaoImpl implements PostDao {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public void insert(PostVO postVO) {
		this.sqlSession.insert("Post.insertSP",postVO);
	}

	@Override
	public List<PostVO> selectMyPost(String memberId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("memberId", memberId);   //INPUT Parameter
		this.sqlSession.selectList("Post.selectMyPostSP", map);
		return (List<PostVO>) map.get("result");
	}

	@Override
	public PostVO selectOne(int postId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("postId", postId);   //INPUT Parameter
		this.sqlSession.selectList("Post.selectOneSP", map);
		List<PostVO> list = (List<PostVO>) map.get("result");
		return list.get(0);
	}

	@Override
	public void update(PostVO postVO) {
		this.sqlSession.update("Post.updateSP", postVO);
	}

	@Override
	public void delete(int postId) {
		this.sqlSession.delete("Post.delete", postId);
	}

}
