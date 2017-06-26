import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by diego on 24/06/2017.
 */
public class ProgramModel {
    private HashMap<String,Serie> series;
    public ProgramModel()
    {
        series = new HashMap<String,Serie>();

    }
    public void addSerie(String s){
        Serie serie = new Serie(s);
        this.series.put(s,serie);
    }
    public void setTemporadas(String s,int temp){
        this.series.get(s).setCantTemporadas(temp);
    }
    public void setCapitulos(String s,int temp,int caps) {
        this.series.get(s).getTemporada(temp).setCantCapitulos(caps);
    }
}
