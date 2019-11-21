package Plat;


import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
/**
 * <p>Class -  untuk melakukan transformasi
 * <br> true color ke gray color dan binary
 * @author Administrator
 */
public class UtilImage
{
   

    public static BufferedImage rescale(BufferedImage source,int width,
				 int height) {
	BufferedImage buffImage;
	Graphics2D graphics2d = (buffImage = new BufferedImage(width,
                                                                                height,
                                                                                source.getType())
                                                                                ).createGraphics();

	AffineTransform affinetransform= (AffineTransform.getScaleInstance
                                                ((double) width / (double) source.getWidth(),
                                                (double) height / (double) source.getHeight()));
	graphics2d.drawRenderedImage(source, affinetransform);
	return buffImage;
    }

    
}
