public class ContaPoupanca extends Conta implements Rentavel
{
    ContaPoupanca(double saldo)
    {
        super(saldo);
    }


    public void atualiza(double porcentagem)
    {
        super.deposita(super.get_saldo() * (porcentagem / 100.0));
    }

}
