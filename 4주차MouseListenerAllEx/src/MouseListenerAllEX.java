import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseListenerAllEX extends JFrame {
	private JLabel la = new JLabel("no mouse event");
	public MouseListenerAllEX() {
		setTitle("MouseListener and MouseMotionListener");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyMouseListener listener = new MyMouseListener(); //we created "Mymouselistener object"so we can set it for two of them-> MouseListener and MouseMotionListener
		c.addMouseMotionListener(listener);
		c.add(la);
		setSize(300,300);
		setVisible(true);
		
	}
	class MyMouseListener implements MouseListener, MouseMotionListener{
		public void mousePressed(MouseEvent e) {
			la.setText("mousePressed)" + e.getX() + "," + e.getY() + ")");
		}
		public void mouseReleased(MouseEvent e) {
			la.setText("mouseReleased)" + e.getX() + "," + e.getY() + ")");
		}

		public void mouseClicked(MouseEvent e) {
		}
		
		public void mouseEntered(MouseEvent e) {
			Component c =(Component)e.getSource();
			c.setBackground(Color.CYAN);
		}
		public void mouseExited(MouseEvent e) {
			Component c =(Component)e.getSource();
			c.setBackground(Color.YELLOW);
		}

		public void mouseDragged(MouseEvent e) {
			la.setText("mousedragged)" + e.getX() + "," + e.getY() + ")");
		}
		public void mouseMoved(MouseEvent e) {
			la.setText("mouseMoved)" + e.getX() + "," + e.getY() + ")");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseListenerAllEX();

	}

}
