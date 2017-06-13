public class geometria
{
    public static void main(String[] args)
    {
        Ponto2D p = new Ponto2D(2, 3);
        Retangulo r = new Retangulo(new Ponto2D(1,4), new Ponto2D(6,1));

        if(r.esta_em(p))
        {
            System.out.println(p + " esta no retangulo.");
        }
        else
        {
            System.out.println("Nao esta.");
        }

        Circulo c1 = new Circulo(3);
        Circulo c2 = new Circulo(p, 3);

        System.out.println("Area c1 = " + c1.calcula_area());
        System.out.println("Area c2 = " + c2.calcula_area());

        Cilindro cil1 = new Cilindro(3, 5);
        Cilindro cil2 = new Cilindro(p, 3, 5);

        System.out.println("Volume cil1 = " + cil1.calcula_volume());
        System.out.println("Colume cil2 = " + cil2.calcula_volume());
    }
}