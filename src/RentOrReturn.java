import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class RentOrReturn extends JFrame implements ActionListener {
	JPanel jp1,jp2,jp3,jp4;
	JButton Bsch,BRent,BNew,BRe,BBack;
	JTextField	BTNum,BTWho,BTName,BTPrice,BTWhere,BTYN;
	public RentOrReturn(String title,int width,int height) {
		setTitle(title);
		setSize(width,height);
		setDefaultCloseOperation(3);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		jp4 = new JPanel();
		//첫번째 패널
		jp1.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel BNL = new JLabel("도서명");
		JTextField BJT = new JTextField(15);
		Bsch = new JButton("검색");
		Bsch.addActionListener(this);
		jp1.add(BNL);
		jp1.add(BJT);
		jp1.add(Bsch);
		
		//두번째 패널
		jp2.setLayout(null);
		jp2.setPreferredSize(new Dimension(600, 120));
		JLabel BNum = new JLabel("도서번호");
		JLabel BName = new JLabel("제목");
		JLabel BWho = new JLabel("저 자");
		JLabel BWhere = new JLabel("출판사");
		JLabel BPrice = new JLabel("가 격");
		JLabel BYN = new JLabel("대출여부");
		BNum.setBounds(40, 40, 50, 20);
		BName.setBounds(320, 40, 50, 20);
		BWho.setBounds(40, 65, 50, 20);
		BWhere.setBounds(320, 65, 50, 20);
		BPrice.setBounds(40, 90, 50, 20);
		BYN.setBounds(320, 90, 50, 20);
		
		 BTNum = new JTextField(30);
		BTName = new JTextField(30);
		BTWho = new JTextField(30);
		BTWhere = new JTextField(30);
		BTPrice = new JTextField(30);
		BTYN = new JTextField(30);
		BTNum.setBounds(90, 40, 90, 20);
		BTName.setBounds(370, 40, 90, 20);
		BTWho.setBounds(90, 65, 90, 20);
		BTWhere.setBounds(370, 65, 90, 20);
		BTPrice.setBounds(90, 90, 90, 20);
		BTYN.setBounds(370, 90, 90, 20);
	
		jp2.add(BNum);
		jp2.add(BName);
		jp2.add(BWho);
		jp2.add(BWhere);
		jp2.add(BPrice);
		jp2.add(BYN);
		
		jp2.add(BTNum);
		jp2.add(BTName);
		jp2.add(BTWho);
		jp2.add(BTWhere);
		jp2.add(BTPrice);
		jp2.add(BTYN);
		
		//3번째패널
		jp3 = new JPanel();
		jp3.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp3.setPreferredSize(new Dimension(600, 45));
		BRent = new JButton("대여반납");
		BRent.addActionListener(this);
		BNew = new JButton("초기화");
		BRe = new JButton("새로고침");
		BBack = new JButton("돌아가기");
		jp3.add(BRent);
		jp3.add(BNew);
		jp3.add(BRe);
		jp3.add(BBack);
		
		//4번째 패널
		jp4.setLayout(new GridLayout(1,1));
		String header[] = {"도서번호","제목","저자"
				 ,"출판사","가격","대출여부"};
		 String contents[][] = {};
		 
		 JTable JT = new JTable(contents,header);
		 JScrollPane scrollpane = new JScrollPane(JT);
				scrollpane.setPreferredSize(new Dimension(600, 400));
		 jp4.add(scrollpane);
		add(jp1);
		add(jp2);
		add(jp3);
		add(jp4);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		JFrame j = new JFrame();
		new RentOrReturn("도서대여/반납",600,700);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==Bsch) {
//			for (int i = 0; i < v.size(); i++) {
//				if(())
//			}
		}
		if(obj==BRent) {
		new RenRe("대여/반납",400,400);
		}
		}
	

public class RenRe extends JFrame {
	public RenRe(String title,int width,int height) {
		setTitle(title);
		setSize(width, height);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
}

}