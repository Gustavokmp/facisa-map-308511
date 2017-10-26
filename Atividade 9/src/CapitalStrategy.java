
public abstract class CapitalStrategy {
    public double capital( Emprestimo emp ){
        return( quantidadeRiscoPara( emp ) * duracao( emp ) * fatorRisco( emp ) );
    }

    public abstract double quantidadeRiscoPara( Emprestimo emp );
}