package controller1;

public class Thread1 extends Thread {
	
	private String nome;
	//Método Construtor
	public Thread1(String nome) {
		this.nome = nome;
	}
	//Método run();
	public void run() {
		long id = getId();
		System.out.println(nome+id);
	}	
}	

