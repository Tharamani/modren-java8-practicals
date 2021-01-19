/**
 * 
 */
package com.modernjava.javabrains;

import java.util.Comparator;

/**
 * @author Thara
 * @creation date & time: 9 Dec 2020 11:19:21 am
 */
public class MyPerson /* implements Comparator<MyPerson> */{

	private String firstName;
	private String lastName;
	private int age;

	/**
	 * 
	 */
	public MyPerson() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param firstName
	 * @param lastName
	 * @param age
	 */
	public MyPerson(String firstName, String lastName, int age) {
		System.out.println("FN:" + firstName);
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	/*
	 * @Override public int compare(MyPerson o1, MyPerson o2) { return
	 * (o1.getLastName()).compareTo(o2.getLastName()); }
	 */
}
