
public class CapitalStrategyTempoLimitado extends CapitalStrategy {
    public double quantidadeRiscoPara( Emprestimo emp ){
        return( emp.getComprometimento() );
    }

    public double duracao( Emprestimo emp ){
        return( pesoDuracaoMedia( emp ) );
    }

    private double pesoDuracaoMedia( Emprestimo emp ){...}
}