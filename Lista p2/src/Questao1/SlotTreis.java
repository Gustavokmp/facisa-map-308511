package Questao1;

public class SlotTreis extends MachineChain{

	public SlotTreis() {
		super(Slots.SLOT_TREIS);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double formaDePagamento() {
		System.out.println("SlotTreis: 0,50 centavos");
		double pagamento = 0.50 * getDinheiro();
		double troco = pagamento - getProdutoValor();
		if (pagamento == getProdutoValor()) {
			System.out.println("Produto: " + getProdutoNome()
					+ "\nValue:" + getProdutoValor() + "\nNão Pago");
		} else {
			System.out.println("Produto: " + getProdutoNome()
					+ "\nValue:" + getProdutoValor() + "\nTroco:" + troco);
		}
		return pagamento;
	}

}
