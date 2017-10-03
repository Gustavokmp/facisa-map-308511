
public class ChaveEsquerda extends Decorator{

	public ChaveEsquerda(Caractere caractereDecorator) {
		super(caractereDecorator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimir() {
		this.chaveEsquerda();
		caractereDecorator.imprimir();
	}

	public void chaveEsquerda() {
		System.out.print("{");
	}
}
