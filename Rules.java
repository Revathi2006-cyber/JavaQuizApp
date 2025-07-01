package quiz;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class Rules extends JFrame implements ActionListener {
	JButton start,back;
	String name;
	Rules(String name){
		this.name=name;
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz 1.png"));
		JLabel image = new JLabel(i2);
		image.setBounds(480,20,400,420);
		add(image);
		
		JLabel heading = new JLabel("Welcome " +name+ " to Growing Minds");
		heading.setBounds(50,20,700,40);
		heading.setFont(new Font("Viner Hand ITC",Font.BOLD,25));
		heading.setForeground(new Color(30,144,254));
		add(heading);
		
		JLabel rules = new JLabel();
		rules.setBounds(20,60,700,350);
		rules.setFont(new Font("Tahoma",Font.PLAIN,16));
		rules.setText("<html>" + 
				"1. There are a total of 10 questions in the quiz." + "<br><br>" +
				"2. Each question carries 1 mark. No negative marking." + "<br><br>" +
				"3. You will have only 15 seconds to answer each question." + "<br><br>" +
				"4. Once you select an answer, you cannot go back or change it." + "<br><br>" +
				"5. Use only your own knowledge — no cheating!" + "<br><br>" +
				"6. Make sure your internet connection is stable (if applicable)." + "<br><br>" +
				"7. At the end, your total score will be displayed." + "<br><br>" +
				"8. Relax, think carefully, and enjoy the quiz!" + "<br><br>" +
				"</html>"
);
		add(rules);
		
		back=new JButton("Back");
		back.setBounds(80,400,100,30);
		back.setBackground(new Color(30,144,254));
		back.setFont(new Font("MV Boli",Font.BOLD,15));
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		add(back);
		
		start=new JButton("start");
		start.setBounds(250,400,100,30);
		start.setBackground(new Color(30,144,254));
		start.setFont(new Font("MV Boli",Font.BOLD,15));
		start.setForeground(Color.WHITE);
		start.addActionListener(this);
		add(start);
		
		
		setSize(900,500);
		setLocation(200,100);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == start) {
			setVisible(false);
			new Quiz(name);
		}else {
			setVisible(false);
			new Login();
		}
	}
	
	
    public static void main(String [] args) {
	      new Rules("user");
   }
}