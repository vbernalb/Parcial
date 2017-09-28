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
public class Creneau {

    private String heureDebut;
    private String heureFin;
    
    public Creneau(String hD, String hF) {
        this.heureDebut=hD;
        this.heureFin=hF;
    }


    public String getHeureDebut() {
        return heureDebut;
    }

    public String getHeureFin() {
        return heureFin;
    }
    
    
}
