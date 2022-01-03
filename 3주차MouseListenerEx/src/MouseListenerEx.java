import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerEx extends JFrame{
	private JLabel label = new JLabel("Hello");
	public MouseListenerEx() {
		setTitle("MouseListenerEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseAdapter());  //add listener mouse
		
		c.setLayout(null);
		label.setSize(50, 20);
		label.setLocation(30, 30);
		c.add(label);
		setSize(250, 250);
		setVisible(true);
		
	}
	class MyMouseAdapter extends MouseAdapter{   //we can use Adapter class to reduce method code lines 
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			label.setLocation(x,y);
		} 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseListenerEx();

	}

}
