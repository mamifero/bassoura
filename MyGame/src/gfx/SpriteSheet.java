package gfx;

import java.awt.image.BufferedImage;

public class SpriteSheet {

	/**
	 * Testeando como separar un sprite de otro
	 */
	
	/**
	 * Comentario: Basicamente cuando haces un spriteSheet, agarras y cargas una sola imagen
	 * en vez de varias imagenes (esto sirve para animar movimientos mas que nada)
	 * y supongo que segun el metodo que elijas, vas a agarrar una coordenada del sprite
	 * 
	 * Asset: es un tipo de texto, imagen o sonido
	 */
	private BufferedImage sheet;
	
	public SpriteSheet(BufferedImage sheet) {
		this.sheet = sheet;
	}
	
	//
	//Esto es para cortar los sprites
	public BufferedImage crop(int x, int y, 
			int width, int height){
		//Retorna la imagen con las dimensiones
		//Y coordenadas que YO le diga
		return sheet.getSubimage(x, y, width, height);
	}
	
}
