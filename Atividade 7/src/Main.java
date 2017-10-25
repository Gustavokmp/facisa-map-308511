
public class Main {
	
	public static void main(String[] args) {
		
		Caractere decorator = new NumeroUm();
		decorator = new ParentesEsquerdo(new NumeroUm());
		decorator = new CocheteEsquerdo(decorator);
		decorator = new ChaveEsquerda(decorator);
		decorator = new ParentesDireito(decorator);
		decorator = new CocheteDireito(decorator);
		decorator = new ChaveDireita(decorator);
		decorator.imprimir();
		System.out.println();
	}

}
