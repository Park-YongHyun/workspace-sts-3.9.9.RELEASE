package org.zerock.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@AllArgsConstructor
public class BoardServiceImpl implements BoardService{

//	@Autowired
	private BoardMapper mapper;
		
	@Override
	public void register(BoardVO board) {
		System.out.println("등록 서비스");
		mapper.insertSelectKey(board);
	}
	
	@Override
	public List<BoardVO> getList() {
		System.out.println("목록 서비스");
		return mapper.getList();
	}

	@Override
	public BoardVO get(int bno) {
		System.out.println("조회 서비스");
		return mapper.read(bno);
	}

	@Override
	public boolean remove(int bno) {
		System.out.println("제거 서비스");
		return mapper.delete(bno)==1;
	}

	@Override
	public boolean modify(BoardVO board) {
		System.out.println("수정 서비스");
		return mapper.update(board)==1;
	}

}
