package semSingleton;

public class Main {
	public static void main(String[] args) {
	    FabricaDeCarro fabrica = new FabricaDeCarro();
	    System.out.println(fabrica.criarCarroFiat());
	    System.out.println(fabrica.criarCarroFord());
	    System.out.println(fabrica.criarCarroVolks());
	 
	    System.out.println(fabrica.gerarRelatorio());
	 /* Uma forma que quebra o codigo é se fizemos o sequinte*/
	    fabrica = new FabricaDeCarro();
	    System.out.println(fabrica.gerarRelatorio());
	    /*Dessa madeira todos os dados serão apagados odas as informações estão ligadas a uma instância, quando alteramos a instância, perdemos todas as informações*/
	}

}
