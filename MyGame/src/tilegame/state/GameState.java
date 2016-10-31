package tilegame.state;

import gfx.Assets;

import java.awt.Graphics;

import tilegame.Game;
import backgrounds.BackgroundForest;
import backgrounds.MenuCombate;
import creatures.Player;

public class GameState extends State{
	
	/**
	 *
	 */
	private Player player;
	private BackgroundForest obs;
	private MenuCombate gui;

	public GameState(Game game) {
		super(game);
		player = new Player(game,100,100);
		obs = new BackgroundForest(0,0);
		gui = new MenuCombate(0,527);
	}
	
	@Override
	public void tick() {
		player.tick();
	}

	@Override
	public void render(Graphics gr) {
		obs.render(gr);
		gui.render(gr);
		player.render(gr);
		
	}
	
	
		
}
