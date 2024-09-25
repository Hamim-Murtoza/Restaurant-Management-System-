import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements MouseListener, ActionListener{
	JPanel panel;
	JLabel userLabel, passwordLabel, signUpLabel, imgLabel;
	JTextField userTF;
	JPasswordField passwordTF;
	JButton lgnBtn, exitBtn, signUpBtn, forgotBtn;
	Color myColor1, myColor2;
	Font myFont, myFont2;
	ImageIcon img;
	Users us;
	
	public Login(Users us){
		super("Login");
		this.setSize(458,708);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);  //frame will be on the center
		this.us = us;
		
		myColor1 = new Color(191,232,247);
		myColor2 = new Color(236,235,232);
		myFont = new Font("Century",Font.ITALIC, 17);
		myFont2 = new Font("Times New Roman",Font.PLAIN, 16);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(myColor1);
		
		userLabel = new JLabel("User name: "); 
		userLabel.setBounds(100,100,100,30);
		userLabel.setBackground(myColor2);
		userLabel.setForeground(Color.BLACK);
		userLabel.setOpaque(true);
		userLabel.setFont(myFont);
		panel.add(userLabel);
		
		passwordLabel = new JLabel("Password: ");
		passwordLabel.setBounds(100,140,100,30);
		passwordLabel.setBackground(myColor2);
		passwordLabel.setForeground(Color.BLACK);
		passwordLabel.setOpaque(true);
		passwordLabel.setFont(myFont);
		panel.add(passwordLabel);
		
		userTF = new JTextField();
		userTF.setBounds(205,100,200,30);
		userTF.setFont(myFont2);
		panel.add(userTF);
		
		passwordTF = new JPasswordField();
		passwordTF.setBounds(205,140,200,30);
		passwordTF.setFont(myFont2);
		passwordTF.setEchoChar('*');
		panel.add(passwordTF);
		
		lgnBtn = new JButton("Login");
		lgnBtn.setBounds(160,180,80,25);
		lgnBtn.setBackground(Color.GREEN);
		lgnBtn.setForeground(Color.BLACK);
		lgnBtn.setOpaque(true);
		lgnBtn.addMouseListener(this);
		lgnBtn.addActionListener(this);
		panel.add(lgnBtn);
		
		exitBtn = new JButton("Cancel");
		exitBtn.setBounds(250,180,80,25);
		exitBtn.setBackground(Color.RED);
		exitBtn.setForeground(Color.WHITE);
		exitBtn.addMouseListener(this);
		exitBtn.addActionListener(this);
		exitBtn.setOpaque(true);
		panel.add(exitBtn);
		
		signUpLabel = new JLabel("Don't have an account?");
		signUpLabel.setBounds(100,210,200,30);
		signUpLabel.setFont(myFont2);
		panel.add(signUpLabel);
		
		signUpBtn = new JButton("Sign up");
		signUpBtn.setBounds(300,210,100,25);
		signUpBtn.setBackground(myColor2);
		signUpBtn.setForeground(Color.BLUE);
		signUpBtn.addMouseListener(this);
		signUpBtn.addActionListener(this);
		signUpBtn.setBorder(null);
		panel.add(signUpBtn);
		
		forgotBtn = new JButton("Forgotten password?");
		forgotBtn.setBounds(140,240,200,30);
		forgotBtn.setFont(myFont2);
		forgotBtn.setBackground(myColor1);
		forgotBtn.setForeground(Color.MAGENTA);
		forgotBtn.addMouseListener(this);
		forgotBtn.addActionListener(this);
		forgotBtn.setBorder(null);
		panel.add(forgotBtn);
		
		
		
		
		this.add(panel);
		this.setVisible(true);
	}
	
	public void mouseClicked(MouseEvent me){}  
	public void mouseEntered(MouseEvent me){
		if(me.getSource() == lgnBtn){
			lgnBtn.setBackground(Color.RED);
			lgnBtn.setForeground(Color.WHITE);
		}else if(me.getSource() == exitBtn){
			exitBtn.setBackground(Color.GREEN);
			exitBtn.setForeground(Color.BLACK);
		}else{}
	}  
	public void mouseExited(MouseEvent me){
		if(me.getSource() == lgnBtn){
			lgnBtn.setBackground(Color.GREEN);
			lgnBtn.setForeground(Color.BLACK);
		}else if(me.getSource() == exitBtn){
			exitBtn.setBackground(Color.RED);
			exitBtn.setForeground(Color.WHITE);
		}else{}
	}  
	public void mousePressed(MouseEvent me){}  
	public void mouseReleased(MouseEvent me){} 

	public void actionPerformed(ActionEvent ae){
		String command = ae.getActionCommand();
		if(signUpBtn.getText().equals(command)){
			SignUp si = new SignUp(us);
			si.setVisible(true);
			this.setVisible(false);
		}else if(lgnBtn.getText().equals(command)){
			String name = userTF.getText();
			String pass = passwordTF.getText();
			
			if(!name.isEmpty() && !pass.isEmpty()){
				
				int index = us.userExists(name);
				if(index == -1){
					JOptionPane.showMessageDialog(this, "User doesn't exist.");
				}else{
					User u = us.checkPassword(index, pass);
					if( u == null){
						JOptionPane.showMessageDialog(this, "Incorrect password.");
					}else{
						DashBoard db = new DashBoard(u,us);
						db.setVisible(true);
						this.setVisible(false);
					}
				}
				
			}else{
				JOptionPane.showMessageDialog(this, "Username/password required!");
			}
		}else if((exitBtn.getText().equals(command))){
			FristeFrame ab=new FristeFrame(us);
			ab.setVisible(true);
			this.setVisible(false);
		}else if(forgotBtn.getText().equals(command)){
			ForgotPassword fp = new ForgotPassword(us);
			fp.setVisible(true);
			this.setVisible(false);
		}
	}
	
}