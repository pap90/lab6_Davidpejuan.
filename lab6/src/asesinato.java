/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class asesinato extends delito{
    private String arma;
    private int victimas;

    public asesinato() {
    }

    public asesinato(String arma, int victimas, int type, String descripcion, String tipo, String culpabilidad) {
        super(type, descripcion, tipo, culpabilidad);
        this.arma = arma;
        this.victimas = victimas;
    }

    
    

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getVictimas() {
        return victimas;
    }

    public void setVictimas(int victimas) {
        this.victimas = victimas;
    }
    
    
}
