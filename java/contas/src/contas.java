public class contas
{
    public static void main(String[] args)
    {
        ContaCorrente cc = new ContaCorrente(100.00);
        ContaInvestimento ci = new ContaInvestimento(100.00);
        ContaPoupanca cp = new ContaPoupanca(100.00);

        cc.cobra_tributo(0.1);
        System.out.println("CC: " + cc.get_saldo());

        ci.cobra_tributo(0.1);
        System.out.println("CI - cobra: " + ci.get_saldo());
        ci.atualiza(1);
        System.out.println("CI - atualiza: " + ci.get_saldo());

        cp.atualiza(0.1);
        System.out.println("CP: " + cp.get_saldo());
    }
}
