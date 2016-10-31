package tilegame.state;

import gfx.Assets;

import java.awt.Graphics;

import creatures.Player;

public class GameState extends State{
	
	private Player player;
	
	public GameState() {
		player = new Player(100,100);
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
