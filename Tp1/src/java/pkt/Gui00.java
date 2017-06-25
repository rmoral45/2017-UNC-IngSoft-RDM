package pkt; /**
 * Created by Ramiro on 24/6/2017.
 */

import javax.sound.sampled.spi.AudioFileReader;
import javax.swing.*;
import java.awt.*;

import javafx.application.*;
import javafx.scene.layout.BorderPane;
import sun.rmi.runtime.Log;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Gui00 extends JFrame {


    public JPanel panel1 = new JPanel();
    public JPanel panel2 = new JPanel();


    public Gui00() {

        //aca instancio el controller

        super("Don't Forget It");
        setLayout(new GridLayout(2,1));      //Layout de la ventana pcpal

        JLabel img = new JLabel("img.jpg");
        panel1.add(img);


       /* panel1.setLayout(new GridLayout(2, 1, 5, 5));

        JButton CargarButton = new JButton("Cargar serie");
        JButton AgregarButton = new JButton("Agregar Serie");


        MouseListener AgregarListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        };

        AgregarButton.addMouseListener(AgregarListener);


        panel1.add(AgregarButton);
        panel1.setVisible(true);


        panel2.setLayout(new BorderLayout());
        panel2.add(panel1, BorderLayout.EAST);

        add(panel2, BorderLayout.SOUTH);
*/

        setSize(400, 100);
        setVisible(true);
        setDefaultCloseOperation(3);

    }
}
