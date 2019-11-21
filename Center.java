package Plat;

/*
 * Ekstraksi Fitur Plat Kedaraan Bermotor Mahasiswa Fakultas Ilmu Komputer 
 * Universitas Muslim Indonsia Menggunakan Metode Gray Level Co-Occurrence Matrix 
 * (GLCM)
 * Oleh: Agus Arisandi
 */


import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author Administrator
 */
public class Center {
    public static void frame(JFrame frame){
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int X = (screen.width / 2) - (frame.getWidth() / 2); // Center horizontally.
        int Y = (screen.height / 2) - (frame.getHeight() / 2); // Center vertically.

        frame.setBounds(X,Y , frame.getWidth(),frame.getHeight());
    }

    public static void dialog(JDialog frame){
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int X = (screen.width / 2) - (frame.getWidth() / 2); // Center horizontally.
        int Y = (screen.height / 2) - (frame.getHeight() / 2); // Center vertically.

        frame.setBounds(X,Y , frame.getWidth(),frame.getHeight());
    }

}
