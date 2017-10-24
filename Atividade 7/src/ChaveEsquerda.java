
public class ChaveEsquerda extends Decorator{

	public ChaveEsquerda(Caractere caractereDecorator) {
		super(caractereDecorator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimir() {
		this.esquerda();
		caractereDecorator.imprimir();
	}

	public void esquerda() {
		System.out.print("{");
	}
}
