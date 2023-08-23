package com.niit.SampleSpringApp.service;

import java.util.List;



import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.SampleSpringApp.model.Student;

@Repository("studentService")
@Transactional
public class StudentService 
{
	@Autowired
	SessionFactory sessionFactory;
	
	public boolean addStudent(Student s)
	{
		try
		{
			sessionFactory.getCurrentSession().persist(s);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean updateStudent(Student s)
	{
		try
		{
			sessionFactory.getCurrentSession().update(s);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean deleteStudent(Student s)
	{
		try
		{
			sessionFactory.getCurrentSession().delete(s);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	public Student getStudent(int id)
	{
		try
		{
			return sessionFactory.getCurrentSession().get(Student.class,id);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Student> studentList()
	{
		String selectQuery = "FROM Student";
		
		try
		{
			return sessionFactory
					.getCurrentSession()
					.createQuery(selectQuery,Student.class)
					.getResultList();
					
					
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

}
