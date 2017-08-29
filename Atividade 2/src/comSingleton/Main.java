package comSingleton;

public class Main {
	public static void main(String[] args) {
	    FabricaDeCarro fabrica = FabricaDeCarro.getInstancia();
	    System.out.println(fabrica.criarCarroFiat());
	    System.out.println(fabrica.criarCarroFord());
	    System.out.println(fabrica.criarCarroVolks());
	    System.out.println(fabrica.gerarRelatorio());
	    /*Agora peceba que mesmo que criemos outra instancia não ira se perde os dados*/
	    fabrica = FabricaDeCarro.getInstancia();
	    System.out.println(fabrica.gerarRelatorio());
	}

}
