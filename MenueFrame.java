import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import javax.swing.*;
public class MenueFrame extends JFrame implements MouseListener , ActionListener {
    JFrame foodFrame;
    JLabel imgLabel;
    JButton spaghetti,pasta,meatball,salad,steak,chickenfried,burger,friedrice,pancake,tacos,ricebowl,pizza;
	
    JButton cancelBtn,confirmBtn;
	Color color1,color2,color3,color4,color5,color6,color7,color8;
    ImageIcon img,imgCancelBtn,imgOrderBtn,imgSpaghetti,imgPasta,imgMeatball,imgSalad,imgSteak,imgChickenfried,imgBurger,imgFriedrice,imgPancake,imgTacos,imgRicebowl,imgPizza;
    String option;
	Font myFont, myFont1,myFont2;
    JPanel panel;
	Users us;

    public MenueFrame() {
       // this.option = option;
        super("Menu");    //Sets the title of the window
		this.setSize(458,708);   //Defines the window size as 650x650 pixels.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //Ensures the program exits when the window is closed.
		this.setLocationRelativeTo(null); //Centers the window on the screen when it appears.
		this.us=us;
		
		
		//color control
	    color1=new Color(0,0,0); //blue
		color2=new Color(130,64,184);  //purple
		color3=new Color(255,255,255);//White 
		color4=new Color(250,250,250,0);//transparent 
		color5=new Color(92,64,51);//color for food name 
		color6=new Color(18,112,78); // deep green
		
		
		
		//Font Corntoll 
		
		myFont1=new Font("Calibri (Body)",Font.BOLD,15);
	    myFont2=new Font("Calibri (Body)",Font.BOLD,9);
	    //panel added 
		panel= new JPanel();  //Creates a new JPanel object.
		panel.setLayout(null); //Disables the layout manager, allowing manual positioning of components.
		                           //this.add() use for visibility 
								   
								   
								   
								   
        // Create checkboxes for food items


        imgSpaghetti = new ImageIcon("spaghetti.png");
        spaghetti = new JButton(imgSpaghetti);
		spaghetti.setBounds(17,50,129,132);
		spaghetti.setBackground(color6);
		spaghetti.addMouseListener(this);
		spaghetti.addActionListener(this);
		spaghetti.setOpaque(true);
		panel.add(spaghetti);
		
		imgPasta = new ImageIcon("pasta.png");
        pasta = new JButton(imgPasta);
		pasta.setBounds(156,50,129,132);
		pasta.setBackground(color6);
		pasta.addMouseListener(this);
		pasta.addActionListener(this);
		pasta.setOpaque(true);
		panel.add(pasta);
		
		imgMeatball = new ImageIcon("meatball.png");
        meatball = new JButton(imgMeatball);
		meatball.setBounds(295,50,129,132);
		meatball.addMouseListener(this);
		meatball.setBackground(color6);
		meatball.setOpaque(true);
		panel.add(meatball);

        imgSalad = new ImageIcon("salad.png");
        salad = new JButton(imgSalad);
		salad.setBounds(17,192,129,132);
		salad.addMouseListener(this);
		salad.addActionListener(this);
		salad.setBackground(color6);
		salad.setOpaque(true);
		panel.add(salad);
       
	    imgSteak = new ImageIcon("steak.png");
        steak = new JButton(imgSteak);
		steak.setBounds(156,192,129,132);
		steak.addMouseListener(this);
		steak.setBackground(color6);
		steak.setOpaque(true);
		panel.add(steak);
     
        imgChickenfried = new ImageIcon("chickenfried.png");
        chickenfried = new JButton(imgChickenfried);
		chickenfried.setBounds(295,192,129,132);
		chickenfried.addMouseListener(this);
		chickenfried.setBackground(color6);
		chickenfried.setOpaque(true);
		panel.add(chickenfried);
   
        imgBurger = new ImageIcon("burger.png");
        burger = new JButton(imgBurger);
		burger.setBounds(17,334,129,132);
		burger.addMouseListener(this);
		burger.setBackground(color6);
		burger.setOpaque(true);
		panel.add(burger);
       
	   
	    imgFriedrice = new ImageIcon("friedrice.png");
	    friedrice = new JButton(imgFriedrice);
		friedrice.setBounds(156,334,129,132);
		friedrice.addMouseListener(this);
		friedrice.setBackground(color6);
		friedrice.setOpaque(true);
		panel.add(friedrice);
  
        imgPancake = new ImageIcon("pancake.png");
        pancake = new JButton(imgPancake);
		pancake.setBounds(295,334,129,132);
		pancake.addMouseListener(this);
		pancake.setBackground(color6);
		pancake.setOpaque(true);
		panel.add(pancake);
        
        imgTacos = new ImageIcon("tacos.png");
        tacos = new JButton(imgTacos);
		tacos.setBounds(17,476,129,132);
		tacos.addMouseListener(this);
		tacos.setBackground(color6);
		tacos.setOpaque(true);
		panel.add(tacos);

        imgRicebowl = new ImageIcon("ricebowl.png");
        ricebowl = new JButton(imgRicebowl);
		ricebowl.setBounds(156,476,129,132);
		ricebowl.addMouseListener(this);
		ricebowl.setBackground(color6);
		ricebowl.setOpaque(true);
		panel.add(ricebowl);

        imgPizza = new ImageIcon("pizza.png");
        pizza = new JButton(imgPizza);
		pizza.setBounds(295,476,129,132);
		pizza.addMouseListener(this);
		pizza.addActionListener(this);
		pizza.setBackground(color6);
		pizza.setOpaque(true);
		panel.add(pizza);

         

        // Create a text field for special instructions
        // Create a calculate button
        //calculateButton = new JButton("Calculate Bill");
		
        

        
		
        imgCancelBtn = new ImageIcon("cancelBtn.png");
	    cancelBtn=new JButton(imgCancelBtn);
		cancelBtn.setBounds(0,0,40,40);
		//confirmBtn.setBackground();
		cancelBtn.addMouseListener(this);
		cancelBtn.addActionListener(this);
		panel.add(cancelBtn);
		
        
		confirmBtn=new JButton("Add food");
		
		confirmBtn.setBounds(320,0,120,40);
		confirmBtn.setBackground(Color.RED);
		confirmBtn.setForeground(Color.WHITE);
		confirmBtn.addMouseListener(this);
		confirmBtn.addActionListener(this);
		confirmBtn.setOpaque(true);
		panel.add(confirmBtn);
		
		
		
		img =new ImageIcon("Menu.png");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0,0,458,708);
		panel.add(imgLabel);

