public class Circulo
{
    Ponto2D centro;
    float raio;

    Circulo(float r)
    {
        this.centro = new Ponto2D(0,0);
        this.raio = r;
    }

    Circulo(Ponto2D p, float r)
    {
        this.centro = p;
        this.raio = r;
    }

    public float calcula_area()
    {
        return (float)Math.PI * this.raio * this.raio;
    }
}
