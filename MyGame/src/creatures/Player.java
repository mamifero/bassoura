package creatures;

import gfx.Assets;

import java.awt.Graphics;

public class Player extends Creature {
	
	/**
	 * 
	 * 
	 */

	public Player(float x, float y) {
		super(x, y);

	}

	@Override
	public void tick() {
		
	}

	@Override
	public void render(Graphics gr) {
		//DE PRUEBA, DESPUES SE CAMBIA
		//Drawimage recibe enteros... por eso el cast
		gr.drawImage(Assets.player, (int)x, (int)y, null);
		
		
	}
		
}
