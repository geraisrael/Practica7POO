/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerardo.gonzalez.uabc.appdemoherencia;

/**
 * Sensor.
 * 
 * @author Gerardo G. Vazquez. 
 * @version 17/Mayo/2023
 */
public class Sensor extends ComponenteElectronico
{
    private final String tipo;
    private final String unidadDeMedida;
    private final int valor;

    /**
     * Constructor for objects of class Sensor
     */
    public Sensor(String tipo,String unidadDeMedida, int valor)
    {
        this.tipo = tipo;
        this.unidadDeMedida = unidadDeMedida;
        this.valor = valor;
    }

    public String getTipo()
    {
        return tipo;
    }
    
    public String getUnidadDeMedida()
    {
        return unidadDeMedida;
    }
    
    public int getValor()
    {
        return valor;
    }
    
    public String toString()
    {
        return super.toString() +"Sensor{" + "tipo=" +tipo +
            ",unidadDeMedida=" +unidadDeMedida +",valor="+valor +'}';
    }
}

