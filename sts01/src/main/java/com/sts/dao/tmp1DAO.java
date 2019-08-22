package com.sts.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class tmp1DAO implements tmp1Service{
	@Autowired
	@Resource(name="sqlSession")
	private SqlSession sqlSession;
	
	@Override
	public List<Map<String, Object>> selectWordList() {
		return sqlSession.selectList("Shop_Member.selectMemberList");
	}

}
