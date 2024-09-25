import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




 public class FristeFrame extends JFrame implements MouseListener,ActionListener
 {
	
	JLabel imgLabel;
	//MenueFrame fdchose;
	
	JButton dineBtn,deliveryBtn,exitBtn;//pickup button Cutted 
	Color color1,color2,color3,color4,color5,color6,color7,color8;
	JTextArea area1,area2;
	ImageIcon img,img1;
	Font font1;
	//JRadioButton r1,r2,r3;	
	//ButtonGroup bg1;
	JPanel panel;
	Users us;
	
	
	public  FristeFrame(Users us){
		super("FRIST FRAME");    //Sets the title of the window
		this.setSize(458,708);   //Defines the window size as 650x650 pixels.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //Ensures the program exits when the window is closed.
		this.setLocationRelativeTo(null); //Centers the window on the screen when it appears.
		this.us=us;
		//color control
	    color1=new Color(0,0,0); //blue
		color2=new Color(130,64,184);  //purple
		color3=new Color(255,255,255);//White 
		color4=new Color(250,250,250,0);//transparent 
		
		
		
		
		//Font Corntoll 
		
		font1=new Font("Calibri (Body)",Font.BOLD,15);
			
	    //panel added 
		panel= new JPanel();  //Creates a new JPanel object.
		panel.setLayout(null); //Disables the layout manager, allowing manual positioning of components.
		 //this.add() use for visibility 
		this.add(panel);  //Adds the JPanel to the main window (JFrame), so it becomes part of the visible interface.
		
		
		
		dineBtn=new JButton(" DINE IN ");
		dineBtn.setBounds(154,400,150,40);
		dineBtn.setBackground(color3);
		dineBtn.addMouseListener(this);
		dineBtn.setBorder(null);
		dineBtn.setOpaque(true);
		panel.add(dineBtn);
		
		deliveryBtn=new JButton(" FOOD DELIVERY ");
		deliveryBtn.setBounds(154,450,150,40);
		deliveryBtn.setBackground(color3);
		deliveryBtn.addMouseListener(this);
		deliveryBtn.setOpaque(true);
		panel.add(deliveryBtn);
		
	  
		
		exitBtn=new JButton(" Exit ");
		exitBtn.setBounds(154,500,150,40);
		exitBtn.setBackground(color3);
		exitBtn.addActionListener(this);
	    exitBtn.addMouseListener(this);
		exitBtn.setOpaque(true);
		panel.add(exitBtn);
		
		
		
		 img =new ImageIcon("White and Orange Modern This or That Food Instagram Story.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0,0,458,708);
		panel.add(imgLabel);
		
		this.setVisible(true);
	}
	public void  mouseClicked(MouseEvent me){
                     if (me.getSource() ==deliveryBtn){
			JOptionPane.showMessageDialog(this, " Please Log In Frist !");
						 
					Login db = new Login( us);
					db.setVisible(true);
					this.setVisible(false);
					        }
					        if (me.getSource() ==dineBtn){
						    MenueFrame abc = new MenueFrame();
						    abc.setVisible(true);
						    this.setVisible(false);
									 }
									/* if (me.getSource() ==pickupBtn){
						            // JOptionPane.showMessageDialog(this, "PICK UP- Selected ");
						              MenueFrame abc = new MenueFrame();
						              abc.setVisible(true);
						              this.setVisible(false);*/
									 
									 

	}
	public void  mousePressed(MouseEvent me){}
	public void  mouseReleased(MouseEvent me) {}
	public void  mouseEntered(MouseEvent me){
		if(me.getSource() ==dineBtn){
			dineBtn.setBackground(Color.RED);
			dineBtn.setForeground(Color.WHITE);
			
		}else if (me.getSource()==deliveryBtn){
			deliveryBtn.setBackground(Color.RED);
			deliveryBtn.setForeground(Color.WHITE);
		}else if (me.getSource()==exitBtn){
			exitBtn.setBackground(Color.RED);
			exitBtn.setForeground(Color.WHITE);
		}
	}
	public void  mouseExited(MouseEvent me){
		if(me.getSource() ==dineBtn){
			dineBtn.setBackground(Color.WHITE);
			dineBtn.setForeground(Color.BLACK);
			
		}else if (me.getSource()==deliveryBtn){
			deliveryBtn.setBackground(Color.WHITE);
			deliveryBtn.setForeground(Color.BLACK);
		}else if (me.getSource()==exitBtn){
			exitBtn.setBackground(Color.WHITE);
			exitBtn.setForeground(Color.BLACK);
		}
	}
     public void actionPerformed(ActionEvent ae){
		String command = ae.getActionCommand();
        if(exitBtn.getText().equals(command)){
			System.exit(0);
		}
 }
 }