import com.sun.prism.Image;

public abstract class FilterOp {
	
	private FilterOp nextOp;
	
	public FilterOp nextOp(FilterOp o) {
		this.nextOp = o;
		return o;
	}
	
	public void apply(Image img) {
		op(img);
		this.nextOp.apply(img);
	}
	
	public abstract void op(Image i) ;
}

class FabricaDeFiltros {
	
	public FilterOp gotham() {
		FilterOp f = new Modulate(120,10,100)
			.nextOp(new Fill(#222b6d))
			.nextOp(new Gamma(0.5))
			.nextOp(new Contrast());
		return f;
	}
	
	public FilterOp sky() {
		FilterOp f = new Modulate(120,10,100)
			.nextOp(new Fill(#0000FF))
			.nextOp(new Gamma(1))
			.nextOp(new Contrast());
		return f;
	}
	
}
