/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class delito {
    
    private int type;
    private String descripcion;
    private String tipo;
    private String culpabilidad;

    public delito() {
    }

    public delito(int type, String descripcion, String tipo, String culpabilidad) {
        this.type = type;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.culpabilidad = culpabilidad;
    }

    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCulpabilidad() {
        return culpabilidad;
    }

    public void setCulpabilidad(String culpabilidad) {
        this.culpabilidad = culpabilidad;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
    
    
}
