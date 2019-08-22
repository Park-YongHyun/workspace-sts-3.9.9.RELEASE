package org.zerock.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {

	@Autowired
	private BoardMapper mapper;
	
//	@Test
//	public void testGetList() {
//		List<BoardVO> list=mapper.getList();
//		
//		for(BoardVO board:list) {
//			System.out.println(board);
//		}		
////		mapper.getList().forEach(board->System.out.println(board));
//	}
	
//	@Test
//	public void testInsert() {
//		BoardVO board=new BoardVO();
//		board.setTitle("새로 작성하는 글");
//		board.setContent("새로 작성하는 내용");
//		board.setWriter("홍길동");
//		
//		mapper.insert(board);
//		System.out.println(board);
//	}
	
//	@Test
//	public void testInsertSelectKey() {
//		BoardVO board=new BoardVO();
//		board.setTitle("새로 작성하는 글 select key");
//		board.setContent("새로 작성하는 내용 select key");
//		board.setWriter("홍길동");
//		
//		mapper.insertSelectKey(board);
//		System.out.println(board);
//	}
	
//	@Test
//	public void testRead() {
//		BoardVO board=mapper.read(27);
//		
//		System.out.println(board);
//	}
	
//	@Test
//	public void testDelete() {
//		int a=mapper.delete(25);
//		
//		if(a==1)	//1 삭제 성공
//			System.out.println("삭제 성공");
//		else		//0 삭제 실패
//			System.out.println("삭제 실패");
//	}
	
	@Test
	public void testUpdate() {
		BoardVO board=new BoardVO();
		board.setBno(5);
		board.setTitle("수정된 제목");
		board.setContent("수정된 내용");
		board.setWriter("수정된 사람");
		
		int a=mapper.update(board);
		System.out.println("처리결과:"+a);		
		System.out.println(board);
	}
	
}
