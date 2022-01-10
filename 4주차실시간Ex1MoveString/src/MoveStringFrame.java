import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MoveStringFrame extends JFrame{
	public MoveStringFrame() {
		super("MoveStringFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("love java");
		c.add(label);
		
		label.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
				JLabel la = (JLabel)e.getSource();
				String text = la.getText();
				String front = text.substring(0);
				String last = text.substring(1);
				la.setText(last.concat(front)); //rep
				}
			}	
		});
		setSize(300, 300);
		setVisible(true);
		label.setFocusable(true);
		label.requestFocus();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MoveStringFrame();

	}

}
