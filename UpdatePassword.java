//package Classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UpdatePassword extends JFrame implements MouseListener, ActionListener{
	JPanel panel;
	JLabel userLabel, passwordLabel, confirmPassLabel;
	JPasswordField passwordTF, confirmPasswordTF;
	JButton searchBtn,cancelBtn,updateBtn;
	Color myColor1, myColor2, myColor3;
	Font myFont, myFont2;
	ImageIcon icon;
	User u;
	Users us;
	int value;
	public UpdatePassword(User u, Users us, int value){
		super("Update password");
		this.setSize(458,708);
		icon = new ImageIcon("images/forgotPass.jpg");
		this.setIconImage(icon.getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.u = u;
		this.us = us;
		this.value = value;
		
		myColor1 = new Color(191,232,247);
		myColor2 = new Color(236,235,232);
		myColor3 = new Color(50,120,0);
		myFont = new Font("Century",Font.ITALIC, 17);
		myFont2 = new Font("Times New Roman",Font.PLAIN, 17);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(myColor2);
		
		userLabel = new JLabel("User name: " + u.getName()); 
		userLabel.setBounds(50,100,200,30);
		userLabel.setFont(myFont2);
		panel.add(userLabel);
		
		passwordLabel = new JLabel("New Password: ");
		passwordLabel.setBounds(50,150,150,30);
		passwordLabel.setFont(myFont2);
		panel.add(passwordLabel);
		
		passwordTF = new JPasswordField();
		passwordTF.setBounds(200,150,200,30);
		passwordTF.setFont(myFont2);
		passwordTF.setEchoChar('*');
		panel.add(passwordTF);
		
		confirmPassLabel = new JLabel("Confirm Password: ");
		confirmPassLabel.setBounds(50,190,150,30);
		confirmPassLabel.setFont(myFont2);
		panel.add(confirmPassLabel);
		
		confirmPasswordTF = new JPasswordField();
		confirmPasswordTF.setBounds(200,190,200,30);
		confirmPasswordTF.setFont(myFont2);
		confirmPasswordTF.setEchoChar('*');
		panel.add(confirmPasswordTF);
		
		updateBtn = new JButton("Update");
		updateBtn.setBounds(250,230,90,30);
		updateBtn.setFont(myFont);
		updateBtn.setBackground(myColor1);
		updateBtn.setForeground(myColor3);
		updateBtn.addMouseListener(this);
		updateBtn.addActionListener(this);
		updateBtn.setBorder(null);
		panel.add(updateBtn);
		
		cancelBtn = new JButton("Cancel");
		cancelBtn.setBounds(150,230,90,30);
		cancelBtn.setFont(myFont);
		cancelBtn.setBackground(myColor1);
		cancelBtn.setForeground(Color.RED);
		cancelBtn.addMouseListener(this);
		cancelBtn.addActionListener(this);
		cancelBtn.setBorder(null);
		panel.add(cancelBtn);
		
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
		if(updateBtn.getText().equals(command)){
			String pass = passwordTF.getText();
			String confirmPass = confirmPasswordTF.getText();
			
			if(!pass.isEmpty() && !confirmPass.isEmpty()){
				if(pass.equals(confirmPass)){
					u.setPassword(pass);
					JOptionPane.showMessageDialog(this, "Password updated");
					new Login(us);
					this.setVisible(false);
				}else{
					JOptionPane.showMessageDialog(this, "Password missmatch");
				}
			}else{
				JOptionPane.showMessageDialog(this, "Enter Password");
			}
			
		}else if(cancelBtn.getText().equals(command)){
			if(value==1){
				DashBoard db = new DashBoard(u,us);
						db.setVisible(true);
						this.setVisible(false);
			}else{
				new Login(us);
				this.setVisible(false);
			}
		}else{}
	}
}