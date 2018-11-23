/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class trafico_de_drogas extends delito {

    private String producto;
    private int peso;

    public trafico_de_drogas() {
    }

    public trafico_de_drogas(String producto, int peso, int type, String descripcion, String tipo, String culpabilidad) {
        super(type, descripcion, tipo, culpabilidad);
        this.producto = producto;
        this.peso = peso;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

}
