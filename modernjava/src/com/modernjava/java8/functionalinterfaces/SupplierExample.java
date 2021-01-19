/**
 * 
 */
package com.modernjava.java8.functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.modernjava.java8.data.Student;
import com.modernjava.java8.data.StudentDataBase;

/**
 * @author Thara
 *@creation date & time: 11 Dec 2020 7:51:06 am
 */
public class SupplierExample {

	static Supplier<Student> supplier = () -> {
		return new Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball"));
	};
	
	static Supplier<List<Student>> sutudentListSupplier = () -> { 
		
		return StudentDataBase.getAllStudents();
	};
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("supplier get student : " + supplier.get());
		System.out.println("supplier get all student : " + supplier.get());
	}

}
