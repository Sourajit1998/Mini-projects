import java.awt.*;
import java.awt.Rectangle;

public class Ball 
{
	public static final int DIAMETER=30;
	int x=0,y=0,xa=1,ya=1;
	public static int c=0;
	public Game g;
	public Ball(Game g) 
	{
		this.g=g;
	}

	void move() 
	{
		if (x+xa<0)
			xa=1;
		if (x+xa>g.getWidth()-DIAMETER)
			xa=-1;
		if (y+ya<0)
			ya=1;
		if (y+ya>g.getHeight()-DIAMETER)
		{
			//ya=-1;
			g.gameOver();
		}
		if(collision())
		{
			ya=-1;
			y=g.b1.getTopY()-DIAMETER;
			c++;
			//c=count();
		}
		x=x+xa;
		y=y+ya;
	}
    public Boolean collision()
    {
    	return g.b1.getBounds().intersects(getBounds());
    }
	public void paint(Graphics g) 
	{
		String point=Integer.toString(c);
		g.setColor(Color.black);
		g.fillOval(x, y,DIAMETER,DIAMETER);
		g.setFont(new Font("Verdana",Font.BOLD,40));
		g.setColor(Color.red);
		g.drawString("Score",1200 , 80);
		g.drawString(point,1200, 150);
		
	}
	public Rectangle getBounds()
	{
		return new Rectangle(x,y,DIAMETER,DIAMETER);
	}
	/*public int count()
	{
		c++;
		return c;
	}
	*/
}

