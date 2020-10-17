package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
	/*
	@Test
	public void testGetList() {
		mapper.getList().forEach(abc ->  log.info(abc));
	}
	
	@Test
	public void testInsert() {
		
		BoardVO board = new BoardVO();
		board.setTitle("새로 작성하는 글");
		board.setContent("새로 작성하는 내용");
		board.setWriter("작성자");
		
		mapper.insert(board);
		log.info(board);
	}
	
	@Test
	public void testInsertSelectKey() {
		
		BoardVO board = new BoardVO();
		board.setTitle("새로 작성하는 글 key");
		board.setContent("새로 작성하는 내용 key");
		board.setWriter("작성자 key");
		
		mapper.insertSelectKey(board);
		log.info(board);
	}
	
	@Test
	public void read() {
		BoardVO board = mapper.read(27L);
		
		log.info(board);
	}
	
	@Test
	public void testDelete() {
		log.info("DELETE COUNT : " + mapper.delete(27L));
	}*/
	
	@Test
	public void testUpdate() {
		BoardVO board = new BoardVO();
		
		board.setBno(31L);
		board.setTitle("새 제목");
		board.setContent("새 내용");
		board.setWriter("새 작성자");
		
		int count = mapper.update(board);
		log.info("UPDATE COUNT: " + count);
	}
	
}
