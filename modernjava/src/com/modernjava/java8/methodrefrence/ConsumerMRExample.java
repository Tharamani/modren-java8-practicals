/**
 * 
 */
package com.modernjava.java8.methodrefrence;

import java.util.function.Consumer;

import com.modernjava.java8.data.Student;
import com.modernjava.java8.data.StudentDataBase;

/**
 * @author Thara
 *@creation date & time: 11 Dec 2020 8:04:48 am
 */
public class ConsumerMRExample {

	static Consumer<Student> consumer = (s) -> System.out.println(s);
	
	/**
	 * classname::methodname
	 */
	static Consumer<Student> consumerMR = System.out::println;
	
	/**
	 * classname::instance methodname
	 */
	static Consumer<Student> consumerMR1 = Student::printListOfActivites;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//StudentDataBase.getAllStudents().forEach(consumer);
		StudentDataBase.getAllStudents().forEach(consumerMR);
		System.out.println();
		StudentDataBase.getAllStudents().forEach(consumerMR1);
		
	}

}
