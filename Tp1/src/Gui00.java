/**
 * Created by Ramiro on 24/6/2017.
 */

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
        setLayout(new BorderLayout());      //Layout de la ventana pcpal


        panel1.setLayout(new GridLayout(1, 3, 5, 5));

        JButton CargarButton = new JButton("Cargar serie");
        JButton AgregarButton = new JButton("Agregar Serie");

        MouseListener CargarListener = new MouseListener() {
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

        CargarButton.addMouseListener(CargarListener);


        panel1.add(CargarButton);
        panel1.add();
        panel1.add();
        panel1.setVisible(true);


        panel2.setLayout(new BorderLayout());
        panel2.add(new JTextField("Ingrese el nombre de la serie    "), BorderLayout.NORTH);
        panel2.add(panel1, BorderLayout.EAST);

        add(panel2, BorderLayout.SOUTH);


        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(3);

    }
}
