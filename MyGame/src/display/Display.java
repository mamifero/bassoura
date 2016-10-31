package display;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Display {
	
	/**
	 * Basicamente lo que hace esta clase es crear una ventanita
	 */
	
	private JFrame frame;
	//necesita esto:
	private String title;
	//pixeles
	private int width;
	private int height;
	/*
	 * Ahora añado el canvas, sirve para dibujar los graficos, que despues
	 * voy a mandar al Jframe para poder visualizarlos
	 */
	private Canvas canvas; 
	
	
	
	public Display(String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;
		//el display lo hago aparte
		createDisplay();
		
	}
	
	private void createDisplay(){
		//Creo una ventana con estas medidas y este titulo
		frame = new JFrame(title);
		frame.setSize(width, height);
		//Es para cerrar el juego cuando aprieto X
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*adicional*/
		//para que el usuario no pueda cambiar el tamaño de la pantalla
		frame.setResizable(false);
		//Para que la ventana aparezca en medio de la pantalla, y no al costado
		frame.setLocationRelativeTo(null);
		//para ver el Jframe en pantalla, ni idea como funca
		frame.setVisible(true);
		
		//inicio el canvas
		canvas = new Canvas();
		//No se muy bien como funciona el objeto dimension
		//Pero basicamente le digo al canvas que siempre tenga el tamaño
		//de la ventana
		canvas.setPreferredSize(new Dimension(width,height));
		canvas.setMaximumSize(new Dimension(width,height));
		canvas.setMinimumSize(new Dimension(width,height));
		
		//PARA ARREGLAR UN BUG AL HACER EL MOVIMIENTO DEL PJ
		canvas.setFocusable(false);
		
		//finalmente lo añadimos al frame
		frame.add(canvas);
		//es para ver el canvas en toda la ventana, ya que a veces
		//puede que no entre bien (en este caso  si, pero bueh)
		frame.pack();
		
	}
	
	//Para acceder al Canvas en el init
	public Canvas getCanvas(){
		return canvas;
	}
	
	public JFrame getFrame(){
		return frame;
	}
	
}
