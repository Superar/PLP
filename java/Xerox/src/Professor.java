public class Professor extends Pessoa
{
    String departamento;

    Professor(String n, String e, String d)
    {
        super(n, e);
        this.departamento = d;
    }

    public double calcula_preco(int num_copias)
    {
        return 0.8 * super.calcula_preco(num_copias);
    }
}
