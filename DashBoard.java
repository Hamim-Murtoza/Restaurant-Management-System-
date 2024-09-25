import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DashBoard extends JFrame implements MouseListener, ActionListener{
	JPanel panel;
	JLabel userLabel, passwordLabel, genderLabel, dobLabel, addressLabel;
	JButton logoutBtn, showBtn, editBtn, deleteBtn, changeBtn,backBtn;
	Font myFont;
	ImageIcon icon;
	User u;
	Users us;
	String pass = "", hiddenPass = "";
	
	public DashBoard(User u, Users us){
		super("My dashboard");
		this.setSize(458,708);
		icon = new ImageIcon("images/student.jpg");
		this.setIconImage(icon.getImage());  //setting icon of the frame header
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.us = us;
		this.u = u;
		
		myFont = new Font("Cambria", Font.PLAIN, 17);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		userLabel = new JLabel("User name: "+ u.getName()); 
		userLabel.setBounds(50,10,300,30);
		userLabel.setFont(myFont);
		panel.add(userLabel);
		
		pass = u.getPassword();
		
		for(int i = 0; i<pass.length(); i++){
			hiddenPass += "*";
		}
		
		passwordLabel = new JLabel("Password: "+ hiddenPass);
		passwordLabel.setBounds(50,50,200,30);
		passwordLabel.setFont(myFont);
		panel.add(passwordLabel);
		
		genderLabel = new JLabel("Gender: " + u.getGender());
		genderLabel.setBounds(50,90,300,30);
		genderLabel.setFont(myFont);
		panel.add(genderLabel);
		
		dobLabel = new JLabel("Date of Birth: "+ u.getDOB());
		dobLabel.setBounds(50,130,300,30);
		dobLabel.setFont(myFont);
		panel.add(dobLabel);
		
		addressLabel = new JLabel("Address: " + u.getAddress());
		addressLabel.setBounds(50,170,300,30);
		addressLabel.setFont(myFont);
		panel.add(addressLabel);
		
		
		logoutBtn = new JButton("Log out");
		logoutBtn.setBounds(90,240,100,30);
		logoutBtn.setFont(myFont);
		logoutBtn.setForeground(Color.BLUE);
		logoutBtn.addActionListener(this);
		panel.add(logoutBtn);
		
		showBtn = new JButton("Show");
		showBtn.setBounds(300,55,80,25);
		showBtn.setBorder(null);
		showBtn.addMouseListener(this);
		showBtn.addActionListener(this);
		panel.add(showBtn);
		
		editBtn =  new JButton("Edit profile");
		editBtn.setBounds(55,290,100,30);
		editBtn.addActionListener(this);
		panel.add(editBtn);
		
		changeBtn = new JButton("Change password");
		changeBtn.setBounds(165,290,150,30);
		changeBtn.addActionListener(this);
		panel.add(changeBtn);
		
		deleteBtn = new JButton("Delete profile");
		deleteBtn.setBounds(325,290,120,30);
		deleteBtn.setOpaque(true);
		deleteBtn.addMouseListener(this);
		deleteBtn.addActionListener(this);
		panel.add(deleteBtn);
		
		backBtn=new JButton("Back");
		backBtn.setBounds(200,240,100,30);
		backBtn.setBackground(Color.GREEN);
		backBtn.addActionListener(this);
	    backBtn.addMouseListener(this);
		backBtn.setOpaque(true);
		panel.add(backBtn);
		
		this.add(panel);
		//this.setVisible(true);
		
	}
	
	public void mouseClicked(MouseEvent me){}
	public void mouseEntered(MouseEvent me){
		if(me.getSource() == deleteBtn){
			deleteBtn.setForeground(Color.RED);
		}else{}
	} 	
	public void mouseExited(MouseEvent me){
		if(me.getSource() == deleteBtn){
			deleteBtn.setForeground(Color.BLACK);
		}else{}
	}   
	public void mousePressed(MouseEvent me){
		if(me.getSource() == showBtn){
			passwordLabel.setText("Password: "+ pass);
		}
	}
	
	public void mouseReleased(MouseEvent me){
		if(me.getSource() == showBtn){
			passwordLabel.setText("Password: "+ hiddenPass);
		}
	}
	
	public void actionPerformed(ActionEvent ae){
		String command = ae.getActionCommand();
		if(logoutBtn.getText().equals(command)){
			Login lg = new Login(us);
			lg.setVisible(true);
			this.setVisible(false);
		}else if(deleteBtn.getText().equals(command)){
			int dialog = JOptionPane.YES_NO_OPTION;
			int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete your account?", "Delete account?", dialog);
			if(result == 0){
				us.deleteUser(u);
				JOptionPane.showMessageDialog(this, "Account deleted. Redirecting to Login page.");
				Login lg = new Login(us);
				lg.setVisible(true);
				this.setVisible(false);
			}else{
				//do nothing
			}

		}else if(changeBtn.getText().equals(command)){
			UpdatePassword ups = new UpdatePassword(u, us, 1);
			ups.setVisible(true);
			this.setVisible(false);

		}else if(editBtn.getText().equals(command)){
			UpdateProfile up = new UpdateProfile(u,us);
			up.setVisible(true);
			this.setVisible(false);
		}else if (backBtn.getText().equals(command)){
			MenueFrame mf=new MenueFrame();
			mf.setVisible(true);
			this.setVisible(false);
		}
	}
}
