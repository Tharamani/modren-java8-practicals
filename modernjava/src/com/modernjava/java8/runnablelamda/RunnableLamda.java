/**
 * 
 */
package com.modernjava.java8.runnablelamda;

/**
 * @author Thara
 * @creation date & time: 10 Dec 2020 3:09:11 pm
 */
public class RunnableLamda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * prior java 8
		 * 
		 */
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Inside runnable prior to java 8");
			}
		};
		new Thread(runnable).start();

		/**
		 * java 8 lamda syntax
		 * 
		 */
		Runnable lamdaFunc = () -> {
			System.out.println("\nInside runnableusing lamda java 8");
			System.out.println("\nInside runnableusing lamda java 8");
			System.out.println("\nInside runnableusing lamda java 8");
		};
		new Thread(lamdaFunc).start();
		
		Runnable lamdaFunc2 = () -> System.out.println("\nInside runnableusing lamda java 8");
		new Thread(lamdaFunc2).start();
		
		new Thread(() -> System.out.println("\nInside runnableusing lamda java 8")).start();
	}
}