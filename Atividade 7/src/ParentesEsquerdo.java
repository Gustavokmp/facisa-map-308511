
public class ParentesEsquerdo extends Decorator{
	

	public ParentesEsquerdo(Caractere caractereDecorator) {
		super(caractereDecorator);
	}

	@Override
	public void imprimir() {
		this.esquerdo();
		caractereDecorator.imprimir();
		
		
	}
	
	public void esquerdo() {
		System.out.print("(");
	}

	
}
