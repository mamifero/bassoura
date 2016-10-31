package entities;

import java.awt.Graphics;

public abstract class Entity {
	/**
	 * Seria como "Personaje" en el codigo main 
	 * 	que estamos desarrollando en clase
	 * 
	 * XY son flotantes para mejorar la precision
	 * ya que de por si, el movimiento generalmente nunca es perfecto
	 */
	protected float x;
	protected float y;
	
	public Entity(float x, float y){
		this.x = x;
		this.y = y;
	}
	
	public abstract void tick();
	public abstract void render(Graphics gr);
	
}
