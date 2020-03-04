/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author estudiantes
 */
public class FaseUno implements Estado {

    Thread comprobante;

    @Override
    public void transformar(JLabel lbl, Personaje personaje, JButton btn, JLabel lbl2) {
        Contador contador = new Contador(personaje);
        contador.start();
        ImageIcon img = new ImageIcon(getClass().getResource("/img/200w.gif"));
        Image imgEscalada = img.getImage().getScaledInstance(lbl.getWidth(),
                lbl.getHeight(), Image.SCALE_DEFAULT);
        ImageIcon iconoEscalado = new ImageIcon(imgEscalada);
        lbl.setIcon(iconoEscalado);
        personaje.setPoder(40);
        personaje.setVelocidad(50);

        hilo(personaje, btn, lbl2);
        /*
        if (personaje.getEnergia() > 90) {
            personaje.setTransformar(true);
        } else {
            personaje.setTransformar(false);
        }*/
    }

    public void hilo(Personaje personaje, JButton btn, JLabel lbl2) {
        this.comprobante = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    String text = "<html><strong>" + personaje.getNombre() + " Fase 1: <br>"
                            + "Velocidad: " + personaje.getPoder() + "<br>"
                            + "Poder: " + personaje.getPoder() + "<br>"
                            + "Energia: " + personaje.getEnergia()
                            + "</strong></html>";
                    lbl2.setText(text);
                    if (personaje.getEnergia() > 35) {
                        personaje.setTransformar(true);
                    } else {
                        personaje.setTransformar(false);
                        btn.setEnabled(false);
                    }
                }

            }
        });
        this.comprobante.start();
         btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                comprobante.stop();
            }
            
        });
        if (!personaje.isTransformar()) {
            this.comprobante.stop();
        }
    }

}
