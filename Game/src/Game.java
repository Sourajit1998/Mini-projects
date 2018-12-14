import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Game extends JPanel 
{

	Ball b=new Ball(this);
	Bat b1=new Bat(this);
	public static int count;
	public Game()
	{
	       addKeyListener(new KeyListener()
			{
	    	       @Override
	                public void keyTyped(KeyEvent ke)
	                {
	                	
	                }
	    	       @Override
	                public void keyReleased(KeyEvent ke)
	                {
	                	b1.keyReleased(ke);
	                }
	    	       @Override
	                public void keyPressed(KeyEvent ke)
	                {
	                	b1.keyPressed(ke);
	                }
			});
	      setFocusable(true);
	}
	
    public void move() 
    {
		b.move();
		b1.move();
	}
    

	@Override
	public void paint(Graphics g) 
	{
		super.paint(g);
		b.paint(g);
		b1.paint(g);
		
	}
	public void gameOver() 
	{
		String point="Ur score is ";
		point+=Integer.toString(Ball.c);
		JOptionPane.showMessageDialog(this, point,"Game Over", JOptionPane.YES_NO_OPTION);
		//JOptionPane.showMessageDialog(this, point,"Score", JOptionPane.YES_NO_OPTION);
		System.exit(ABORT);
	}
	public static void main(String[] args) throws InterruptedException 
	{
		JFrame frame = new JFrame("Sours Ball game");
		Game g = new Game();
		count=Ball.c;
		frame.add(g);
		frame.setSize(1400,700);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JOptionPane.showMessageDialog(null, "Are u ready?", "Sours Ball game", JOptionPane.YES_NO_OPTION);
		
		while (true) 
		{
			g.move();
			g.repaint();
			if(count<=5)
			    Thread.sleep(2);
			else if(count<10)
				 Thread.sleep(1);
			else 
				Thread.sleep(0);
		
		}
	}
}