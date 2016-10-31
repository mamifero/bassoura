package creatures;

import java.awt.Graphics;

import gfx.Assets;

public class BackgroundForest extends Creature {

	public BackgroundForest(float x, float y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void render(Graphics gr) {
		//DE PRUEBA, DESPUES SE CAMBIA
		//Drawimage recibe enteros... por eso el cast
		gr.drawImage(Assets.tree, (int)x, (int)y, null);
		
		
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

}
