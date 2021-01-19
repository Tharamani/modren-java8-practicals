/**
 * 
 */
package com.modernjava.java8.lamdalocalvariable;

import java.util.function.Consumer;

/**
 * @author Thara
 *@creation date & time: 11 Dec 2020 11:41:56 am
 */
public class LamdaLocalAndInstancevariableExaple {

	/**
	 * instance variable
	 */
	static int value = 4;
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//local variable
		//int value = 4;
		Consumer<Integer> consumer = (i) -> {
			//modifying local variable not allowed
			//value++;
			
			//modifying instance variable allowed
			value++;
			System.out.println(value+i);
		};
		
		consumer.accept(2);
	}

}
