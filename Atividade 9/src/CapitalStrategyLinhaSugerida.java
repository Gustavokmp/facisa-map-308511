
public class CapitalStrategyLinhaSugerida extends CapitalStrategy {
    public double quantidadeRiscoPara( Emprestimo emp ){
        return(
            emp.getComprometimento() *
            emp.getPorcentagemNaoUtilizada()
        );
    }
}