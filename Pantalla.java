/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerardo.gonzalez.uabc.appdemoherencia;

/**
 * Pantalla.
 * 
 * @author Gerardo G. Vazquez. 
 * @version 17/Mayo/2023
 */
public class Pantalla extends ComponenteElectronico {
    private final int resolucionX;
    private final int resolucionY;

    public Pantalla(int resolucionX, int resolucionY) {
        this.resolucionX = resolucionX;
        this.resolucionY = resolucionY;
    }

    public int getResolucionX() {
        return resolucionX;
    }

    public int getResolucionY() {
        return resolucionY;
    }

    @Override
    public String toString() {
        return super.toString() + "Pantalla{" +
                "resolucionX=" + resolucionX +
                ", resolucionY=" + resolucionY +
                '}';
    }
}

