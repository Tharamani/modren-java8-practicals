/**
 * 
 */
package com.modernjava.java8.constructorrefrence;

import java.util.function.Function;
import java.util.function.Supplier;

import com.modernjava.java8.data.Student;

/**
 * @author Thara
 * @creation date & time: 11 Dec 2020 10:41:45 am
 */
public class ConstructorReferenceExample {

	static Supplier<Student> supplier = Student::new;

	static Function<String, Student> function = Student::new;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(supplier.get());
		System.out.println(function.apply("Abc"));
	}

}
