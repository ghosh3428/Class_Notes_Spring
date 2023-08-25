package com.niit.SampleSpringApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="Student_Details")
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotBlank(message="First Name cannot be empty")
	private String firstName;
	
	@NotBlank(message="Last Name cannot be empty")
	private String lastName;
	
	@Min(value=1 , message="Roll Number cannot be less than 1")
	@Max(value=1000 , message="Roll Number cannot be greater than 1000")
	private int rollNumber;
	
	@NotBlank(message="Class cannot be empty")
	private String student_Class;
	
	@NotBlank(message="Section cannot be empty")
	private String section;
	
	@Min(value=0 , message="Maths Marks cannot be less than 0")
	@Max(value=100 , message="Maths Marks cannot be greater than 100")
	private int maths;
	
	@Min(value=0 , message="Science Marks cannot be less than 0")
	@Max(value=100 , message="Science Marks cannot be greater than 100")
	private int science;
	
	@Min(value=0 , message="SST Marks cannot be less than 0")
	@Max(value=100 , message="SST Marks cannot be greater than 100")
	private int sst;
	
	@Min(value=0 , message="English Marks cannot be less than 0")
	@Max(value=100 , message="English Marks cannot be greater than 100")
	private int english;
	
	@Min(value=0 , message="Computer Marks cannot be less than 0")
	@Max(value=100 , message="Computer Marks cannot be greater than 100")
	private int computer;
	
	private double average;
	private int total;
	private String grade;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudent_Class() {
		return student_Class;
	}
	public void setStudent_Class(String student_Class) {
		this.student_Class = student_Class;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getSst() {
		return sst;
	}
	public void setSst(int sst) {
		this.sst = sst;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getComputer() {
		return computer;
	}
	public void setComputer(int computer) {
		this.computer = computer;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

}
