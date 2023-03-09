package view3;

import controller3.Frogs;

public class Principal3 {

	public static void main(String[] args) {
	
		//Threads
		for(int i=1; i<6; i++) {
		Frogs process = new Frogs("Sapo "+i, i);
		process.start();
		}
	}
	
}
