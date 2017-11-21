
public enum Type{
	FEE("fee"),
	PHI("phi"),
	PHEAUX("pheaux");
	
	private String nome;

	private Type(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	

	
}
