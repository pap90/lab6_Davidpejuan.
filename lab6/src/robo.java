/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class robo extends delito{
    private String objeto;
    private int valor_del_objeto;

    public robo() {
    }

    public robo(String objeto, int valor_del_objeto, int type, String descripcion, String tipo, String culpabilidad) {
        super(type, descripcion, tipo, culpabilidad);
        this.objeto = objeto;
        this.valor_del_objeto = valor_del_objeto;
    }

    

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public int getValor_del_objeto() {
        return valor_del_objeto;
    }

    public void setValor_del_objeto(int valor_del_objeto) {
        this.valor_del_objeto = valor_del_objeto;
    }
    
}
