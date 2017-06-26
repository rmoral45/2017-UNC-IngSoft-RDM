import java.util.ArrayList;

/**
 * Created by diego on 24/06/2017.
 */
public class Temporada {
    private int numero;
    private int cantCapitulos;
    private ArrayList<Capitulo> capitulos;
    public Temporada(int n)
    {
        this.numero = n;
        this.cantCapitulos = 0;
        this.capitulos = new ArrayList<Capitulo>();
    }

    public void setCantCapitulos(int cantCapitulos)
    {
        this.cantCapitulos = cantCapitulos;
        for(int i = 0; i<this.cantCapitulos;i++)
        {
            Capitulo cap = new Capitulo(i);
            this.capitulos.add(cap);
        }
    }
    public void siMarcar(int c)
    {
        capitulos.get(c).siVisto();
    }
    public void noMarcar(int c)
    {
        capitulos.get(c).noVisto();
    }
}
