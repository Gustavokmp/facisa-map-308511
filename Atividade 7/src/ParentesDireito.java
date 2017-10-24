
public class ParentesDireito extends Decorator{
	

	public ParentesDireito(Caractere caractereDecorator) {
		super(caractereDecorator);
	}

	@Override
	public void imprimir() {
		caractereDecorator.imprimir();
		this.direito();
		
	}
	public void direito() {
		System.out.print(")");
	}

	

}
