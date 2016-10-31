package tilegame.state;

import java.awt.Graphics;

public abstract class State {
		/**
		 * Un estado es basicamente una condicion relativa de las variables
		 * y atributos de un programa segun sus valores actuales
		 */
		//Este atributo estatico nos dira cual es el estado que queremos cargar
		//Y renderizar actualmente
		private static State currentState = null;
		
		public static void setState(State state){
			currentState = state;
		}
		
		public static State getState(){
			return currentState;
		}
		
		/////------------------//////
		//Esto se refiere a la clase abstracta, lo de arriba podria ir en otra clase aparte
		//Por el momento, nuestra clase estado puede refrescar y dibujar
		public abstract void tick();
		public abstract void render(Graphics gr);
		
		
		
		
		
}
