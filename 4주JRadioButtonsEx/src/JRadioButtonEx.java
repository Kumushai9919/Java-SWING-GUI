import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JRadioButtonEx extends JFrame{
	public JRadioButtonEx() {
		setTitle("CheckboxEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ButtonGroup g = new ButtonGroup();
		JRadioButton apple = new JRadioButton("apple");
		JRadioButton pear = new JRadioButton("pear", true);
		JRadioButton cherry = new JRadioButton("acherry");
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(300, 300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JRadioButtonEx();

	}

}
