/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author natal
 */
public class Principal1 {
    
    public static void main(String[] args) {
      
        Pizza1 objPizza1 = new Pizza1();
        System.out.println("********");
        objPizza1.nombre = "Pepperoni";
        objPizza1.tamaño = "grande";
        objPizza1.masa = "gruesa";
        
        objPizza1.preparar();
        objPizza1.calentar();
        
        System.out.println("********");
        
        Pizza1 objPizza2 = new Pizza1();
        System.out.println("********");
        objPizza2.nombre = "vegetariana";
        objPizza2.tamaño = "familiar";
        objPizza2.masa = "delgada";
        
        objPizza2.preparar();
        objPizza2.calentar();
        
        
    }
}
