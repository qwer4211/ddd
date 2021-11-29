package com.freeflux.biz.board;

import java.util.List;

import com.freeflux.biz.impl.BoardDAO;

public class BoardServiceClient {

	public static void main(String[] args) {
		BoardDAO boardDAO = new BoardDAO();
		
		BoardVO vo = new BoardVO();
		vo.setTitle("myBaits 테스트");
		vo.setWriter("myBaits");
		vo.setContent("myBaits 테스트 teset ");
		
		boardDAO.insertBoard(vo);
		
		vo.setSearchCondition("TITLE");
		vo.setSearchKeyword("mybatis");
		
		List<BoardVO> boardList = boardDAO.getBoardList(vo);
		for(BoardVO board : boardList){
			System.out.println("===> " + board.toString());
		}
		
		
	}

}
