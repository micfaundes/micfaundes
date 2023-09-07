/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author natal
 */
public class Cancion1 {
    
    private String titulo,artista;
    private int tiempoDuracion;
    private boolean favorita; 
    private char descargada;
    
    public Cancion1(){
        
    }

    public Cancion1(String titulo, String artista, int tiempoDuracion, boolean favorita, char descargada) {
        this.titulo = titulo;
        this.artista = artista;
        this.tiempoDuracion = tiempoDuracion;
        this.favorita = favorita;
        this.descargada = descargada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getTiempoDuracion() {
        return tiempoDuracion;
    }

    public void setTiempoDuracion(int tiempoDuracion) {
        this.tiempoDuracion = tiempoDuracion;
    }

    public boolean isFavorita() {
        return favorita;
    }

    public void setFavorita(boolean favorita) {
        this.favorita = favorita;
    }

    public char getDescargada() {
        return descargada;
    }

    public void setDescargada(char descargada) {
        this.descargada = descargada;
    }
    
      
}
