import java.awt.*;
import javax.swing.*;

public class Challenge extends JFrame {
	public Challenge() {
		setTitle("OpenChallenge");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentp = getContentPane();
		contentp.setLayout(new BorderLayout());
		
		JPanel northpanel1 = new JPanel();
		northpanel1.setBackground(Color.LIGHT_GRAY);
		northpanel1.add(new JButton("Open"));
		northpanel1.add(new JButton("Read"));
		northpanel1.add(new JButton("Close"));
		contentp.add(northpanel1,BorderLayout.NORTH); 
		
		JPanel centerpanel2 = new JPanel();
		centerpanel2.setBackground(Color.ORANGE);
		for(int i=0; i<3; i++){
			centerpanel2.setLayout(null);
			String[] words = {"Hello", "Java", "Love"}; 
			int x = (int)(Math.random()*250);
		    int y = (int)(Math.random()*250);
		    JLabel label = new JLabel(words[i]);//we need label for strings-words and set its location and size
			label.setLocation(x, y);
			label.setSize(40, 15);
		  	centerpanel2.add(label); //->then finally add label to panel2
		}
		contentp.add(centerpanel2,BorderLayout.CENTER);
		setSize(300,300);
		setVisible(true);	
	}
	public static void main(String[] args) {
		new Challenge();
	}
}


