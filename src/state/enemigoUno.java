/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import javax.swing.JOptionPane;

/**
 *
 * @author estudiantes
 */
public class enemigoUno implements Observer{

    @Override
    public void update() {
        JOptionPane.showMessageDialog(null,"El enemigo 1 es demasiado debil y se ha rendido, F por el","Mensaje",1);
    }
    
}
