
public class CapitalStrategyRecorrente extends CapitalStrategy {
    public double capital( Emprestimo emp ){
        return(
            super.capital( emp ) + unusedCapital( emp )
        );
    }

    public double quantidadeRiscoPara( Emprestimo emp ){
        return( emp.proeminenteQuantidadeRisco() );
    }
    
    public double unusedCapital( Emprestimo emp ){
        return(
            emp.quantidadeRiscoNaoUtilizado() *
            duracao( emp ) *
            fatorRiscoNaoUtilizado( emp )
        );
    }
}