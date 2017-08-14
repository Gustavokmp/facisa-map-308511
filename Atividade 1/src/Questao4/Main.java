package Questao4;

public class Main {
	public static void main(String[] args) {
		ContaBancaria contaGustavo = new ContaBancaria("Gustavo", "147852");
		contaGustavo.depositar(100.00);
		System.out.println(contaGustavo.getNome());
		System.out.println(contaGustavo.getCpf());
		System.out.println(contaGustavo.getSaldo());
		contaGustavo.sacar(50);
		System.out.println(contaGustavo.getSaldo());
		
	}

}
