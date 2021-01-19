/**
 * 
 */
package com.modernjava.java8.streams;

import com.modernjava.java8.data.Student;
import com.modernjava.java8.data.StudentDataBase;

/**
 * @author Thara
 *@creation date & time: 14 Dec 2020 8:20:41 am
 */
public class StreamMapReduceExample {

	public static int numberOfBooks() {
		
		return StudentDataBase.getAllStudents().stream()//Stream<Student>
				.filter(student-> student.getGradeLevel()>=3)
				.filter(student-> student.getGender().equals("female"))
										.map(Student::getNoteBooks)//Stream<Integer>
										//.reduce(0,(a,b)->(a+b));
										.reduce(0,Integer::sum);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Nos of Notebook: "+ numberOfBooks());

	}

}
