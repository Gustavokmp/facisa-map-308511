package Questao4;

public enum DiasSemana implements TextoParaDiaDaSemana{
	SEGUNDA{
		@Override
		public void print() {
			System.out.println("Triste dia");
			
		}

	},TERCA{
		@Override
		public void print() {
			System.out.println("Um pouco melhor");
			
		}

	},QUARTA{
		@Override
		public void print() {
			System.out.println("Desespero");
			
		}

	},QUINTA{
		@Override
		public void print() {
			System.out.println("Ta chegando");
			
		}

	},SEXTA{
		@Override
		public void print() {
			System.out.println("Aeeeee otimo dia");
			
		}

	},SABADO{
		@Override
		public void print() {
			System.out.println("Dia ideal para dormi");
			
		}

	},DOMINGO{
		@Override
		public void print() {
			System.out.println("Colocando series em dia");
			
		}

	};

	

	
}
