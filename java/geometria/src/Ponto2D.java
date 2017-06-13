public class Ponto2D
{
    float x, y;

    Ponto2D(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString()
    {
        return "(" + this.x + ", " + this.y + ")";
    }
}
