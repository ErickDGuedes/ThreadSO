package controller2;

public class MyProcess extends Thread{
	
	private int[] vet;
	
	//Método Construtor
	public MyProcess(int[] vet) {
		this.vet = vet;
	}
	//Thread
	public void run() {
		int soma = 0;
		
		for(int i=0; i<5; i++) {
			soma = soma + vet[i];
		}
		System.out.println("Resultado da soma ==> "+soma);
	}
}