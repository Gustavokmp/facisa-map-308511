package Questao9;

public class App {
	
	public static void main(String args[]){
		System.out.println("Polimorfismo\n");
		Mam�fero mamifero1 = new Elefante();
		System.out.println("Cota diaria de leite do elefante: " + mamifero1.obterCotaDiariaDeLeite());
		Mam�fero mamifero2 = new Rato();
		System.out.println("Cota diaria de leite do rato: " + mamifero2.obterCotaDiariaDeLeite());
	}


}
