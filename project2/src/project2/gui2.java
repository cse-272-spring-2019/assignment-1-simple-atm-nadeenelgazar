package project2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class gui2 implements ActionListener{
	private JButton currentBalance;
	private JButton deposit;
	private JButton withdraw;
	private JButton previous;
	private JButton next;
	private JLabel label;
	private JTextField tf;
	MyATM obj=new MyATM();


		public void setframevisible(boolean visible) {
			if(visible==true) {
		//frame
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		panel.setLayout(new FlowLayout());
		frame.setVisible(true);
		frame.setBounds(500, 500, 500, 500);
		//buttons
		currentBalance=new JButton("current balance");
		frame.add(currentBalance);
		panel.add(currentBalance);
		deposit=new JButton("deposit");
		frame.add(deposit);
		panel.add(deposit);
		withdraw=new JButton("withdraw");
		frame.add(withdraw);
		panel.add(withdraw);
		frame.setContentPane(panel);
		previous=new JButton("previous");
		frame.add(previous);
		panel.add(previous);
		next=new JButton("next");
		frame.add(next);
		panel.add(next);
		currentBalance.addActionListener(this);
		deposit.addActionListener(this);
		withdraw.addActionListener(this);
		previous.addActionListener(this);
		next.addActionListener(this);
		//label
		label=new JLabel();
		frame.add(label);
		panel.add(label);
		//textfield
		tf=new JTextField(15);
		frame.add(tf);
		panel.add(tf);

		tf.addActionListener(this);
		


			}
		}
		public void actionPerformed(ActionEvent e) {
			String amount;
			if(e.getSource()==currentBalance)
				{
				label.setText(obj.getCurrentBalance());
				}

			else if (e.getSource()==deposit) {
				
				amount=tf.getText();
				 e.getSource();
		        System.out.println(amount);
		        obj.deposit(amount);
	        	label.setText(amount+"is successfuly deposited");

		        System.out.println(obj.getCurrentBalance());
			}
			else if (e.getSource()==withdraw) {
				
				amount=tf.getText();
		        e.getSource();
		        System.out.println(amount);
		        int y=Integer.parseInt(amount);
		        int x=Integer.parseInt(obj.getCurrentBalance());
		        if(y>x)
		        {
		        	label.setText("error:not enough balance");
		        }
		        else {
		        	obj.withdraw(amount);
		        	label.setText(amount+"is successfuly withdrawed");
		        }
		        
		        System.out.println(obj.getCurrentBalance());
			}
			else if (e.getSource()==next) {

				label.setText(obj.next());
			}
			else if (e.getSource()==previous) {
				label.setText(obj.prev());
				
			}
			
		}
		

}


