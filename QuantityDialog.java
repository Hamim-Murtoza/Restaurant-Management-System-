import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 public class QuantityDialog extends JFrame implements MouseListener, ActionListener{
 
    public  int quantity = 0; // Initialize the quantity
	JPanel panel;
	JLabel quantityLabel ;
	JButton plusBtn, minusbtn, confirmBtn, cancelBtn;
	Font myFont;
	ImageIcon icon;
	//User u;
	//Users us;
	//String pass = "", hiddenPass = "";
 
 
    public QuantityDialog() {
        super("My dashboard");
		this.setSize(500,400);
		icon = new ImageIcon("images/student.jpg");
		this.setIconImage(icon.getImage());  //setting icon of the frame header
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
 
 
       panel = new JPanel();
	   panel.setLayout(null);


        //imgCancelBtn = new ImageIcon("cancelBtn.png");
	    cancelBtn=new JButton("Cancel");
		cancelBtn.setBounds(0,0,40,40);
		//confirmBtn.setBackground();
		cancelBtn.addMouseListener(this);
		cancelBtn.addActionListener(this);
		panel.add(cancelBtn);
		
       // imgOrderBtn = new ImageIcon("confirmBtn.png");
		confirmBtn=new JButton("Confirm");
		confirmBtn.setBounds(25,670,333,30);
		confirmBtn.addMouseListener(this);
		confirmBtn.addActionListener(this);
		//confirmBtn.setFont(myFont2);
	   //confirmBtn.setBorder(null);
		confirmBtn.setOpaque(true);
		panel.add(confirmBtn);


       
	    plusBtn=new JButton("+");
		 plusBtn.setBounds(50,50,40,40);
		//confirmBtn.setBackground();
		 plusBtn.addMouseListener(this);
		 plusBtn.addActionListener(this);
		 panel.add(plusBtn);

		quantityLabel = new JLabel("Quantity" +"     " + quantity);
		quantityLabel.setBounds(90,50,100,40);
		quantityLabel.setFont(myFont);
		panel.add(quantityLabel);


        
		minusbtn=new JButton("-");
		minusbtn.setBounds(190,50,40,40);
		minusbtn.addMouseListener(this);
		minusbtn.addActionListener(this);
		//confirmBtn.setFont(myFont2);
	   //confirmBtn.setBorder(null);
		minusbtn.setOpaque(true);
		panel.add(minusbtn);


 
 
       
 
        // Add panel to dialog and set dialog properties
        this.add(panel);
    }
 
 //value set hobe 12 ta 

 public void setSpaghettiValue(){}
	
         // Return the selected quantity
    
	
	public void mouseClicked(MouseEvent me){}
	public void mouseEntered(MouseEvent me){
		
	} 	
	public void mouseExited(MouseEvent me){
	
	}   
	public void mousePressed(MouseEvent me){
		
	}
	
	public void mouseReleased(MouseEvent me){
		
	}
	
	public void actionPerformed(ActionEvent ae){
		
	}
	
}