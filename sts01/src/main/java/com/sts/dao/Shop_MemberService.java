package com.sts.dao;

import java.util.List;
import java.util.Map;

public interface Shop_MemberService {

	public int insertMemberOne(Map<String, Object> map);
	
	//public int insertMemberOneVo(Object vo);
	
	//아이디,암호를 map에 추가한후 map(id, name)
	public Map<String, Object> selectMemberLogin(Map<String, Object> map);
	
	//회원목록
	public List<Map<String, Object>> selectMemberList();
}
