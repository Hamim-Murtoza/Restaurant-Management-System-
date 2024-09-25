import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ForgotPassword extends JFrame implements MouseListener, ActionListener{
	JPanel panel;
	JLabel userLabel, passwordLabel, confirmPassLabel;
	JTextField userTF;
	JPasswordField passwordTF, confirmPasswordTF;
	JButton searchBtn,cancelBtn;
	Color myColor1, myColor2;
	Font myFont, myFont2;
	ImageIcon icon;
	Users us;
	
	public ForgotPassword(Users us){
		super("Forgot password");
		this.setSize(458,708);
		icon = new ImageIcon("images/forgotPass.jpg");
		this.setIconImage(icon.getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.us = us;
		
		myColor1 = new Color(191,232,247);
		myColor2 = new Color(236,235,232);
		myFont = new Font("Century",Font.ITALIC, 17);
		myFont2 = new Font("Times New Roman",Font.PLAIN, 17);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(myColor2);
		
		userLabel = new JLabel("Enter user name: "); 
		userLabel.setBounds(50,50,180,30);
		userLabel.setFont(myFont2);
		panel.add(userLabel);
		
		userTF = new JTextField();
		userTF.setBounds(180,50,250,30);
		userTF.setFont(myFont2);
		panel.add(userTF);
		
		searchBtn = new JButton("Search");
		searchBtn.setBounds(350,100,90,30);
		searchBtn.setFont(myFont);
		searchBtn.setBackground(myColor1);
		searchBtn.setForeground(Color.BLUE);
		searchBtn.addMouseListener(this);
		searchBtn.addActionListener(this);
		searchBtn.setBorder(null);
		panel.add(searchBtn);
		
		cancelBtn = new JButton("Cancel");
		cancelBtn.setBounds(250,100,90,30);
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
		if(searchBtn.getText().equals(command)){
			String name = userTF.getText();
			if(!name.isEmpty()){
				int index = us.userExists(name);
				if(index == -1){
					JOptionPane.showMessageDialog(this, "User does't exist!");
				}else{
					User u = us.getUser(index);
					
					UpdatePassword ups = new UpdatePassword(u, us, 0);
					ups.setVisible(true);
					this.setVisible(false);
				}
			}else{
				JOptionPane.showMessageDialog(this, "Enter an user name to search");
			}
			
		}else if(cancelBtn.getText().equals(command)){
			//Login lg = new Login(us);
			new Login(us);
			//lg.setVisible(true);
			this.setVisible(false);
			
		}else{}
	}
}