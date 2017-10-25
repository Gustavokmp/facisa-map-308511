
public class CocheteEsquerdo extends Decorator{

	public CocheteEsquerdo(Caractere caractereDecorator) {
		super(caractereDecorator);

	}

	@Override
	public void imprimir() {
		this.esquerdo();
		caractereDecorator.imprimir();
		
	}
	public void esquerdo() {
		System.out.print('"');
	}

}
