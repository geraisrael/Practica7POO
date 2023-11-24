/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerardo.gonzalez.uabc.appdemoherencia;

/**
 * DispositivoElectronicoDeConsumo.
 * 
 * @author Gerardo G. Vazquez. 
 * @version 24/Noviembre/2023
 */
public class DispositivoElectronicoDeConsumo extends DispositivoElectronico
{
    private boolean encendido;

    /**
     * Constructor for objects of class DispositivoElectronicoDeConsumo
     */
    public DispositivoElectronicoDeConsumo(String fabricante, String numeroSerie, String marca, String nombre)
    {
        super(fabricante, numeroSerie, marca, nombre); 
        this.encendido = false;
    }

    public DispositivoElectronicoDeConsumo(String fabricante, String numeroSerie, String marca, String nombre,boolean encendido)
    {
        super(fabricante, numeroSerie, marca, nombre); 
        this.encendido = encendido;
    }
    
    public boolean getEncendido()
    {
        return encendido;
    }
    
    public void encender()
    {
        encendido = true;
    }
    
    public void apagar()
    {
        encendido = false;
    }
    
    public String toString()
    {
        return super.toString() +"DispositivoElectronicoDeConsumo{" +
            "encendido="+ encendido +'}';
    }
}

