package br.cesed.si.map.fm;

public class Veggie implements Pizza{

	  public String showInfo() {
          return "Veggie";
      }

	  public String prepare() {
		  return "Prepare";
	  }

	  public String cut() {
		  return "Cut";
	  }

	  public String box() {
		  return "Box";
	  }

	public String bake() {
		return "Bake";
	}
}
