public class principal
{
    public static void main(String[] args)
    {
        ManipulaStrings manipulador = new ManipulaStrings();

        System.out.println(manipulador.manipula1("abacaxi"));
        System.out.println(manipulador.manipula1("bacana"));
        System.out.println(manipulador.manipula1("caqui"));
        System.out.println(manipulador.manipula1("zebra"));

        System.out.println(manipulador.manipula2("azulbonitobrancobrancoazulbonitobrancobonitoazul"));

        System.out.println(manipulador.conta_char('a', "banana"));

        System.out.println(manipulador.elimina_char('a', "banana"));
    }
}
