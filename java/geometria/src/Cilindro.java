public class Cilindro extends Circulo
{
    float altura;

    Cilindro(float r, float h)
    {
        super(r);
        this.altura = h;
    }

    Cilindro(Ponto2D c, float r, float h)
    {
        super(c, r);
        this.altura = h;
    }

    public float calcula_volume()
    {
        return super.calcula_area() * this.altura;
    }
}
