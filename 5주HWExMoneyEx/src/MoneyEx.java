import java.util.Vector;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MoneyEx extends JFrame {
	private JTextField[] Output = new JTextField[8];
	private int[] exchangemoney = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
	private String[] won = { "오만원", "만원 ", "천원 ", "오백원 ", "백원 ", "오십원 ", "십원 ", "1원 " };
	private JTextField Input;
	private JCheckBox Boxs[] = new JCheckBox[7];

	public MoneyEx() {
		setTitle("MoneyEx with CheckBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.PINK);
		setLayout(null);

		JLabel pricelabel = new JLabel("금액");
		pricelabel.setHorizontalAlignment(SwingConstants.RIGHT);
		pricelabel.setSize(50, 20);
		pricelabel.setLocation(20, 20);
		add(pricelabel);

		Input = new JTextField(30);
		Input.setHorizontalAlignment(SwingConstants.RIGHT);

		Input.setSize(100, 20);
		Input.setLocation(100, 20);

		JButton calcbtn = new JButton("계산");
		calcbtn.setSize(80, 20);
		calcbtn.setLocation(190, 20);
		calcbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = Input.getText();
				if (str.length() == 0) {
					return;

				}
				int sum = Integer.parseInt(Input.getText());
				int remain = 0;
				for (int i = 0; i < exchangemoney.length; i++) {
					if (i == exchangemoney.length - 1) {
						remain = sum / exchangemoney[i];
						Output[i].setText(Integer.toString(remain));
					}
					if (!Boxs[i].isSelected()) {
						Output[i].setText("0");
						continue;
					}

					remain = sum / exchangemoney[i];
					Output[i].setText(Integer.toString(remain));
					sum = sum % exchangemoney[i];
				}
			}
		});

		c.add(pricelabel);
		c.add(Input);
		c.add(calcbtn);

		for (int i = 0; i < Output.length; i++) {
			pricelabel = new JLabel(won[i]);
			pricelabel.setSize(50, 20);
			pricelabel.setLocation(50, 50 + i * 20);

			Output[i] = new JTextField("0", 30);
			Output[i].setSize(100, 20);
			Output[i].setLocation(110, 50 + i * 20);
			c.add(pricelabel);
			c.add(Output[i]);
		}

		for (int i = 0; i < Boxs.length; i++) {
			Boxs[i] = new JCheckBox();
			Boxs[i].setSize(40, 20);
			Boxs[i].setOpaque(true);
			Boxs[i].setBackground(Color.PINK);
			Boxs[i].setLocation(220, 50 + i * 20);
			c.add(Boxs[i]);
		}
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MoneyEx();
	}
}
