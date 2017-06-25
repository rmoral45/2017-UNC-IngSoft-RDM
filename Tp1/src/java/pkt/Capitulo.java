/**
 * Created by diego on 24/06/2017.
 */
public class Capitulo {
    private boolean visto;
    private int numero;
    public Capitulo(int n)
    {
        this.numero = n;
        this.visto = false;
    }

    public void siVisto() {
        this.visto = true;
    }

    public void noVisto(){
        this.visto = false;
    }
}