		                               //Adds the JPanel to the main window (JFrame), so it becomes part of the visible interface
        this.add(panel);
		this.setVisible(true);
		
       }
	   
	   
	   public void mouseClicked(MouseEvent me){
		   
           if (me.getSource() ==cancelBtn){
		          FristeFrame db = new FristeFrame(us);
					db.setVisible(true);
					this.setVisible(false);
		   }
		     else  if (me.getSource() ==confirmBtn){
		       JOptionPane.showMessageDialog(this, "ORDER CONFIRMD ");
				
				   
				   
				   
					/*selectedFood cd = new selectedFood();
					cd.setVisible(true);
					this.setVisible(false);*/
					
			
		   }
		   else if (me.getSource() ==spaghetti){
			    QuantityDialog ab = new QuantityDialog();  //user er us chilo 
					ab.setVisible(true);
					this.setVisible(false);
			   
		   }
		   
	   }


	public void  mousePressed(MouseEvent me){}
	public void  mouseReleased(MouseEvent me) {}
	public void  mouseEntered(MouseEvent me){
		if(me.getSource() ==cancelBtn){
			cancelBtn.setBackground(Color.WHITE);
			cancelBtn.setForeground(Color.RED);
			
		}else if (me.getSource()==confirmBtn){
			confirmBtn.setBackground(Color.WHITE);
			confirmBtn.setForeground(Color.RED);
		}
	}
	public void  mouseExited(MouseEvent me){
		if(me.getSource() ==cancelBtn){
			cancelBtn.setBackground(Color.RED);
			cancelBtn.setForeground(Color.WHITE);
			
		}else if (me.getSource()==confirmBtn){
			confirmBtn.setBackground(Color.RED);
			confirmBtn.setForeground(Color.WHITE);
		}
	}
     public void actionPerformed(ActionEvent ae){
		  int quantity=0;
		 String command =ae.getActionCommand();
		 if(spaghetti.getText().equals(command)){
		
		
		
		 
		 
		 
		 
		 
		// setSpaghettiValue()
		 }
		 
		 
	 }
	 
}
		
		         
			
		
				   


    







