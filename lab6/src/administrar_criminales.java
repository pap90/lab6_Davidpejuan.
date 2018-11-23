
import java.io.File;
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
public class administrar_criminales {
    ArrayList<criminales> criminales=new ArrayList();
    private File archivo=null;
    
    public void administrar_criminales(String path){
        this.archivo=new File(path);
    }

    public ArrayList<criminales> getCriminales() {
        return criminales;
    }

    public void setCriminales(ArrayList<criminales> criminales) {
        this.criminales = criminales;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
}
