/**
 * 
 */
package com.modernjava.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.modernjava.java7.Person;

/**
 * @author Thara
 * @creation date & time: 9 Dec 2020 11:18:04 am
 */
public class ListExerciseSolutionjava8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<MyPerson> people = Arrays.asList(new MyPerson("Arnav", "N V", 4), new MyPerson("Thara", "C P", 34),
				new MyPerson("Vish", "D K", 4), new MyPerson("Kumar", "C S", 70), new MyPerson("Chandana", "S V", 80)

		);

		// UnSorted List
		System.out.println("\nunsorted list " + people);

		// step 1: Sorted List
		// Collections.sort(people, new MyPerson());

		// step 1: Sorted lastname by ascending order/descending using lamda expression
		Collections.sort(people, (o1, o2) -> (o1.getLastName()).compareTo(o2.getLastName()));

		// step 2: print all persons
//		printAllPerson(people);
		perfoemConditionally(people, (p) -> true, (p) -> System.out.println(p));

		// step 3: create a method that prints all person that have lastname beginning
		// with "c" using lamda expression
		System.out.println("\nprinting persons lastname stating with D  using lamda expression");
		perfoemConditionally(people, (p) -> p.getLastName().startsWith("D"), (p) -> System.out.println(p));

		// step 4: create a method that prints all person that have firstname beginning
		// with "c" using lamda expression
		System.out.println("\nprinting persons firstname stating with T  using lamda expression");
		perfoemConditionally(people, (p) -> p.getFirstName().startsWith("T"), (p) -> System.out.println(p));
		
		perfoemConditionally(people, (p) -> p.getFirstName().startsWith("T"), (p) -> System.out.println(p) );
	}

	public static void perfoemConditionally(List<MyPerson> peoples, Predicate<MyPerson> predicate, Consumer<MyPerson> consumer) {

		System.out.println("printing persons using lamda expression");

		for (MyPerson person : peoples) {

			if (predicate.test(person)) {
				consumer.accept(person);
				//System.out.println(person);
			}

		}
	}
	
	/*
	 * public static void printConditionally(List<MyPerson> peoples,
	 * Predicate<MyPerson> predicate, Consumer<MyPerson> consumer) {
	 * 
	 * System.out.println("printing persons using lamda expression");
	 * 
	 * for (MyPerson person : peoples) {
	 * 
	 * if (predicate.test(person)) { consumer.accept(person);
	 * //System.out.println(person); }
	 * 
	 * } }
	 */
}
