package org.zerock.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.service.BoardService;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTests {

	@Autowired
	private BoardService service;
	
//	@Test
//	public void testExist() {
//		System.out.println(service);
//		assertNotNull(service);
//	}
	
//	@Test
//	public void testRegister() {
//		BoardVO board=new BoardVO();
//		board.setTitle("새로 작성하는 글 service");
//		board.setContent("새로 작성하는 내용 service");
//		board.setWriter("김길동");
//		
//		service.register(board);
//		System.out.println(board);
//	}
//	
//	@Test
//	public void testGetList() {
//		List<BoardVO> list=service.getList();
//		
//		for(BoardVO board:list) {
//			System.out.println(board);
//		}
//	}
//	
//	@Test
//	public void testGet() {
//		BoardVO board=service.get(5);
//		
//		System.out.println(board);
//	}
//	
//	@Test
//	public void testDelete() {
//		boolean a=service.remove(23);		
//		System.out.println("성공여부:"+a);		
//	}
	
	@Test
	public void testUpdate() {
		BoardVO board=service.get(1);
//		System.out.println(board);
		
		if(board==null) {
			return;
		}
		board.setTitle("서비스 수정 테스트");
		
		boolean a=service.modify(board);
		System.out.println("성공여부:"+a);
	}
	
}
