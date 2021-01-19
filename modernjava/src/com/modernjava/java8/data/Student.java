/**
 * 
 */
package com.modernjava.java8.data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Thara
 * @creation date & time: 10 Dec 2020 5:34:20 pm
 */
public class Student {

	private String name;
	private int gradeLevel;
	private double gpa;
	private String gender;
	List<String> activities = new ArrayList<>();
	private int noteBooks;

	/**
	 * @param name
	 * @param gradeLevel
	 * @param gpa
	 * @param gender
	 * @param activities
	 * @param noteBooks
	 */
	public Student(String name, int gradeLevel, double gpa, String gender, List<String> activities, int noteBooks) {
		super();
		this.name = name;
		this.gradeLevel = gradeLevel;
		this.gpa = gpa;
		this.gender = gender;
		this.activities = activities;
		this.noteBooks = noteBooks;
	}

	/**
	 * @return the noteBooks
	 */
	public int getNoteBooks() {
		return noteBooks;
	}

	/**
	 * @param noteBooks the noteBooks to set
	 */
	public void setNoteBooks(int noteBooks) {
		this.noteBooks = noteBooks;
	}

	/**
	 * 
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param name
	 */
	public Student(String name) {
		super();
		this.name = name;
	}

	/**
	 * @return the activities
	 */
	public List<String> getActivities() {
		return activities;
	}

	/**
	 * @param activities the activities to set
	 */
	public void setActivities(List<String> activities) {
		this.activities = activities;
	}

	/**
	 * @param name
	 * @param gradeLevel
	 * @param gpa
	 * @param gender
	 * @param activities
	 */
	public Student(String name, int gradeLevel, double gpa, String gender, List<String> activities) {
		super();
		this.name = name;
		this.gradeLevel = gradeLevel;
		this.gpa = gpa;
		this.gender = gender;
		this.activities = activities;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the gradeLevel
	 */
	public int getGradeLevel() {
		return gradeLevel;
	}

	/**
	 * @param gradeLevel the gradeLevel to set
	 */
	public void setGradeLevel(int gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

	/**
	 * @return the gpa
	 */
	public double getGpa() {
		return gpa;
	}

	/**
	 * @param gpa the gpa to set
	 */
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	public void printListOfActivites() {
		System.out.println(activities);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gradeLevel=" + gradeLevel + ", gpa=" + gpa + ", gender=" + gender
				+ ", activities=" + activities + "]";
	}

}
