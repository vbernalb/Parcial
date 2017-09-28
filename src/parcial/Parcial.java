/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author familia
 */
public class Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Planning prog = new Planning();
        
        
                Creneau seg1 = new Creneau("10:00","12:00");
        Creneau seg2 = new Creneau("11:00","13:00");
        Creneau seg3 = new Creneau("12:00","14:00");
        Creneau seg4 = new Creneau("13:00","15:00");
        Jour dia1 = new Jour(seg1,"20 de marzo", "Miercoles");
        Jour dia2 = new Jour(seg3,"21 de marzo", "Jueves");
        Semaine semana1 = new Semaine(dia1);
        Semaine semana2 = new Semaine(dia2);
        Salle sala1 = new Salle(semana1, "Sala1");
        
        
        prog.CrearProg(sala1);
        
        prog.SaD("Sala1", 1, "20 de marzo", "Miercoles", seg4);
        prog.DaS("Sala1", 1, dia2);

        prog.AgregarsemanaAsala("Sala1", semana2);
        prog.SaD("Sala1", 2, "21 de marzo", "Jueves", seg4);
        prog.DaS("Sala1", 2, dia1);
        
        
        
        Jour dia3 = new Jour(seg2, "1 de marzo", "lunes");
        Jour dia4 = new Jour(seg4, "2 de marzo", "martes");
        Semaine semana3 = new Semaine(dia3);
        Semaine semana4 = new Semaine(dia4);
        Salle sala2 = new Salle(semana3, "Sala2");
        
        
        prog.CrearProg(sala2);
       
        prog.SaD("Sala2", 1, "1 de marzo", "lunes", seg4);
        prog.DaS("Sala2", 1, dia4);
        
        prog.AgregarsemanaAsala("Sala2", semana4);
        prog.SaD("Sala2", 2, "2 de marzo", "martes", seg4);
        prog.DaS("Sala2", 2, dia3);
        
        System.out.println("El programa es: \n" + prog.programa());
    }
    
}
