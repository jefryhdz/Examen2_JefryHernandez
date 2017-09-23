
import java.io.Serializable;
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
public class Album implements Serializable {

    private String nombre;
    private ArrayList<Cancion> listas = new ArrayList();
    private String artista;

    private final long SerialVersionUID = 771L;

    public Album(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
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

    @Override
    public String toString() {
        return nombre;
    }

}
