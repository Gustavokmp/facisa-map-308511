package Questao1;

public class App {
	
	public static void main(String[] args) {
		
		MachineChain moedasSlot = new SlotTreis();
		moedasSlot.setNextSlots(new SlotDois());
		moedasSlot.setNextSlots(new SlotUm());

		moedasSlot.setProdutoNome("Cuscuz");
		moedasSlot.setProdutoValor(2.0);;
		moedasSlot.setDinheiro(20);

		try {
			moedasSlot.pagamentoSlot(Slots.SLOT_UM);
			moedasSlot.pagamentoSlot(Slots.SLOT_DOIS);
			moedasSlot.pagamentoSlot(Slots.SLOT_TREIS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
