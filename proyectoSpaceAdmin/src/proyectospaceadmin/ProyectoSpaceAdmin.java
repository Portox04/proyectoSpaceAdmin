/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//Rama ERICK P

package proyectospaceadmin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author porto
 */
public class ProyectoSpaceAdmin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Ventana Prueba
        JFrame frame = new JFrame("Mi Primera ventana"); 
        //Seleccionar el tamano de la ventana
        frame.setSize(400,300);
        //Indica que se cierre la ventana con la X
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Indica que se vea la pantalla
        frame.setVisible(true);
        
        JLabel label = new JLabel("Preciona aqui:");
        JButton button = new JButton("Click aqui");
        
        //Evento del boton 
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("¡Botón presionado!");
            }
        });
        
        frame.add(label);
        frame.add(button);
        frame.setVisible(true);

    }
    
}