import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class KeyReverseEx extends JFrame{
	public KeyReverseEx() {
		setTitle("KeyListenerReverse");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel lb = new JLabel("love Java");
		lb.addKeyListener(new MyKeyListener());
		c.add(lb);
		setSize(300,300);
		setVisible(true);
		lb.requestFocus();
	}
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode() == KeyEvent.VK_LEFT) {
				JLabel la = (JLabel)e.getSource();
				StringBuffer text = new StringBuffer(la.getText());
				la.setText(text.reverse().toString());		
			}
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyReverseEx();

	}

}
