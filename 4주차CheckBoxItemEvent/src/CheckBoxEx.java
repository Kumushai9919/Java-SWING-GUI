import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckBoxEx extends JFrame{
	private JCheckBox [] fruits = new JCheckBox[3];
	private String [] names = {"사과 ", "배 ", "채리 "};
	private JLabel sumlabel = new JLabel();
	public CheckBoxEx() {
		setTitle("CheckboxEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("사과 100원, 배 500원, 채리 20000원 "));
		
		//리스터 객체 만들기
		MyItemListener listener = new MyItemListener();
		for(int i=0; i<fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true);
			c.add(fruits[i]);
			fruits[i].addItemListener(listener);
		}
		c.add(sumlabel);
		setSize(300, 300);
		setVisible(true);
	}
	class MyItemListener implements ItemListener{
		private int sum=0;
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getItem() == fruits[0])
					sum += 100;
				else if(e.getItem()==fruits[1])
					sum+=500;
				else 
					sum +=20000;	
			}
			else {
				if(e.getItem() == fruits[0])
					sum -= 100;
				else if(e.getItem()==fruits[1])
					sum-=500;
				else 
					sum -=20000;
			}
			sumlabel.setText("현재" + sum + "원입니다 ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxEx();

	}

}
