public class exerciciosa
{
    public static void main(String[] args)
    {
        double [] vetor = {3.5, -5.2, 1.0, 2.0, 15.3};
        double media = 0;

        for (double aVetor : vetor)
        {
            media = media + aVetor;
        }

        System.out.println("Media: " + media/vetor.length);
    }
}
