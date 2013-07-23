package tk.creativevg.Newverse;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class MainMenu {
	
	public static void main(String[] args) {
		
		try {
			Display.setDisplayMode(new DisplayMode(640, 480));
			Display.setTitle("Newverse");
			Display.create();
		} catch (LWJGLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Display.destroy();
			System.exit(1);
		}
		
		while ( !Display.isCloseRequested() ) {
			
			Display.update();
			Display.sync(60);
			
		} Display.destroy(); System.exit(0);
		
	}
	
}
