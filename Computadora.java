/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerardo.gonzalez.uabc.appdemoherencia;

/**
 * Computadora.
 *
 * @author Gerardo G. Vazquez. 
 * @version 24/Noviembre/2023
 */
public class Computadora extends DispositivoElectronico
{
    private Microprocesador cpu;
    private long ramMB;

    /**
     * Constructor for objects of class Computadora
     */
    public Computadora(String fabricante, String numeroSerie, String marca, String nombre,float costo)
    {
        super(fabricante,numeroSerie,marca,nombre,costo);
        this.cpu = null;
        this.ramMB = 0;
    }

    public Computadora(String fabricante, String numeroSerie, String marca, String nombre,float costo,
    Microprocesador cpu,long ramMB)
    {
        super(fabricante,numeroSerie,marca,nombre,costo);
        this.cpu = cpu;
        this.ramMB = ramMB;
    }
    
    public Microprocesador getCpu()
    {
        return cpu;
    }
    
    public void setCpu(Microprocesador cpu)
    {
        this.cpu = cpu;
    }
    
    public long getRamMB()
    {
        return ramMB;
    }
    
    public void setRamMB(long ramMB)
    {
        this.ramMB = ramMB;
    }
    
    public String toString() {
        return super.toString() +
                "Computadora{" +
                "cpu=" + cpu +
                ", ramMB=" + ramMB +
                '}' +"\n";
    }
}


