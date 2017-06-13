public class ContaCorrente extends Conta implements Tributavel
{
    ContaCorrente(double saldo)
    {
        super(saldo);
    }

    public void cobra_tributo(double porcentagem)
    {
        super.retira(super.get_saldo() * (porcentagem / 100.0));
    }
}
