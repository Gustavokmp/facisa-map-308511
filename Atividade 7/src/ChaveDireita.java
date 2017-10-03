
public class ChaveDireita extends Decorator{

	public ChaveDireita(Caractere caractereDecorator) {
		super(caractereDecorator);

	}

	@Override
	public void imprimir() {
		caractereDecorator.imprimir();
		this.chaveDireita();
		
	}
	
	public void chaveDireita() {
		System.out.println("}");
	}

}
