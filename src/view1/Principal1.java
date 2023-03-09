package view1;

import controller1.Thread1;

public class Principal1 {

	public static void main(String[] args) {
		
		Thread1 thread1 = new Thread1("Thread ID #");
		Thread1 thread2 = new Thread1("Thread ID #");
		Thread1 thread3 = new Thread1("Thread ID #");
		Thread1 thread4 = new Thread1("Thread ID #");
		Thread1 thread5 = new Thread1("Thread ID #");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
	}
}

