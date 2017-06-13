public class ContaInvestimento extends Conta implements Rentavel, Tributavel
{
    ContaInvestimento(double saldo)
    {
        super(saldo);
    }

    public void atualiza(double porcentagem)
    {
        super.deposita(super.get_saldo() * (porcentagem / 100.0));
    }

    public void cobra_tributo(double porcentagem)
    {
        super.retira(super.get_saldo() * (porcentagem / 100.0));
    }
}
