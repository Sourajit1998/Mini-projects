import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.applet.Applet;
import java.awt.Rectangle;
public class Bat
{
         public static final int WIDTH=150;
         public static final int HEIGHT=25;
         public static final int Y=620;
         int x=0,xa=0;	     
         Game g;
	     public Bat(Game g)
	     {
	    	 this.g=g;
	    	 
	     }
	     public void move()
         {

        	 if(x+xa>0 && x+xa<g.getWidth()-WIDTH)
    		 {
    			 x=x+xa;
    		 } 
         }
            	        
         public void paint(Graphics g)
         {
        	    g.setColor(Color.black);
        	    g.fillRect(x, Y, WIDTH,HEIGHT);
         }
         public void keyReleased(KeyEvent ke)
         {
        	 xa=0;
         }
		
         public void keyPressed(KeyEvent ke)
         {
        	 int pos=ke.getKeyCode();
        	 if(pos==KeyEvent.VK_LEFT)
        		 xa=-1;
        	 if(pos==KeyEvent.VK_RIGHT)
        		 xa=1;
         }
         public Rectangle getBounds()
         {
        	 return new Rectangle(x,Y,WIDTH,HEIGHT);
         }
         public int getTopY()
         {
        	 return Y;
         }
		
			
}

