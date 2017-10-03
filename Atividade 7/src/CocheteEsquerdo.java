
public class CocheteEsquerdo extends Decorator{

	public CocheteEsquerdo(Caractere caractereDecorator) {
		super(caractereDecorator);

	}

	@Override
	public void imprimir() {
		this.cocheteEsquerdo();
		caractereDecorator.imprimir();
		
	}
	public void cocheteEsquerdo() {
		System.out.print('"');
	}

}
