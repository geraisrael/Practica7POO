/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package gerardo.gonzalez.uabc.appdemoherencia;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author israe
 */
public class AppDemoHerencia {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setLayout(new GridLayout(2, 2));

        Computadora computadora = new Computadora("HP", "egOxxx", "pavilion", "hp pavilion 15",
                18814, new Microprocesador(17, 280000000), 8000);
        IUDispositivoElectronico iuComputadora = new IUDispositivoElectronico("C:\\Users\\israe\\OneDrive\\Pictures\\computadora.png", computadora);
        frame.add(iuComputadora);


        Smartphone smartphone = new Smartphone("Xiaomi", "8671270", "Redmi", "Redmi note 10S", 7550,
                new Pantalla(2400, 1080), new Sensor("AMOLED", "pulgadas", 6));
        IUDispositivoElectronico iuSmartphone = new IUDispositivoElectronico(
                "C:\\Users\\israe\\OneDrive\\Pictures\\redmi.jpeg", smartphone);
        frame.add(iuSmartphone);

        Television television = new Television("LG Life's Good", "B3", "Smart TV", "LG OLED 55",
                18999, new Pantalla(3840, 2160));
        IUDispositivoElectronico iuTelevision = new IUDispositivoElectronico(
                "C:\\Users\\israe\\OneDrive\\Pictures\\tele.jpeg", television);
        frame.add(iuTelevision);

        frame.setSize(250, 250); // Ajusta el tamaño del frame según tus necesidades.
        frame.setVisible(true);
    }
}
