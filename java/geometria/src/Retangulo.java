public class Retangulo
{
    Ponto2D sup_esq;
    Ponto2D inf_dir;

    Retangulo(Ponto2D a, Ponto2D b)
    {
        this.sup_esq = a;
        this.inf_dir = b;
    }

    public boolean esta_em(Ponto2D p)
    {
        return p.x >= this.sup_esq.x &
                p.x <= this.inf_dir.x &
                p.y >= this.inf_dir.y &
                p.y <= this.sup_esq.y;
    }
}
