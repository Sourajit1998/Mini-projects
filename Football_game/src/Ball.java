import java.awt.*;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.applet.Applet;
public class Ball extends JPanel 
{
    public static int x=700;
    public static int y=500;
    public static int xa=1;
    public static int ya=1;
    public static int c=0;
	public Ball()
	{
	       addMouseListener(new MouseListener()
			{
	    	       @Override
	    	       public void mouseEntered(MouseEvent me)
	    	       {
	    	    	   
	    	       }
	    	       @Override
	    	       public void mouseExited(MouseEvent me)
	    	       {
	    	    	 
	    	       }
	    	       @Override
	    	       public void mousePressed(MouseEvent me)
	    	       {
	    	    	   
	    	       }
	    	       @Override
	    	       public void mouseReleased(MouseEvent me)
	    	       {
	    	    	   
	    	       }
	    	       @Override
	                public void mouseClicked(MouseEvent me)
	                {
	    	    
	                	//System.out.println("mouse clicked");
	                	int X,Y;
	                	X=me.getX();
	                	//System.out.println(X);
	                	
	                	Y=me.getY();
	                	//System.out.println(Y);
	                	if(Math.abs(X-x)<40 && Math.abs(Y-y)<40)
	                	{
	                		//System.out.println("clicked on d ball");
	                		if(y+ya<0)
	                		{
	                			ya=10;
	                			y=y+ya;
	                		}
	                		else
	                		{
	                			y-=100;
	                			c++;
	                			moveup();
	                		}
	                		
	                	}
	                	else
	                	{
	                		if(c>=1)
	                		{
	                		    movedown();
	                		}
		                		//System.out.println("NOT clicked on d ball");
		                	
	                	}
	                		
	                }
			});
	      
	}
	
    public void moveup() 
    {
		 if(y+ya>getSize().height-40)
		 {
			 ya=-1;
			 //gameOver();
		 }
		 
		 if(y+ya<0)
		 {
			 ya=10;
			 System.out.println("i hit d top at"+x+y);
		 }
		 //x=x+xa;
		 y=y+ya;
    }
		 
		
    public void movedown()
    {
    	y+=5;
    	if(y+ya>getSize().height-40)
		 {
			 ya=-1;
			gameOver();
		 }
    }
    

	@Override
	public void paint(Graphics g) 
	{
		super.paint(g);
		g.fillOval(x,y,40,40);	
		String point=Integer.toString(c);
		g.setFont(new Font("Verdana",Font.BOLD,40));
		g.setColor(Color.red);
		g.drawString("Score",1200 , 80);
		g.drawString(point,1200, 150);
	}
	
	public void gameOver() 
	{
		String point="Ur score is ";
		point+=Integer.toString(Ball.c);
		JOptionPane.showMessageDialog(this, point,"Game Over", JOptionPane.YES_NO_OPTION);
		System.exit(ABORT);
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		JFrame frame = new JFrame("Sours Football game");
		Ball b = new Ball();
		frame.add(b);
		frame.setSize(1400,700);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//System.out.println("i m in main outside while");
	
		while (true) 
		{
		   // System.out.println("i m in main");
			if(c!=0)
			{
				b.movedown();
			}
			b.repaint();
			Thread.sleep(50);
			
		}
	}
}
		
