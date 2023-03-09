package view0;

import controller0.ThreadVetor;

public class Principal0 {

	public static void main(String[] args) {
		int[] vetor = new int[1000];
		
		ThreadVetor impar = new ThreadVetor(1, vetor);
		impar.start();
		ThreadVetor par = new ThreadVetor(2, vetor);
		par.start();
	}
}
