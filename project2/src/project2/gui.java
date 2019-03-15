package project2;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class gui extends JFrame implements ActionListener  {
 
	
	private JPasswordField pass;
	private JTextField tf;
	
	MyATM obj=new MyATM();
	public gui() {
		super("ATM");
		setLayout(new FlowLayout());
		pass =new JPasswordField(3);
		add(pass);
		tf=new JTextField(25);
		tf.setText("enter password");
		add(tf);
		pass.addActionListener(this);
	}	
		
		public void actionPerformed(ActionEvent e) {
		    String s = pass.getText();
		    if(s.equals("123")) {
		    	tf.setText("valid");
		    	gui2 obj=new gui2();
		    	obj.setframevisible(true);
		    }
		    else {
		    	tf.setText("unvalid");
		    }
		    	
		    	
		    
	}
		
		
	
}