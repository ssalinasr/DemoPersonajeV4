/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import java.util.ArrayList;

/**
 *
 * @author estudiantes
 */
public class Notifier{
    
    private static ArrayList<Observer> observers;
    
    public Notifier(){
        observers = new ArrayList<>();
    }
    
    public void attach(Observer obs){
        observers.add(obs);
    }
    
    public void deattach(Observer obs){
        observers.remove(obs);
    }
    
    public void notifier(){
        for(int i = 0; i < observers.size(); i++){
            observers.get(i).update();
        }
    }
    
}
