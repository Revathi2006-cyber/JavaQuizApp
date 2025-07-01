package quiz;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
	
	JButton rules,back;
	JTextField tfname;
	Login(){
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
		JLabel image = new JLabel(i1);
		image.setBounds(0, 0,500,500);
		add(image);		
		
		JLabel heading = new JLabel("Growing Minds");
		heading.setBounds(560,50,300,60);
		heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
		heading.setForeground(new Color(30,144,254));
		add(heading);
		
		
		JLabel name = new JLabel("Enter your name");
		name.setBounds(600,110,270,45);
		name.setFont(new Font("Segoe Script",Font.BOLD,20));
		name.setForeground(new Color(30,144,254));
		add(name);
		
		
		tfname=new JTextField();
		tfname.setBounds(540,180,300,25);
		tfname.setFont(new Font("Times New Roman",Font.BOLD,22));
		tfname.setHorizontalAlignment(JTextField.CENTER);
		add(tfname);
		
		
		rules=new JButton("Rules");
		rules.setBounds(540,250,120,25);
		rules.setBackground(new Color(30,144,254));
		rules.setFont(new Font("MV Boli",Font.BOLD,15));
		rules.setForeground(Color.WHITE);
		rules.addActionListener(this);
		add(rules);
		
		back=new JButton("Back");
		back.setBounds(700,250,120,25);
		back.setBackground(new Color(30,144,254));
		back.setFont(new Font("MV Boli",Font.BOLD,15));
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		add(back);
		
		
		setSize(900,500);
		setLocation(200,100);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == rules) {
			String name=tfname.getText();
			setVisible(false);
			new Rules(name);
		}else if (ae.getSource() == back) {
			setVisible(false);
		}
	}
	public static void main(String [] args) {
		new Login();
	}

}
