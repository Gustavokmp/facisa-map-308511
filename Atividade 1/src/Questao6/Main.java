package Questao6;

public class Main {
	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria("Gustavo", "147852");
		conta.depositar(100.00);
		System.out.println(conta.getNome());
		System.out.println(conta.getCpf());
		System.out.println(conta.getSaldo());
		conta.sacar(50);
		System.out.println(conta.getSaldo());
		
	}

}
