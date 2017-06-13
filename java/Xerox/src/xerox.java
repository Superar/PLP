public class xerox
{
    public static void main(String[] args)
    {
        Pessoa p = new Pessoa("Fulano", "Rua dos Bobos");
        Aluno a = new Aluno("Marcio", "Rua do Marcio", "Computacao");
        Professor pro = new Professor("Heloisa", "Rua da Heloisa", "Departamendo de Computacao");

        System.out.println("Fulano paga: " + p.calcula_preco(20));
        System.out.println("Marcio paga: " + a.calcula_preco(20));
        System.out.println("Heloisa paga: " + pro.calcula_preco(20));
    }
}
