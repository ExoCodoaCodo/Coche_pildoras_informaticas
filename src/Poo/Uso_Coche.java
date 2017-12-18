package Poo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author jose.zapatagom
 */
public class Uso_Coche {
    
    
    public static void main(String []args){
    
    Coche renault = new Coche();
    
    renault.estable_color(JOptionPane.showInputDialog("introduce Color"));
       
       
        System.out.println(renault.dime_datos_generales());
        System.out.println(renault.dime_color());
    
     renault.configura_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
     
        System.out.println(renault.dime_asientos());
        
    renault.configura_climatizador(JOptionPane.showInputDialog("¿Tiene Climatizador?"));
        System.out.println(renault.dime_climatizador());
        
        System.out.println(renault.dime_peso_coche());
        
        System.out.println("El precio final del coche es "+ renault.precio_coche());
        
        
    
    }
    
    
}
