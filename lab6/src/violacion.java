/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class violacion extends delito{
    private int edad_victima;

    public violacion() {
    }

    public violacion(int edad_victima, int type, String descripcion, String tipo, String culpabilidad) {
        super(type, descripcion, tipo, culpabilidad);
        this.edad_victima = edad_victima;
    }

    

    

    public int getEdad_victima() {
        return edad_victima;
    }

    public void setEdad_victima(int edad_victima) {
        this.edad_victima = edad_victima;
    }
    
}
