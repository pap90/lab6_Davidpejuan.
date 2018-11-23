
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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

    ArrayList<criminales> criminales = new ArrayList();
    private File archivo = null;

    public administrar_criminales(String path) {
        archivo = new File(path);
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
    public void setcriminales(criminales p) {
        this.criminales.add(p);
    }

    public void escribirarchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (criminales c : criminales) {
                bw.write(c.getNombre() + ";");
                bw.write(c.getEdad() + ";");
                bw.write(c.getIdentidad() + ";");
                bw.write(c.getCelda() + ";");
                for (delito d : c.getDelitos()) {
                    if (d.getType() == 1) {
                        bw.write(d.getType() + ",");
                        bw.write(d.getDescripcion() + ",");
                        bw.write(d.getTipo() + ",");
                        bw.write(d.getCulpabilidad() + ",");
                        bw.write(((asesinato) d).getArma() + ",");
                        bw.write(((asesinato) d).getVictimas() + ",");
                    } else if (d.getType() == 2) {
                        bw.write(d.getType() + ",");
                        bw.write(d.getDescripcion() + ",");
                        bw.write(d.getTipo() + ",");
                        bw.write(d.getCulpabilidad() + ",");
                        bw.write(((robo) d).getObjeto() + ",");
                        bw.write(((robo) d).getValor_del_objeto() + ",");
                    } else if (d.getType() == 3) {
                        bw.write(d.getType() + ",");
                        bw.write(d.getDescripcion() + ",");
                        bw.write(d.getTipo() + ",");
                        bw.write(d.getCulpabilidad() + ",");
                        bw.write(((secuestro) d).getDias() + ",");
                        bw.write(((secuestro) d).getEdad() + ",");
                    } else if (d.getType() == 4) {
                        bw.write(d.getType() + ",");
                        bw.write(d.getDescripcion() + ",");
                        bw.write(d.getTipo() + ",");
                        bw.write(d.getCulpabilidad() + ",");
                        bw.write(((trafico_de_drogas) d).getProducto() + ",");
                        bw.write(((trafico_de_drogas) d).getPeso() + ",");
                    } else if (d.getType() == 5) {
                        bw.write(d.getType() + ",");
                        bw.write(d.getDescripcion() + ",");
                        bw.write(d.getTipo() + ",");
                        bw.write(d.getCulpabilidad() + ",");
                        bw.write(((violacion) d).getEdad_victima() + ",");
                    }

                }
                bw.write(c.getAños());
                bw.write(";");
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }

    public void cargararchivo() {
        Scanner sc = null;
        criminales = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    String n;
                    int e, id, c, a;
                    ArrayList<delito> temp = new ArrayList();
                    n = sc.next();
                    e = sc.nextInt();
                    id = sc.nextInt();
                    c = sc.nextInt();
                    Scanner s2 = new Scanner(sc.next());
                    s2.useDelimiter(",");
                    while (s2.hasNext()) {
                        int type = s2.nextInt();
                        String desc = s2.next();
                        String tipo = s2.next();
                        String culpa = s2.next();
                        if (type == 1) {
                            temp.add(new asesinato(s2.next(), s2.nextInt(), type, desc, tipo, culpa));
                        } else if (type == 2) {
                            temp.add(new robo(s2.next(), s2.nextInt(), type, desc, tipo, culpa));
                        } else if (type == 3) {
                            temp.add(new secuestro(s2.nextInt(), s2.nextInt(), type, desc, tipo, culpa));
                        } else if (type == 4) {
                            temp.add(new trafico_de_drogas(s2.next(), s2.nextInt(), type, desc, tipo, culpa));
                        } else if (type == 5) {
                            temp.add(new violacion(s2.nextInt(), type, desc, tipo, culpa));
                        }
                    }
                    a = sc.nextInt();
                    criminales.add(new criminales(n, e, id, c, a));
                    criminales.get(criminales.size() - 1).setDelitos(temp);
                }
            } catch (Exception e) {
                System.out.println("c mamo");
            }
            sc.close();
        }
    }
}
