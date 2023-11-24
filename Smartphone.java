/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerardo.gonzalez.uabc.appdemoherencia;

/**
 * Smartphone.
 * 
 * @author Gerardo G. Vazquez. 
 * @version 24/Noviembre/2023
 */
public class Smartphone extends Computadora
{
    private final Sensor sensorDeHuella;
    private final Pantalla pantalla;

    /**
     * Constructor for objects of class Smartphone
     */
    public Smartphone(String fabricante, String numeroSerie, String marca, String nombre,float costo, 
    Pantalla pantalla, Sensor sensorDeHuella)
    {
        super(fabricante,numeroSerie,marca,nombre,costo);
        this.pantalla = pantalla;
        this.sensorDeHuella = sensorDeHuella;
    }

    public Sensor getSensorDeHuella()
    {
        return sensorDeHuella;
    }
    
    public Pantalla getPantalla()
    {
        return pantalla;
    }
    
    public String toString()
    {
        return super.toString()+"Smartphone{" +"sensorDeHuella="+sensorDeHuella+
            ",pantalla="+pantalla +'}'  +"\n";
    }
}


