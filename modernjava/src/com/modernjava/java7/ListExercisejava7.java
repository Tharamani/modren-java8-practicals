/**
 * 
 */
package com.modernjava.java7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Thara
 * @creation date & time: 9 Dec 2020 11:18:04 am
 */
public class ListExercisejava7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<MyPerson> people = Arrays.asList(new MyPerson("Arnav", "N V", 4), new MyPerson("Thara", "C P", 34),
				new MyPerson("Vish", "D K", 4), new MyPerson("Kumar", "C S", 70),
				new MyPerson("Chandana", "S V", 80)

		);

		// UnSorted List
		System.out.println("\nunsorted list " + people);

		// step 1 : Sorted List
		//Collections.sort(people, new MyPerson()); 
		
		// step 1 : Sorting person lastname by ascending order/descending
		Collections.sort(people,
						new Comparator<MyPerson>() {

							@Override
							public int compare(MyPerson o1, MyPerson o2) {
								return (o1.getLastName()).compareTo(o2.getLastName());
								//return (o2.getLastName()).compareTo(o1.getLastName());
							}
						});

		//step 2 : print all persons
		printAllPerson(people);

		//step 3: create a method that prints all person that have lastname beginning with "c"
		System.out.println("\nprinting persons lastname stating with C");
		printConditionally(people, new Condition() {

			@Override
			public boolean test(MyPerson p) {

				return p.getLastName().startsWith("C");
			}
		});

		//step 4: create a method that prints all person that have firstname beginning with "c"
		System.out.println("\nprinting persons firstname stating with C");
		printConditionally(people, new Condition() {

			@Override
			public boolean test(MyPerson p) {

				return p.getFirstName().startsWith("C");
			}
		});
	}

	public static void printConditionally(List<MyPerson> peoples, Condition condition) {

		for (MyPerson person : peoples) {

			if(condition.test(person))
			{
				System.out.println(person);
			}
			
		}
	}

	public static void printAllPerson(List<MyPerson> peoples) {

		System.out.println("\nprinting all persons ");

		for (MyPerson person : peoples) {

			System.out.println(person);
		}
	}

}
