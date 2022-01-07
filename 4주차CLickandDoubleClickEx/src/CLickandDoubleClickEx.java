import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CLickandDoubleClickEx extends JFrame {
	CLickandDoubleClickEx(){
		setTitle("CLickandDoubleClickEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.addMouseListener(new Mymouselistener());
		setSize(400,400);
		setVisible(true);
	}
	 class Mymouselistener extends MouseAdapter{
		 public void mouseClicked(MouseEvent e) {
			 if(e.getClickCount() == 2) {
				 int r = (int)(Math.random()*256);
				 int g = (int)(Math.random()*256);
				 int b = (int)(Math.random()*256);
				 Component c = (Component)e.getSource();
				 c.setBackground(new Color(r,g,b));
			 }
		 }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CLickandDoubleClickEx();

	}

}
