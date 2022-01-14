import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JLabelGame extends JFrame{
	JLabel [] gamelabels = new JLabel[10];
	int nextpr = 0;
	public JLabelGame() {
		setTitle("LabelGames");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i=0; i<gamelabels.length; i++) {
			Container c = getContentPane();
			gamelabels[i] = new JLabel(Integer.toString(i));
			gamelabels[i].setForeground(Color.MAGENTA);
			c.add(gamelabels[i]);
			gamelabels[i].addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					JLabel l = (JLabel)e.getSource();
					if(Integer.parseInt(l.getText()) == nextpr) {
						nextpr++;
						if(nextpr == 10) {
							nextpr = 0;
							configure();
						}
						else 
							l.setVisible(false);
					}
				}
				
			});
			
		}
		setSize(300, 300);
		setVisible(true);
		configure();
	}

	void configure() {
		// TODO Auto-generated method stub
		Container c = getContentPane();
		for(int i=0; i<gamelabels.length; i++) {
					int xBound = c.getWidth() - gamelabels[i].getWidth();
					int yBound = c.getHeight() - gamelabels[i].getHeight();
					
					int x = (int)(Math.random()*xBound);
					int y = (int)(Math.random()*yBound);
					
					gamelabels[i].setLocation(x, y);
					gamelabels[i].setSize(15, 15);
					gamelabels[i].setVisible(true);	
		}
	}
	 

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		new JLabelGame();

	}

}
