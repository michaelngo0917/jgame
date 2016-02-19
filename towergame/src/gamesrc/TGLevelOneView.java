package gamesrc;

import jgame.GContainer;

public class TGLevelOneView extends GContainer {
	
	private l1PlayArea l1pa = new l1PlayArea();
	private MenuArea ma = new MenuArea();
	private InfoArea ia = new InfoArea();

	public TGLevelOneView(){
		setSize(900,700);
		
		l1pa.setAnchorTopLeft();
		l1pa.setLocation(100, 0);
		add(l1pa);
		
		ma.setAnchorTopLeft();
		ma.setLocation(0, 0);
		add(ma);
		
		ia.setAnchorTopLeft();
		ia.setLocation(0, 600);
		add(ia);
	}
}
