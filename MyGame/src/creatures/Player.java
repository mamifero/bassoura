package creatures;

import gfx.Assets;

import java.awt.Graphics;

import tilegame.Game;

public class Player extends Creature {
	
	/**
	 * Player debe tener acceso al juego...
	 */
	private Game game;
	
	public Player(Game game,float x, float y) {
		super(x, y);
		this.game = game;

	}

	@Override
	public void tick() {
		//LO HAGO MEDIO RANCIO, DESPUES LO ARREGLO
		if(game.getKeyManager().isUp())
			y-=3;
		if(game.getKeyManager().isDown())
			y+=3;
		if(game.getKeyManager().isLeft())
			x-=3;
		if(game.getKeyManager().isRight())
			x+=3;
		
	}

	@Override
	public void render(Graphics gr) {
		//DE PRUEBA, DESPUES SE CAMBIA
		//Drawimage recibe enteros... por eso el cast
		gr.drawImage(Assets.player, (int)x, (int)y, null);
		
		
	}
		
}
