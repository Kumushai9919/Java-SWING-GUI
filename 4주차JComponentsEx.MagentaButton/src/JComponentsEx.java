import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComponentsEx extends JFrame {
	public JComponentsEx() {
		super("JComponentsEx"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("Magenta/Yellow");
		JButton b2 = new JButton("Disabled Button");
		JButton b3 = new JButton("getX(), getY()");
	
		b1.setBackground(Color.YELLOW);
		b1.setBorderPainted(true);
		b1.setForeground(Color.MAGENTA);
		b1.setFont(new Font("Arial", Font.ITALIC, 20));
		b2.setEnabled(false);
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				JComponentsEx frame = (JComponentsEx)b.getTopLevelAncestor();
				frame.setTitle(b.getX() + "," + b.getY());	
			}
		});
		c.add(b1); c.add(b2); c.add(b3);
		setSize(260, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JComponentsEx();

	}

}
