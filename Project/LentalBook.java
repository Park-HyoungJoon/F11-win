package swing.frame;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class LentalBook extends JFrame{
	public LentalBook(String title, int width, int height) {
		setTitle(title);
		setSize(width, height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(this);
		
		setLayout(new BorderLayout());
		JPanel p1 = new JPanel();
		add(p1, BorderLayout.NORTH);
		JButton b1 = new JButton("돌아가기");
		p1.add(b1);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new LentalBook("대여정보", 350, 450);

	}

}
