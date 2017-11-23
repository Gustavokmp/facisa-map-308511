package Questao4;

public class App {
	
	public static void main(String[] args) {
		
		Semana dia1 = new Semana(DiasSemana.SEGUNDA);
		Semana dia2 = new Semana(DiasSemana.TERCA);
		Semana dia3 = new Semana(DiasSemana.QUARTA);
		Semana dia4 = new Semana(DiasSemana.QUINTA);
		Semana dia5 = new Semana(DiasSemana.SEXTA);
		Semana dia6 = new Semana(DiasSemana.SABADO);
		Semana dia7 = new Semana(DiasSemana.DOMINGO);
		
		dia1.getDia().print();
		dia2.getDia().print();
		dia3.getDia().print();
		dia4.getDia().print();
		dia5.getDia().print();
		dia6.getDia().print();
		dia7.getDia().print();
	}

}
