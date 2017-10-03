
public class ParentesEsquerdo extends Decorator{
	

	public ParentesEsquerdo(Caractere caractereDecorator) {
		super(caractereDecorator);
	}

	@Override
	public void imprimir() {
		this.parenteseEsquerdo();
		caractereDecorator.imprimir();
		
		
	}
	
	public void parenteseEsquerdo() {
		System.out.print("(");
	}

	
}
