package creatures;

import entities.Entity;

public abstract class Creature extends Entity {

	/**
	 * por si no queda claro, como Creature hereda de Entity
	 * Necesita un x,y para poder ser creado
	 */
		protected int health;
		
		public Creature(float x, float y) {
		super(x,y);
		this.health = 10;
	}
}
