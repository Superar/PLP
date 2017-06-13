public class Aluno extends Pessoa
{
    String curso;

    Aluno(String n, String e, String c)
    {
        super(n, e);
        this.curso = c;
    }

    public double calcula_preco(int num_copias)
    {
        return 0.5 * super.calcula_preco(num_copias);
    }
}
