package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;

public interface BoardService {
	
	public List<BoardVO> getList();	
	public void register(BoardVO board);
	public BoardVO get(int bno);
	public boolean remove(int bno);	
	public boolean modify(BoardVO board);
	
}
