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
public class enemigoTres implements Observer{

    @Override
    public void update() {
        JOptionPane.showMessageDialog(null,"El enemigo 3 esta listo para enfrentarle, usará su fase 4, F por usted","Mensaje",1);
    }
    
}
