import java.util.ArrayList;

/**
 * Created by diego on 24/06/2017.
 */
public class Serie implements SerieInterface {
    private String nombre;
    private int cantTemporadas;
    private ArrayList<Temporada> temporadas;
    public  Serie(String name)
    {
        this.nombre = name;
        temporadas = new ArrayList<Temporada>();
    }
    private void createSeasonList()
    {
        for(int i = 0 ; i<this.cantTemporadas ; i++)
        {
            Temporada temp = new Temporada(i);
            temporadas.add(temp);

        }

    }

    @Override
    public void setCantTemporadas(int cantTemporadas)
    {
        this.cantTemporadas = cantTemporadas;
        createSeasonList();
    }

    @Override
    public void agregarTemporada() {
        this.cantTemporadas ++;
        Temporada temp = new Temporada(this.cantTemporadas);
        temporadas.add(temp);
    }

    @Override
    public void marcarCapitulo(int ntemp,int ncap)
    {
        this.temporadas.get(ntemp).siMarcar(ncap);
    }

    @Override
    public void desmarcarCapitulo(int ntemp , int ncap) {
        this.temporadas.get(ntemp).noMarcar(ncap);
    }
    public Temporada getTemporada(int temp){
       return temporadas.get(temp);
    }

}
