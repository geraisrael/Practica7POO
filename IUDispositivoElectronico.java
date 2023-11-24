
package gerardo.gonzalez.uabc.appdemoherencia;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

class IUDispositivoElectronico extends Canvas {
    private DispositivoElectronico dispositivo;
    private BufferedImage image;

    public IUDispositivoElectronico(String imagen, DispositivoElectronico dispositivo) {
        try {
            // Cargar la imagen desde el archivo PNG
            image = ImageIO.read(new File(imagen));
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.dispositivo = dispositivo;
        // Agregar un MouseLister al canvas.
        this.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println(dispositivo.toString());
            }
        });
    }

    public void paint(Graphics g) {
        // Dibujar la imagen en el objeto Canvas
        g.drawImage(image, 10, 10, 100, 100, this);
    }
}
