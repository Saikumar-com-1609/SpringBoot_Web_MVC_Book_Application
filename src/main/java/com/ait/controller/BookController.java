package com.ait.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ait.entity.Books;
import com.ait.repository.BookRepository;

@Controller
public class BookController {
	
	@Autowired
	private BookRepository bookRepo;
	
	@GetMapping("/book")
	public ModelAndView getBookById(@RequestParam("id") Integer id) {
		ModelAndView mav = new ModelAndView();
		System.out.println(id);
		Optional<Books> findById = bookRepo.findById(id);
		System.out.println(findById.get());
		if(findById.isPresent()) {
			Books obj = findById.get();
		
			
			//sending data to view
			mav.addObject("msg", obj);
		}
			mav.setViewName("index");
			return mav;
		
		
	}

}
