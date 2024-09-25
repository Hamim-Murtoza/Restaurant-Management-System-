import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignUp extends JFrame implements MouseListener, ActionListener{
	JPanel panel;
	JLabel userLabel, passwordLabel, confirmPassLabel, genderLabel, dobLabel, addressLabel;
	JTextField userTF, addressTF;
	JPasswordField passwordTF, confirmPasswordTF;
	JButton signUpBtn,backBtn;
	JRadioButton r1,r2,r3;
	ButtonGroup bg;
	JComboBox date,month,year;
	Color myColor1, myColor2;
	Font myFont, myFont2;
	ImageIcon icon;
	Users us;
	
	public SignUp(Users us){
		super("Sign up");
		this.setSize(458,708);
		icon = new ImageIcon("images/signup.png");
		this.setIconImage(icon.getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.us = us;
		
		myColor1 = new Color(191,232,247);
		myColor2 = new Color(236,235,232);
		myFont = new Font("Century",Font.ITALIC, 17);
		myFont2 = new Font("Times New Roman",Font.PLAIN, 16);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(myColor2);
		
		userLabel = new JLabel("User name: "); 
		userLabel.setBounds(50,10,150,30);
		userLabel.setFont(myFont2);
		panel.add(userLabel);
		
		userTF = new JTextField();
		userTF.setBounds(200,10,200,30);
		userTF.setFont(myFont2);
		panel.add(userTF);
		
		passwordLabel = new JLabel("Password: ");
		passwordLabel.setBounds(50,50,150,30);
		passwordLabel.setFont(myFont2);
		panel.add(passwordLabel);
		
		passwordTF = new JPasswordField();
		passwordTF.setBounds(200,50,200,30);
		passwordTF.setFont(myFont2);
		passwordTF.setEchoChar('*');
		panel.add(passwordTF);
		
		confirmPassLabel = new JLabel("Confirm Password: ");
		confirmPassLabel.setBounds(50,90,150,30);
		confirmPassLabel.setFont(myFont2);
		panel.add(confirmPassLabel);
		
		confirmPasswordTF = new JPasswordField();
		confirmPasswordTF.setBounds(200,90,200,30);
		confirmPasswordTF.setFont(myFont2);
		confirmPasswordTF.setEchoChar('*');
		panel.add(confirmPasswordTF);
		
		genderLabel = new JLabel("Gender: ");
		genderLabel.setBounds(50,130,150,30);
		genderLabel.setFont(myFont2);
		panel.add(genderLabel);
		
		dobLabel = new JLabel("Date of Birth:");
		dobLabel.setBounds(50,170,150,30);
		dobLabel.setFont(myFont2);
		panel.add(dobLabel);
		
		String dates[]= {"1","2","3","4","5","6","7","8","9",
						"10","11","12","13","14","15","16","17",
						"18","19","20","21","22","23","24","25",
						"26","27","28","29","30","31"};
		date = new JComboBox(dates);
		date.setBounds(200,170,50,30);
		panel.add(date);
		
		String months[]= {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG", "SEP","OCT","NOV","DEC"};
		month = new JComboBox(months);
		month.setBounds(250,170,80,30);
		panel.add(month);
		
		String years[]= {"1990","1991","1992","1993","1994",
		                 "1995","1996","1997","1998","1999","2000",
						 "2001","2002","2003","2004","2005","2006",
						 "2007","2008","2009","2010","2011","2012",
						 "2013","2014","2015","2016","2017","2018",
						 "2019","2020","2021","2022","2023","2024"};
		year = new JComboBox(years);
		year.setBounds(330,170,80,30);
		panel.add(year);
		
		
		addressLabel = new JLabel("Address:");
		addressLabel.setBounds(50,210,150,30);
		addressLabel.setFont(myFont2);
		panel.add(addressLabel);
		
		addressTF = new JTextField();
		addressTF.setBounds(200,210,200,30);
		addressTF.setFont(myFont2);
		panel.add(addressTF);
		
		r1 = new JRadioButton("Male");
		r1.setBounds(200,130,80,30);
		panel.add(r1);
		r2 = new JRadioButton("Female");
		r2.setBounds(280,130,80,30);
		panel.add(r2);
		r3 = new JRadioButton("Other");
		r3.setBounds(360,130,80,30);
		panel.add(r3);
		
		bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		
		signUpBtn = new JButton("Sign Up");
		signUpBtn.setBounds(250,250,100,25);
		signUpBtn.setFont(myFont);
		signUpBtn.setBackground(myColor1);
		signUpBtn.setForeground(Color.BLACK);
		signUpBtn.addMouseListener(this);
		signUpBtn.addActionListener(this);
		signUpBtn.setBorder(null);
		panel.add(signUpBtn);
		
		icon = new ImageIcon("images/backBtn.png");
		backBtn = new JButton(icon);
		backBtn.setBounds(180,250,36,30);
		backBtn.addMouseListener(this);
		backBtn.addActionListener(this);
		backBtn.setBorder(null);
		panel.add(backBtn);

		this.add(panel);
		//this.setVisible(true);
	}
	
	public void mouseClicked(MouseEvent me){}  
	public void mouseEntered(MouseEvent me){}  
	public void mouseExited(MouseEvent me){}  
	public void mousePressed(MouseEvent me){}  
	public void mouseReleased(MouseEvent me){} 

	public void actionPerformed(ActionEvent ae){
		String command = ae.getActionCommand();
		if(backBtn.getText().equals(command)){
			Login lg = new Login(us);
			lg.setVisible(true);
			this.setVisible(false);
		}
		if(signUpBtn.getText().equals(command)){
			String name = userTF.getText();
			String pass = passwordTF.getText();
			String confirmPass = confirmPasswordTF.getText();
			String address = addressTF.getText();
			
			String gender = "", dt = "", mn = "", yr= "", dob="";
			
			if(r1.isSelected()){ gender = "Male"; }
			else if(r2.isSelected()){ gender = "Female"; }
			else if(r3.isSelected()){ gender = "Other"; }
			
			dt = date.getSelectedItem().toString();
			mn = month.getSelectedItem().toString();
			yr = year.getSelectedItem().toString();
			
			dob = dt+"/"+mn+"/"+yr;
			
			if(!name.isEmpty() && !pass.isEmpty() && !confirmPass.isEmpty() && !gender.isEmpty() && !dob.isEmpty() && !address.isEmpty()){
				if(pass.equals(confirmPass)){
					User u = new User(name, pass, gender, dob, address);
					
					//Users us = new Users(); 
					us.addUser(u);
					
					Login lg = new Login(us);
					lg.setVisible(true);
					this.setVisible(false);
					
				}else{
					JOptionPane.showMessageDialog(this, "Password missmatch!");
				}
				
			}else{
				JOptionPane.showMessageDialog(this, "Some field is empty!");
			}
		}
	}
	
}