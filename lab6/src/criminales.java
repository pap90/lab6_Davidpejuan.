
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author david
 */
public class criminales {
    
    private String nombre;
    private int edad;
    private int identidad;
    private int celda;
    private ArrayList<delito> delitos = new ArrayList();
    private int años;

    public criminales() {
    }

    public criminales(String nombre, int edad, int identidad, int celda, int años) {
        this.nombre = nombre;
        this.edad = edad;
        this.identidad = identidad;
        this.celda = celda;
        this.años = años;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdentidad() {
        return identidad;
    }

    public void setIdentidad(int identidad) {
        this.identidad = identidad;
    }

    public int getCelda() {
        return celda;
    }

    public void setCelda(int celda) {
        this.celda = celda;
    }

    public ArrayList<delito> getDelitos() {
        return delitos;
    }

    public void setDelitos(ArrayList<delito> delitos) {
        this.delitos = delitos;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

}
