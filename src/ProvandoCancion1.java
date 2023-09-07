/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author natal
 */
public class ProvandoCancion1 {
    
    public static void main(String[] args) {
       
        Cancion1 cancion1 = new Cancion1(); 
        Cancion1 cancion2 = new Cancion1( "MUJER AMADA" , "Rata Blanca" , 500 , true ,'N');
        
        cancion1.setTitulo("fear of the dark");
        cancion1.setArtista("iron maiden");
        cancion1.setTiempoDuracion(400);
        cancion1.setFavorita(true);
        cancion1.setDescargada('y');
        
        System.out.println("*****************");
        
        System.out.println(cancion1);
        System.out.println(cancion2);
        
        
    }
    
}
