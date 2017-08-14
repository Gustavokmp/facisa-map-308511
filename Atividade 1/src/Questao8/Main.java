package Questao8;

public class Main {
	public static void main(String[] args) {
		ContaBancaria gustavo = new ContaBancaria("Gustavo", "147852");
		gustavo.depositar(100.00);
		System.out.println(gustavo.getNome());
		System.out.println(gustavo.getCpf());
		System.out.println(gustavo.getSaldo());
		gustavo.sacar(50);
		System.out.println(gustavo.getSaldo());
		
	}

}
