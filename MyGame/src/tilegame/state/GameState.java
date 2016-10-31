package tilegame.state;

import gfx.Assets;

import java.awt.Graphics;

import tilegame.Game;
import creatures.Player;

public class GameState extends State{
	
	/**
	 *
	 */
	private Player player;

	public GameState(Game game) {
		super(game);
		player = new Player(game,100,100);
	}
	
	@Override
	public void tick() {
		player.tick();
	}

	@Override
	public void render(Graphics gr) {
		player.render(gr);
	}
		
}
