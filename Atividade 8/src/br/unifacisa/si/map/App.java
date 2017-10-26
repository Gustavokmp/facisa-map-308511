package br.unifacisa.si.map;

public class App {
	
	public static void main(String[] args) {
		
		
		
		Funcionario f1 = new Funcionario(2100, 1, Cargo.DESENVOVEDOR);
		System.out.println(f1.getCargo().calcularGratificacao(f1));
		
		Funcionario f2 = new Funcionario(2100, 2, Cargo.DESENVOVEDOR);
		System.out.println(f2.getCargo().calcularGratificacao(f2));
		
		Funcionario f3 = new Funcionario(2100, 1, Cargo.LIDER);
		System.out.println(f3.getCargo().calcularGratificacao(f3));
		
		Funcionario f4 = new Funcionario(2100, 2, Cargo.LIDER);
		System.out.println(f4.getCargo().calcularGratificacao(f4));
	}

}
