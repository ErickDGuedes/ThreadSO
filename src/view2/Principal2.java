package view2;
import controller2.MyProcess;
import java.util.Random;

public class Principal2 {

	public static void main(String[] args) {
		int[][] mat = new int [3][5];
		int[] vet = new int [5];
		int[] vet1 = new int[5];
		int[] vet2 = new int[5];
		Random random = new Random();
		
		//Preenche a matriz e os vetores como parâmetro
		for(int l=0; l<3; l++) {
			for(int c=0; c<5; c++) {
				int rand = random.nextInt(11);
				mat[l][c] = rand;
				if(l == 0) {
					vet[c] = mat[l][c];
				}else if(l == 1) {
					vet1[c] = mat[l][c];
				}else if(l == 2) {
					vet2[c] = mat[l][c];
				}
			}
	    }
		//Imprime o resultado da soma np console
			MyProcess process = new MyProcess(vet);
			process.start();
			MyProcess process1 = new MyProcess(vet1);
			process1.start();
			MyProcess process2 = new MyProcess(vet2);
			process2.start();	
	}
}	