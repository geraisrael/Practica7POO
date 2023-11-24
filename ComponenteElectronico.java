/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerardo.gonzalez.uabc.appdemoherencia;

/**
 * ComponenteElectronico.
 * 
 * @author Gerardo G. Vazquez.
 * @version 24/Noviembre/2023
 */
public class ComponenteElectronico  
{
    // instance variables - replace the example below with your own
    private DispositivoElectronico esParteDe;

    /**
     * Constructor for objects of class ComponenteElectronico
     */
    public ComponenteElectronico()
    {
        this.esParteDe = null;    
    }
    
    public ComponenteElectronico(DispositivoElectronico esParteDe)
    {
        this.esParteDe = esParteDe;   
    }
    
    public DispositivoElectronico getEsParteDe()
    {
        return esParteDe;
    }
    
    public void setEsParteDe(DispositivoElectronico esParteDe)
    {
        this.esParteDe = esParteDe;  
    }
    
    public String toString()
    {
        return "ComponenteElectronico{" +"esParteDe="+ esParteDe +'}';
    }
}
