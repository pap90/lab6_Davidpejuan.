/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class secuestro extends delito{
    private int dias;
    private int edad;

    public secuestro() {
    }

    public secuestro(int dias, int edad, int type, String descripcion, String tipo, String culpabilidad) {
        super(type, descripcion, tipo, culpabilidad);
        this.dias = dias;
        this.edad = edad;
    }

    
    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
