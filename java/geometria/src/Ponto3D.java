public class Ponto3D extends Ponto2D
{
    float z;

    Ponto3D(float x, float y, float z)
    {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString()
    {
        return "(" + this.x + ", " + this.y + ", " + this.z + ")";
    }
}
