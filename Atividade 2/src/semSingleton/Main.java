package semSingleton;

public class Main {
	public static void main(String[] args) {
	    FabricaDeCarro fabrica = new FabricaDeCarro();
	    System.out.println(fabrica.criarCarroFiat());
	    System.out.println(fabrica.criarCarroFord());
	    System.out.println(fabrica.criarCarroVolks());
	 
	    System.out.println(fabrica.gerarRelatorio());
	 /* Uma forma que quebra o codigo � se fizemos o sequinte*/
	    fabrica = new FabricaDeCarro();
	    System.out.println(fabrica.gerarRelatorio());
	    /*Dessa madeira todos os dados ser�o apagados odas as informa��es est�o ligadas a uma inst�ncia, quando alteramos a inst�ncia, perdemos todas as informa��es*/
	}

}
