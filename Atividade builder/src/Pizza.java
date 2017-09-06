import java.util.Arrays;

public final class Pizza {

	private  Queijos queijo;
	private  Massas massa;
	private  Vegetais[] vegetais;
	private  TiposPizza[] tipos;
	private int posV = 0;
	private int posT = 0;
	
	
	public Pizza(Builder builder) {
		this.queijo = builder.queijo;
		this.massa = builder.massa;
	}
	
	public Queijos getQueijo() {
		return queijo;
	}
	public Massas getMassa() {
		return massa;
	}
	public Vegetais[] getVegetais() {
		return vegetais;
	}
	public TiposPizza[] getTipos() {
		return tipos;
	}
	
	public int getPosV() {
		return posV;
	}

	public void setPosV(int posV) {
		this.posV = posV;
	}



	public int getPosT() {
		return posT;
	}



	public void setPosT(int posT) {
		this.posT = posT;
	}



	public void setQueijo(Queijos queijo) {
		this.queijo = queijo;
	}



	public void setMassa(Massas massa) {
		this.massa = massa;
	}



	public void setVegetais(Vegetais vegetal) {
		this.vegetais[this.posV] = vegetal;
		this.posV++;
	}



	public void setTipos(TiposPizza tipo) {
		this.tipos[posT] = tipo;
		this.posT++;
	}



	@Override
	public String toString() {
		return "Pizza [queijo=" + queijo + ", massa=" + massa + ", vegetais=" + Arrays.toString(vegetais) + ", tipos="
				+ Arrays.toString(tipos) + "]";
	}
	
	public static class Builder{
		private  Queijos queijo;
		private  Massas massa;
		
		
		
		public Builder(Queijos queijo, Massas massa) {
			this.queijo = queijo;
			this.massa = massa;
		}

		public Builder queijo(Queijos queijo) {
			this.queijo = queijo;
			return this;
		}
		
		public Builder massas(Massas massa) {
			this.massa = massa;
			return this;
		}
		
		public Pizza build() {
			return new Pizza(this);
		}
		
	}

	
	
}

