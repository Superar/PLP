public class Conta
{
    double saldo;

    Conta(double saldo)
    {
        this.saldo = saldo;
    }

    public double get_saldo()
    {
        return saldo;
    }

    public void deposita(double valor)
    {
        this.saldo = this.saldo + valor;
    }

    public void retira(double valor)
    {
        if(valor <= this.saldo)
        {
            this.saldo = this.saldo - valor;
        }
    }
}
