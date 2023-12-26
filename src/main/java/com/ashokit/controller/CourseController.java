package com.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ashokit.entity.Courses;
import com.ashokit.repo.CourseRepo;

@Controller
public class CourseController 
{

	@Autowired
	private CourseRepo courseRepo;
	
	@GetMapping(value = "/books")
	public ModelAndView getAllCourses()
	{
		List<Courses> findAll = courseRepo.findAll();
		
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("findAllCourses",findAll);
		mav.setViewName("courses");
		
		return mav;
		
	}
	
	
	
	
}
