/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerardo.gonzalez.uabc.appdemoherencia;

/**
 * Television.
 * 
 * @author Gerardo G. Vazquez.
 * @version 24/Noviembre/2023
 */
public class Television extends DispositivoElectronico
{
    private final Pantalla pantalla;

    /**
     * Constructor for objects of class Television
     */
    public Television(String fabricante, String numeroSerie, String marca, String nombre,int costo, Pantalla pantalla)
    {
        super(fabricante,numeroSerie,marca,nombre,costo);  
        this.pantalla = pantalla;
    }

    public Pantalla getPantalla()
    {
        return pantalla;
    }
    
    public String toString()
    {
        return super.toString() + "Televicion{"+"pantalla="+pantalla +'}'  +"\n";
    }
}


