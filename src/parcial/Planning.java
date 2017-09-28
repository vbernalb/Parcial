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
public class Planning {

    private ArrayList <Salle> salles;
    
    public Planning() {
        this.salles = new ArrayList();
    }
    
    public void CrearProg(Salle sala){
        salles.add(sala);
    }
    
    public void AgregarsemanaAsala(String sala, Semaine sem){
        boolean ac = false;
        for (Salle salle : salles) {
            ac |= salle.getNombre()==sala;
            if(ac){
                salle.agregarSemana(sem);
                break;
            }
        }
        if(ac == false){
            Salle sala1 = new Salle(sem,sala);
            salles.add(sala1);
        }
    }
    
    public String programa(){
        String info = "";
        for (Salle salle : salles) {
            info += salle.getNombre() + "\n" + salle.toString() + "\n";
        }
        return info;
    }

    public ArrayList<Salle> getSalles() {
        return salles;
    }
    
    public void DaS(String sala, int semana, Jour dia){
        for (Salle salle : salles) {
            if(salle.getNombre().equals(sala)){
                salle.AgregardiaAsemana(semana,dia);
            }
        }
    }
    
    public void SaD(String sala, int semana, String fecha, String dia, Creneau seg){
        for (Salle salle : salles) {
            if(salle.getNombre().equals(sala)){
                salle.SaD(semana, fecha, dia, seg);
                break;
            }
        }
    }
    
}
