package gfx;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {
		//BufferedImage
	
	public static BufferedImage loadImage(String path){
		//Path es donde esta guardada la imagen
		//Basicamente devolves la imagen como un objeto BufferedImage

		try {
			return ImageIO.read(ImageLoader.class.getResource(path));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);//Si no se pudo cargar la imagen, sale todo a la mierda
		}
		return null;
	}
}
