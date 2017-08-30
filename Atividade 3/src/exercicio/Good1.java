package exercicio;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

/**
 * Good example of the abstract factory.
 * see: https://brizeno.wordpress.com/category/padroes-de-projeto/abstract-factory/
 */
class Good1 {
  interface FabricaDeCarro {
    CarroSedan criarCarroSedan();
    CarroPopular criarCarroPopular();
  }
  class FabricaFiat implements FabricaDeCarro {
 
    @Override
    public CarroSedan criarCarroSedan() {
        return new Siena();
    }
 
    @Override
    public CarroPopular criarCarroPopular() {
        return new Palio();
    }
  }
  class FabricaFord implements FabricaDeCarro{

	public CarroSedan criarCarroSedan() {
		return new FordKaSedan();
	}

	
	public CarroPopular criarCarroPopular() {
		return new FordaKa();
	}
	  
  }
  
  interface CarroPopular {
    void exibirInfoPopular();
  }
  interface CarroSedan {
    void exibirInfoSedan();
  }
  class FordKaSedan implements CarroSedan{

	public void exibirInfoSedan() {
		System.out.println("Modelo: Forda Ka Sedan\n F�brica: Ford\nCategoria:Sedan");
		
	}
	  
  }
  class FordaKa implements CarroPopular{

	
	public void exibirInfoPopular() {
		System.out.println("Modelo: Forda Ka\n F�brica: Ford\nCategoria:Popular");
		
	}
	  
  }
  
  class Palio implements CarroPopular {
 
 
    public void exibirInfoPopular() {
        System.out.println("Modelo: Palio\nF�brica: Fiat\nCategoria:Popular");
    }
  }
  class Siena implements CarroSedan {
 
    public void exibirInfoSedan() {
        System.out.println("Modelo: Siena\nF�brica: Fiat\nCategoria:Sedan");
    }
  }
  public static void main(String[] args) {
	  Good1 g = new Good1();
	  FabricaFiat fabrica = g.new FabricaFiat();
    CarroSedan sedan = fabrica.criarCarroSedan();
    CarroPopular popular = fabrica.criarCarroPopular();
    sedan.exibirInfoSedan();
    System.out.println();
    popular.exibirInfoPopular();
    System.out.println();
    
    FabricaFord fabrica2 = g.new FabricaFord();
    sedan = fabrica2.criarCarroSedan();
    popular = fabrica2.criarCarroPopular();
    sedan.exibirInfoSedan();
    System.out.println();
    popular.exibirInfoPopular();
  }
}
