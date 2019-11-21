package Plat;


import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
/**
 * <p>Class -  untuk melakukan baca pixel BufferedImage
 * <br> true color ke gray color dan binary

 * @author Administrator
 */
public class ReadImage
{
    private BufferedImage source;
    private int width;
    private int height;
    private int formatType;
    private int [][] red;
    private int [][] green;
    private int [][] blue;
    private int [][] gray;
    /**
     * @param bufferedimage truecolor atau graycolor
     */
    public ReadImage(BufferedImage bufferedimage){
        //if true color
        if(bufferedimage.getType()!=BufferedImage.TYPE_BYTE_GRAY){
            source = clone(bufferedimage);
            formatType = bufferedimage.getType();
            Raster raster;
            //update nilai
            int kolom = (raster = bufferedimage.getData()).getWidth();
            int baris = raster.getHeight();
            //init
            red = new int [baris][kolom];
            green = new int [baris][kolom];
            blue = new int [baris][kolom];
            //raster.getNumBands();
            for (int y = 0; y < baris; y++) {
                for (int x = 0; x < kolom; x++) {
                    source.setRGB(x, y, bufferedimage.getRGB(x, y));
                    red[y][x] = (raster.getSample(x, y, 0));
                    green[y][x] = (raster.getSample(x, y, 1));
                    blue[y][x] = (raster.getSample(x, y, 2));
                }
            }
        }
        //gray
        else{
            source = new BufferedImage(bufferedimage.getWidth(),
			      bufferedimage.getHeight(),
			      bufferedimage.getType());
            formatType = bufferedimage.getType();
            Raster raster;
            int kolom = (raster = bufferedimage.getData()).getWidth();
            int baris = raster.getHeight();
            gray = new int [baris][kolom];

            width = kolom;
            height = baris;
            //raster.getNumBands();
            for (int y = 0; y < baris; y++) {
                for (int x = 0; x < kolom; x++) {

                    source.setRGB(x, y, bufferedimage.getRGB(x, y));
                    gray[y][x] =  raster.getSample(x, y, 0);
                    


                }
            }
        }
        

    }
    public  BufferedImage clone(BufferedImage sourceBI) {
	BufferedImage bufferedimage_0_ = new BufferedImage(
                                sourceBI.getWidth(),
				sourceBI.getHeight(),
				sourceBI.getType()
                                );
	WritableRaster writableraster = sourceBI.getRaster();
	bufferedimage_0_.setData(writableraster);
	return bufferedimage_0_;
    }
    /**
     * @return BufferedImage
     */
    public BufferedImage getBufferedImage() {
	return source;
    }

    public int getWidth() {
	return width;
    }

    public int getHeight() {
	return height;
    }

    public int getFormatType() {
	return formatType;
    }
    /**
     *
     * @return nilai pixel red
     */
    public int[][] getRed() {
	return red;
    }

    /**
     * @return nilai pixel green
     */
    public int[][] getGreen() {
	return green;
    }
    /**
     * @return nilai pixel blue
     */
    public int [][] getBlue() {
	return blue;
    }
    /**
     * @return nilai pixel gray
     */
    public int [][] getGray() {
	return gray;
    }
   
}
