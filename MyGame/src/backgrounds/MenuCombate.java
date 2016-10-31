package backgrounds;

import java.awt.Graphics;

import entities.Entity;
import gfx.Assets;

public class MenuCombate extends Entity{

	public MenuCombate(float x, float y) {
		super(x, y);
	}

	@Override
	public void tick() {

		
	}

	@Override
	public void render(Graphics gr) {
		gr.drawImage(Assets.guiCombat, (int)x, (int)y, null);
	}

}
