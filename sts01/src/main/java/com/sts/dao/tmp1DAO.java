package com.sts.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.vo.WordVO;

@Service
public class Tmp1DAO implements Tmp1Service{
	@Autowired
	@Resource(name="sqlSession")
	private SqlSession sqlSession;
	
	@Override
	public List<WordVO> selectWordList() {
		return sqlSession.selectList("tmp1Mapper.selectWordList");
	}

}
