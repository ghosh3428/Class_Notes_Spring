package com.niit.SampleSpringApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.SampleSpringApp.model.Student;
import com.niit.SampleSpringApp.service.StudentService;

@Controller
public class FrontController 
{
	@Autowired
	MyMessage myMessage;
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping(value={"/index","/","/home"})
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("title" ,"Sample Spring App - Index" );
		mv.addObject("message" ,myMessage.getMessage());
		
		return mv;
		
	}
	
	@RequestMapping(value="/add")
	public ModelAndView add()
	{
		ModelAndView mv = new ModelAndView("add");
		
		mv.addObject("title" ,"Sample Spring App - Add Student" );
		mv.addObject("student" ,new Student());
		
		return mv;
		
	}
	
	@RequestMapping(value="/add" , method=RequestMethod.POST)
	public ModelAndView addStudent(@ModelAttribute("student") Student s)
	{
		ModelAndView mv = new ModelAndView("add");
		
		s.setTotal(s.getMaths()+s.getScience()+s.getEnglish()+s.getComputer()+s.getSst());
		s.setAverage(s.getTotal()/5);
		if(s.getAverage() > 85)
		{
			s.setGrade("A");
		}
		else if(s.getAverage() > 70)
		{
			s.setGrade("B");
		}
		else if(s.getAverage() > 50)
		{
			s.setGrade("C");
		}
		else if(s.getAverage() > 40)
		{
			s.setGrade("D");
		}
		else
		{
			s.setGrade("F");
		}
		boolean result = false;
		
		if(s.getId() == 0)
		{
			result = studentService.addStudent(s);
		}
		else
		{
			result = studentService.updateStudent(s);
		}
		if(result)
		{
			mv.addObject("success" ,"Operation successfull" );
		}
		else
		{
			mv.addObject("error" ,"Error");
		}
		mv.addObject("student" ,new Student());
		mv.addObject("title" ,"Sample Spring App - Add Student" );
		
		return mv;
		
	}
	
	@RequestMapping(value="/view")
	public ModelAndView showStudents()
	{
		ModelAndView mv = new ModelAndView("viewStudent101");
		
		List <Student> stList = (List<Student>)studentService.studentList();
		
		mv.addObject("studentlist" , stList);
		mv.addObject("title" , "Student Managment - All Student");
		
		return mv;
		
		
	}
	
	@RequestMapping(value="/update")
	public ModelAndView update(@RequestParam(name = "id", required = true) int s_id)
	{
		ModelAndView mv = new ModelAndView("add");
		
		mv.addObject("title" ,"Sample Spring App - Add Student" );
		mv.addObject("student" ,studentService.getStudent(s_id));
		
		return mv;
		
	}
	

	@RequestMapping(value="/delete")
	public ModelAndView delete(@RequestParam(name = "id", required = true) int s_id)
	{
		ModelAndView mv = new ModelAndView("viewStudent101");
		Student s = studentService.getStudent(s_id);
		
		boolean result = studentService.deleteStudent(s);
		if(result)
		{
			mv.addObject("success" ,"Operation successfull" );
		}
		else
		{
			mv.addObject("error" ,"Error");
		}
		
		List <Student> stList = (List<Student>)studentService.studentList();
		
		mv.addObject("studentlist" , stList);
		mv.addObject("title" , "Student Managment - All Student");
		
		return mv;
		
	}
	
	@RequestMapping(value="/search")
	public ModelAndView search(@RequestParam(name = "id", required = true) int s_id)
	{
		ModelAndView mv = new ModelAndView("student");
		
		mv.addObject("title" ,"Sample Spring App - Add Student" );
		mv.addObject("student" ,studentService.getStudent(s_id));
		
		return mv;
		
	}
	

}
