
public class ParentesDireito extends Decorator{
	

	public ParentesDireito(Caractere caractereDecorator) {
		super(caractereDecorator);
	}

	@Override
	public void imprimir() {
		caractereDecorator.imprimir();
		this.parenteseDireito();
		
	}
	public void parenteseDireito() {
		System.out.print(")");
	}

	

}
