
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jefry Hernandez
 */
public class Album {
    private String nombre;
    private ArrayList<Cancion> listas= new ArrayList();

    public Album(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cancion> getListas() {
        return listas;
    }

    public void setListas(ArrayList<Cancion> listas) {
        this.listas = listas;
    }
    
    
}
