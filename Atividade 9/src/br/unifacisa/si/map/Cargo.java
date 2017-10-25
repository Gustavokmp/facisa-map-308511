package br.unifacisa.si.map;

public enum Cargo implements Gratificacao{	
	
	DESENVOVEDOR {

		@Override
		public double calcularGratificacao(Funcionario umFuncionario) {
			if (umFuncionario.getNivel() >= 2) {
                return umFuncionario.getSalarioBase() * 1.25;
            }
            return umFuncionario.getSalarioBase() * 1.15;
		}
		
	},
	LIDER {

		@Override
		public double calcularGratificacao(Funcionario umFuncionario) {
			if (umFuncionario.getNivel() >= 2) {
                return umFuncionario.getSalarioBase() * 1.35;
            }
            return umFuncionario.getSalarioBase() * 1.25;
		}
		
	};
	
	
}
