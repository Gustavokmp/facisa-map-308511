public final class Pizza {

  private final Dough mDough;
  private final Sauce mSauce;
  private final Veggies[] mVeggies;
  private final Pepperoni mPepperoni;
  private final Clams mClams;

  private Pizza(Builder builder) {
    this.mDough = builder.dough;
    this.mSauce = builder.sauce;
    this.mVeggies = builder.veggies;
    this.mPepperoni = builder.peppeoni;
    this.mClams = builder.clams;
  }
  
  public Dough getmDough() {
    return mDough;
  }
  
  public Sauce getmSauce() {
    return mSauce;
  }
  
  public Veggies[] getmVeggies() {
    return mVeggies;
  }
  
  public Pepperoni getmPepperoni() {
    return mPepperoni;
  }
  
  public Clams getmClams() {
    return mClams;
  }
  
}
  
public static class BuilderChicago {

    private final Dough mDough;
	private final Sauce mSauce;
	private final Veggies[] mVeggies;
	private final Pepperoni mPepperoni;
	private final Clams mClams;

    /**
     * Constructor
     */
    public BuilderChicago(Dough dough, Sauce sauce) {
		if (dough == null || sauce == null) {
        throw new IllegalArgumentException("dough and sauce can not be null");
      }
      this.mDough = dough;
      this.mSauce = sauce;
	  
    }
	
	

	public Builder withVeggies(Veggies veggies) {
      this.mVeggies = veggies;
      return this;
    }	

	
	public Builder withmPepperoni(Pepperoni pepperoni) {
      this.mPepperoni = pepperoni;
      return this;
    }
	
	public Builder withClams(Clams clams) {
      this.mClams = clams;
      return this;
    }
	
	public Pizza build() {
      return new Pizza(this);
    }

}

public enum Dough {

  FINA, GROSSA, BORDA_RECHEADA;

  @Override
  public String toString() {
    return name().toLowerCase();
  }

}

public enum Sauce {

  TOMATE, MODA_CASA;

  @Override
  public String toString() {
    return name().toLowerCase();
  }

}

public enum Pepperoni {

  CARNE, PORCO;

  @Override
  public String toString() {
    return name().toLowerCase();
  }

}

public enum Clams {

  OSTRA, LULA, MEXILHÃO;

  @Override
  public String toString() {
    return name().toLowerCase();
  }

}



	
public class App {

  private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

  /**
   * Program entry point
   * 
   * @param args command line args
   */
  public static void main(String[] args) {

    Pizza pizza =
        new Pizza.BuilderChicago(Dough.Fina, Sauce.TOMATE).withmPepperoni(Pepperoni.CARNE)
            .withClams(Clams.MEXILHÃO).build();
    LOGGER.info(pizza.toString());


  }
}