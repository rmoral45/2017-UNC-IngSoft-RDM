import java.util.ArrayList;

/**
 * Created by Ramiro on 25/6/2017.
 */
public class ProgramController implements ControllerInterface {

    public ProgramController(){

    }

    @Override
    public ArrayList<String> getNombres() {

        ArrayList<String> nombres = new ArrayList<String>(2);

        nombres.add("GoT");
        nombres.add("asda");
        return nombres;
    }

    public void selected(String name){

        //llamar al modelo y pasarle la serie selccionada
    }

    @Override
    public void agregarSerie() {

    }
}
