package backgrounds;

import java.awt.Graphics;

import entities.Entity;
import gfx.Assets;

public class BackgroundForest extends Entity{

	public BackgroundForest(float x, float y) {
		super(x, y);
	}

	@Override
	public void tick() {

		
	}

	@Override
	public void render(Graphics gr) {
		gr.drawImage(Assets.background, (int)x, (int)y, null);
	}

}
