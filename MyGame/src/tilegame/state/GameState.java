package tilegame.state;

import gfx.Assets;

import java.awt.Graphics;

public class GameState extends State{
	
	public GameState() {

	}
	
	@Override
	public void tick() {
		
	}

	@Override
	public void render(Graphics gr) {
		gr.drawImage(Assets.grass, 0, 0, null);
		
	}
		
}
