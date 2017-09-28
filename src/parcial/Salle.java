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
public class Salle {

    private ArrayList <Semaine> semaines = new ArrayList();
    private String nombre;
    private int i = 0;

    
    
    public Salle(Semaine semana,String nombre) { 
        int i = semaines.size();
        i++;
        semana.setNumber(i);
        semaines.add(semana);
        this.nombre = nombre;
    }
    
    public void agregarSemana(Semaine semana){
        int i = semaines.size();
        i++;
        semana.setNumber(i);
        semaines.add(semana);
    }

    public void AgregardiaAsemana(int semana, Jour dia){ // AGREGA DIA A SEMANA, SI LA SEMANA NO EXISTE, LA CREA.
        boolean ac = false;
        for (Semaine semaine : semaines) {
            ac |= semaine.getNumber()==semana;
            if(ac){
                semaine.Agregardias(dia);
                break;
            }
        }
        if(ac == false){
            Semaine sem = new Semaine(dia);   
            int i = semaines.size();
            i++;
            sem.setNumber(i);
            semaines.add(sem);
        }
    }
    
    
    public String toString(){
        String info = "";
        for (Semaine semaine : semaines) {
            info += "Semana No: " + semaine.getNumber() + "\n" + semaine.toString() + "\n";
        }
        return info;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void SaD(int semana, String fecha, String dia, Creneau seg){
        for (Semaine semaine : semaines) {
            if(semaine.getNumber()==semana){
                semaine.AgregarsegAdia(fecha, dia, seg);
                break;
            }
        }
    }    
}
