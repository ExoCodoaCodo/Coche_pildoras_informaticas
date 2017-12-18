package Poo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose.zapatagom
 */
public class Coche {
    
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero;
    private boolean climatizador;
    
    public Coche(){
    
    ruedas=4;
    largo=2000;
    ancho=300;
    motor=1600;
    peso_plataforma=500;
    
    }
    
    //METODO GETTER
    public String dime_datos_generales(){
    
    return "La plataforma del coche tiene: "+ ruedas + "rueda Mide: "+ largo+ "largo, con un ancho de: "+ ancho+
                    ", con un peso de plataforma: "+ peso_plataforma ;
    
    }
    
    //metodo SETTER
    public void estable_color(String color_coche){
    
    color=color_coche;
    
    
    }
    
    public String dime_color(){
    
        return "El color del cohe es:"+color;
    
    }
    
    public void configura_asientos(String asientos_cuero){
    
    if(asientos_cuero.equalsIgnoreCase("si")){
    this.asientos_cuero=true;
    }
    else{
    this.asientos_cuero=false;
    }
    
    }
    
    
    public String dime_asientos(){
    
    if(asientos_cuero==true){
    
    return "El coche tiene asientos de cuero";
    }
    else{
    
    return "el coche no tiene asientos de cuero";
    }
    
    
    }
    
    public void configura_climatizador(String climatizador){
    
    if (climatizador.equalsIgnoreCase("si")){
    
    this.climatizador=true;
    
    }
    else{
    this.climatizador=false;
    
    }
    
    }
    
    public String dime_climatizador(){
    
    if(climatizador=true){
    return "El coche incorpora Climatizador";
    
    }
    else{
    return "El coche no incorpora climatizador";
    }
    
    
    
    }
    
    
    public String dime_peso_coche(){//Setter y Getter a la vez
    
    int peso_carroceria=500;
    
    peso_total=peso_total+peso_carroceria;
    
    if(asientos_cuero=true){
    
    peso_total=peso_plataforma+50;
    
    }
    
    if (climatizador==true){
    
    peso_total=peso_total+20;
    
    }
    
    return "El peso total del coche es: " + peso_total;
    
    }
    
    
    public int precio_coche(){
    
    int precio_final=10000;
    
    if (asientos_cuero==true){
    
    precio_final+=2000;
    }
    
    if (climatizador==true){
    
    precio_final+=1500;
        
    }
    
    return precio_final;
    }
    
    
    
}
