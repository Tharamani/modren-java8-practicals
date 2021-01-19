/**
 * 
 */
package com.modernjava.java8.lamdalocalvariable;

import java.util.function.Consumer;

/**
 * @author Thara
 *@creation date & time: 11 Dec 2020 11:35:58 am
 */
public class LamdaLocalVariableExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int i =0;
		//Consumer<Integer> c = (i) -> { //restrictions
		Consumer<Integer> c = (q) -> {
			//i=2; 						//restrictions
			System.out.println("value is " + i);
		};
	}

}
