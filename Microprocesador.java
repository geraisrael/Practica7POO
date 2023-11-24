/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerardo.gonzalez.uabc.appdemoherencia;

/**
 * Microprocesador.
 * 
 * @author Gerardo G. Vazquez.
 * @version 17/Mayo/2023
 */
public class Microprocesador extends ComponenteElectronico
{
    private final int cacheRAM;
    private final long velocidadHz;

    /**
     * Constructor for objects of class Microprocesador
     */
    public Microprocesador(int cacheRAM, long velocidadHz)
    {
        this.cacheRAM = cacheRAM;
        this.velocidadHz = velocidadHz;
    }

    public int getCacheRAM()
    {
        return cacheRAM;
    }
    
    public long getVelocidadHz()
    {
        return velocidadHz;
    }
    
    public String toString()
    {
        return super.toString() +"Microprocesador{" + "cacheRAM=" +cacheRAM +
            ",velocidadHz=" +velocidadHz +'}';
    }
}


