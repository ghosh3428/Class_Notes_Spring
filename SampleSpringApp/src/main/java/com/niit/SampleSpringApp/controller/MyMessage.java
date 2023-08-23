package com.niit.SampleSpringApp.controller;

import org.springframework.stereotype.Repository;

@Repository("myMessage")
public class MyMessage 
{
	public String getMessage()
	{
		return "Hello User. Welcome to Jadavpur";
	}
}
