package com.icia.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.icia.board.dto.BoardDTO;
import com.icia.board.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	private BoardService bs;
	
	private ModelAndView mav;
	
	@RequestMapping(value = "/writepage")
		public String writepage() {
		return "boardwrite";
	}
	
	@RequestMapping(value = "/boardwrite")
		public ModelAndView boardwrite(@ModelAttribute BoardDTO board) {
		mav = bs.boardwrite(board);
		return mav;
	}
	
	@RequestMapping(value = "/list")
		public ModelAndView boardlist() {
		mav = bs.boardlist();
		return mav;
	}
}
