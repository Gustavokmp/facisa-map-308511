package Questao4;

public class ContaBancaria {
	private String nome;
	private String cpf;
	private double saldo;
	
	
	public ContaBancaria(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	public void depositar(double valor){
		saldo += valor;
	}
	public void sacar(double valor){
		saldo -= valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
