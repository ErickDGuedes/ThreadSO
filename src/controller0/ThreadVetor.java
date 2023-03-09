package controller0;
import java.util.Random;

public class ThreadVetor extends Thread{
	
	private int  num;
	private int[] vetor;
	//Método Construtor
	public ThreadVetor(int num, int[] vetor) {
		this.num = num;
		this.vetor = new int[1000];
	}
	//Método run()
	public void run() {
		Random random = new Random();
		//Ímpar
		if(num == 1) {
			double tempoInicial = System.nanoTime();
			for(int i=0; i<vetor.length; i++) {
				vetor[i] = random.nextInt(101);	
			}
			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
			tempoTotal = tempoTotal/Math.pow(10,  9);
			System.out.println("Tempo Total, Ímpar ==> "+tempoTotal+"s.");
		}
		//Par
		else if (num == 2) {
			double tempoInicial = System.nanoTime();
			for(int vezes: vetor) {
				vetor[vezes] = random.nextInt(101);
			}
			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
		    tempoTotal = tempoTotal/Math.pow(10,  9);
			System.out.println("Tempo Total, Par ==> "+tempoTotal+"s.");
		}
	}
}
