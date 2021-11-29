package com.freeflux.biz.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.freeflux.biz.board.BoardVO;
import com.freeflux.biz.util.SqlSessionFactoryBean;

public class BoardDAO {
	private SqlSession mybatis;
	
	public BoardDAO() {
		this.mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}
	
	public void insertBoard(BoardVO vo){
		System.out.println("insertBoard() Mybatis 처리" + vo.toString());
	
		this.mybatis.insert("BoardDAO.insertBoard", vo);
		this.mybatis.commit();
	}
	
	public void updateBoard(BoardVO vo){
		System.out.println("updateBoard() Mybatis 처리" + vo.toString());
	
		this.mybatis.update("BoardDAO.updateBoard", vo);
		this.mybatis.commit();
	}
	
	public void deleteBoard(BoardVO vo){
		System.out.println("deleteBoard() Mybatis 처리" + vo.toString());
	
		this.mybatis.delete("BoardDAO.deleteBoard", vo);
		this.mybatis.commit();
	}
	
	public BoardVO getBoard(BoardVO vo){
		System.out.println("getBoard() Mybatis 처리" + vo.toString());
		
		return (BoardVO)this.mybatis.selectOne("BoardDAO.getBoard", vo);
	}
	
	public List<BoardVO> getBoardList(BoardVO vo){
		System.out.println("getBoardList() Mybatis 처리" + vo.toString());
		
		return this.mybatis.selectList("BoardDAO.getBoardList", vo);
	}
	
	
	
}
