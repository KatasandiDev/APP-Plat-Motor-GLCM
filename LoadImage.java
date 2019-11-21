package Plat;



import java.awt.image.BufferedImage;
import java.io.File;

import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 * @author Administrator
 */
public class LoadImage
{
    private String getAbsolutePath;
    private BufferedImage source;
    private int width;
    private int height;
    private int format;
    

    /**  
     * <p>setting lokasi file </p>
     * 
     * @param file lokasi file
     */
    public LoadImage(File file)  {

        try {
            source = ImageIO.read(file);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Info",javax.swing.JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
	getAbsolutePath = file.getAbsolutePath();
        //jika bukan image maka width==null
        if (source==null){
            //System.out.println("null");
            return;
        }
	width = source.getWidth();
	height = source.getHeight();
	format = source.getType();

       
    }
    /**
     * <p>setting lokasi file </p>
     *
     * @param file lokasi file
     */
    public LoadImage(String file) {
        try {
            source = ImageIO.read(new File(file));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Info",javax.swing.JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
	getAbsolutePath = file;
        //jika bukan image maka width==null
        if (source==null){
            //System.out.println("null");
            return;
        }
	width = source.getWidth();
	height = source.getHeight();
	format = source.getType();
    }
    /**
     * @return lokasi file
     */
    public String getAbosulutePath() {
	return getAbsolutePath;
    }

    /**
     * @return BufferedImage
     */
    public BufferedImage getBI() {
	return source;
    }
    /**
     * @return int lebar
     */
    public int getWidth() {
	return width;
    }

    /**
     * @return int tinggi
     */
    public int getHeight() {
	return height;
    }
    /**
     * @return int format
     */
    public int getFormatType() {
	return format;
    }   
    
   
}
