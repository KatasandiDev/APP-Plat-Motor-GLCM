package Plat;
/*
 * Ekstraksi Fitur Plat Kedaraan Bermotor Mahasiswa Fakultas Ilmu Komputer 
 * Universitas Muslim Indonsia Menggunakan Metode Gray Level Co-Occurrence Matrix 
 * (GLCM)
 * Oleh: Agus Arisandi
 */


import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
/**
 * <p>Class -  untuk melakukan rgb2gray BufferedImage maupun konversi
 * <br> true color ke gray color dan binary
*/
public class CreateImage
{
    /** <p>clone BufferedImage untuk
     * menghindari akses / pengubahan dari BufferedImage</p>
     * @param sourceBI untuk true color ataupun gray color
     * @return BufferedImage -
     */
    public  static BufferedImage clone(BufferedImage sourceBI) {
	BufferedImage bufferedimage_0_ = new BufferedImage(
                                sourceBI.getWidth(),
				sourceBI.getHeight(),
				sourceBI.getType()
                                );
	WritableRaster writableraster = sourceBI.getRaster();
	bufferedimage_0_.setData(writableraster);
	return bufferedimage_0_;
    }
    /** <p>konversi BufferedImage truecolor ke gray</p>
     * @param sourceTrueColor format truecolor
     * @return BufferedImage - menghasilkan BufferedImage  gray color
     */
    public static BufferedImage rgb2gray(BufferedImage sourceTrueColor) {

        //==start membaca rgb
        //baca
        Raster raster =  sourceTrueColor.getData();
	int r,g,b;
        //tulis
        BufferedImage bufferedimage= new BufferedImage(
                                                          sourceTrueColor.getWidth(),
                                                          sourceTrueColor.getHeight(),
                                                          BufferedImage.TYPE_BYTE_GRAY
                                                       );
	WritableRaster writableraster = (sourceTrueColor = new BufferedImage(
                                                                sourceTrueColor.getWidth(),
                                                                sourceTrueColor.getHeight(),
                                                                BufferedImage.TYPE_BYTE_GRAY)
                                                                ).getRaster();

        int[] pixelValue = new int[1];
	for (int x = 0; x <sourceTrueColor.getWidth(); x++) {
	    for (int y = 0; y < sourceTrueColor.getHeight(); y++) {
		r = raster.getSample(x, y, 0);
		g = raster.getSample(x, y, 1);
        	b = raster.getSample(x, y, 2);
                pixelValue[0] = (int)(0.2989*r+ 0.5870*g+0.1140*b);
		writableraster.setPixel(x, y, pixelValue);
	    }
	}
        bufferedimage.setData(writableraster);
	return bufferedimage;
        //==end
    }



}
