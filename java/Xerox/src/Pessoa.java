public class Pessoa
{
    String nome;
    String endereco;

    Pessoa(String n, String e)
    {
        this.nome = n;
        this.endereco = e;
    }

    public double calcula_preco(int num_copias)
    {
        return num_copias * 0.2;
    }
}
