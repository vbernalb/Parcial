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
public class Jour {
    
    private ArrayList <Creneau> creneaux = new ArrayList();
    private String date;
    private String name;
    
    public Jour(Creneau segmento1, String date, String name) {
        creneaux.add(segmento1);
        this.date = date;
        this.name = name;
    }
    
    public void agregarSeg(Creneau seg){ //AGREGA SEGMENTO
        creneaux.add(seg);
    }
    
    public String toString(){
        String info = "";
        for (Creneau creneau : creneaux) {
            info += "Hora de inicio: " + creneau.getHeureDebut() + "\nHora de terminación: " + creneau.getHeureFin() + "\n";
        }
        return info;
    }

    public ArrayList<Creneau> getCreneaux() {
        return creneaux;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }
    
    
    
}
