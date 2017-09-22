/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jefry Hernandez
 */
public class Cancion {

    private Album album;
    private String nombre;
    private long duracion;
    private String artista;
    private String genero;

    public Cancion(Album album, String nombre, long duracion, String artista, String genero) {
        this.album = album;
        this.nombre = nombre;
        this.duracion = duracion;
        this.artista = artista;
        this.genero = genero;
    }

    public Album getAlbum() {
        return album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDuracion() {
        return duracion;
    }

    public void setDuracion(long duracion) {
        this.duracion = duracion;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
