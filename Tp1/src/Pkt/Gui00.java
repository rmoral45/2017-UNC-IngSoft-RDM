package Pkt; /**
 * Created by Ramiro on 24/6/2017.
 */

import javax.swing.*;
import java.awt.*;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class Gui00 extends JFrame {


    public JPanel panel1 = new JPanel();
    public JPanel panel2 = new JPanel();
    public JButton agregoSerie = new JButton("Agregar Serie");
    public ProgramController controller = new ProgramController();
    public ArrayList<String> nombres;


    public Gui00() {

        super("Don't Forget It");
        setLayout(new GridLayout(2,1));

        //PANEL1
        panel1.setLayout(new FlowLayout());
        JLabel img = new JLabel(new ImageIcon("E:\\GitHub\\2017-UNC-IngSoft-RDM\\Tp1\\images\\img1.jpg"));
        panel1.add(img);
        add(panel1);


        //PANEL2
        nombres = controller.getNombres();
        String[] arraydenombres = nombres.toArray(new String [nombres.size()]);
        JComboBox<String> listaDeSeries = new JComboBox<String>(arraydenombres);


        panel2.setLayout(new GridLayout(1,2));
        panel2.add(listaDeSeries);
        listaDeSeries.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                int state = e.getStateChange();
                if(state == e.SELECTED)
                    controller.selected(listaDeSeries.getSelectedItem().toString());
            }
        });
        panel2.add(agregoSerie);


        add(panel2);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(3);

    }
}
