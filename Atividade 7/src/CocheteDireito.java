
public class CocheteDireito extends Decorator{

	public CocheteDireito(Caractere caractereDecorator) {
		super(caractereDecorator);
	}

	@Override
	public void imprimir() {
		caractereDecorator.imprimir();
		this.direito();
		
	}
	
	public void direito() {
		System.out.print('"');
	}
	

}
