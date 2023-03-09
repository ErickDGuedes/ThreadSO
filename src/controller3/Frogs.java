package controller3;

import java.util.Random;

public class Frogs extends Thread{
	
	private String frog;
	private int num;
   
	//Método construtor
	public Frogs(String frog, int num) {
		this.frog = frog;
		this.num = num;
		
	}
	//Método run()
	public void run() {
		Random random = new Random();
		int pulo = 0;
		int somaPulo = 0;
		int sleep = random.nextInt(10)*200;
		int metros = 20;
		String chegou = frog + "Chegou!";
		//Define a Distância dos pulos dos sapos
		while(somaPulo < metros) {
			pulo = random.nextInt(5);
			somaPulo = somaPulo + pulo;
			System.out.println(frog+ " pulou "+somaPulo+ " metros");
			try {
				Thread.sleep(sleep);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		if(somaPulo >= metros && chegou.contains("Chegou!")) {
			try {
				Thread.sleep(18300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println();
			System.out.println("Sapo "+num+" Chegou!");
		}
		
	}
	
}

