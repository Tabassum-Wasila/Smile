import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Smile extends JFrame{
	public Smile(){
		
		super.setTitle("Smile!!");
		super.setSize(400, 400);
		super.setVisible(true);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setLocationRelativeTo(null);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.YELLOW);
		g.fillArc(100, 100, 200, 200, 0, 360);
		g.setColor(Color.blue);
		g.fillArc(140, 150, 50, 50, 0, 360);
		g.fillArc(220, 150,  50,  50,  0,  360);
		g.setColor(Color.red);
		g.drawArc(160, 180, 80, 80, 200, 140);	
	}
	public static void main(String[] args)
	{
		Smile smile = new Smile();
	}
}
