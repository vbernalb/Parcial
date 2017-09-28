/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;
import java.util.ArrayList;
/**
 *
 * @author familia
 */
public class Semaine {

    private Jour[] joursOuvrables = new Jour[5];
    private ArrayList <Salle> salles; 
    private int number = 0;
    private int i = 0;
    
    public Semaine() {
        this.salles = new ArrayList();
    }
        
    public Semaine(Jour dia1) {
        this.joursOuvrables[i] = dia1;
        i++;
    }

    public void Agregardias(Jour dia){
        if(i<5){
            this.joursOuvrables[i] = dia;
            i++;
        }
    }
   
    public void AgregarsegAdia(String fecha, String dia, Creneau seg){ //AGREGA SEGMENTO A DIA, SI EL DIA NO EXISTE LO CREA.
        boolean ac = false;
        for (Jour joursOuvrable : joursOuvrables) {
            ac |= joursOuvrable.getDate().equals(fecha);
            if(ac){
                joursOuvrable.agregarSeg(seg);
                break;
            }
        }
        if(ac==false){
            if(i<5){
                Jour dia1 = new Jour(seg,fecha,dia);
                this.joursOuvrables[i] = dia1;
            }
        }
    }
    
    public ArrayList calculerCreneauxLibres(){
        return null;
    }

    
    public String toString(){
        String info = "";
        for (int j = 0; j < i; j++) {
            info += "Dia:" + joursOuvrables[j].getDate() + " " + joursOuvrables[j].getName() + "\n"  + joursOuvrables[j].toString() + "\n";
        }
        return info;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    
    
    
} 

 

