
public class CocheteDireito extends Decorator{

	public CocheteDireito(Caractere caractereDecorator) {
		super(caractereDecorator);
	}

	@Override
	public void imprimir() {
		caractereDecorator.imprimir();
		this.cocheteDireito();
		
	}
	
	public void cocheteDireito() {
		System.out.print('"');
	}
	

}
