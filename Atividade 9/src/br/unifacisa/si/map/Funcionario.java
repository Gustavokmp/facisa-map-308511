package br.unifacisa.si.map;

public class Funcionario {
	
	protected double salarioBase;
    protected int nivel;
    private Gratificacao cargo;
    
    
	public Funcionario(double salarioBase, int nivel, Gratificacao cargo) {
		super();
		this.salarioBase = salarioBase;
		this.nivel = nivel;
		this.cargo = cargo;
	}
	public Gratificacao getCargo() {
		return cargo;
	}
	public void setCargo(Gratificacao cargo) {
		this.cargo = cargo;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
    
    
	

}
