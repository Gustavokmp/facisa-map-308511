
public class ChaveDireita extends Decorator{

	public ChaveDireita(Caractere caractereDecorator) {
		super(caractereDecorator);

	}

	@Override
	public void imprimir() {
		caractereDecorator.imprimir();
		this.direita();
		
	}
	
	public void direita() {
		System.out.println("}");
	}

}
