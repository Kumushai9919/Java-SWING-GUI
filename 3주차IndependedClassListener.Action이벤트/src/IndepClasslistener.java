import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IndepClasslistener extends JFrame {
	public IndepClasslistener() {
		setTitle("Actio 이벤트 리스너 에제 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		JButton btn = new JButton("IndependedClassListener Action");
		btn.addActionListener(new MyActionLis());
		c.add(btn);
		setSize(350, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new IndepClasslistener();
	}
}
//Independent class
class MyActionLis implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton b =(JButton)e.getSource();
		if(b.getText().equals("Action"))
			b.setText("앸션");
		else
			b.setText("Action");
	}
}