package com.page.www;


import java.awt.EventQueue;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;

import Rail.Myproject;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField txtName;
	private JPasswordField txtPswd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(0,0, 650, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("RAILWAY RESERVATION ");
		lblNewLabel.setBounds(42, 11, 514, 33);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME");
		lblNewLabel_1.setBounds(59, 298, 168, 49);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(57, 367, 199, 42);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 25));
		frame.getContentPane().add(lblPassword);
		
		txtName = new JTextField();
		txtName.setBounds(237, 301, 149, 33);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBounds(42, 478, 114, 33);
		btnNewButton.setToolTipText("Login Page");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("deprecation")
				String Password = txtPswd.getText();
				String username = txtName.getText();
				
				if(username.contains("Rohit")&&Password.contains("Rohit84ya")) {
					txtPswd.setText(null);
					txtName.setText(null);
					frame.dispose();
					
					Myproject.main(null);
		
					
				}
					
					else {
						JOptionPane.showMessageDialog(null,"Invalid Detail","Login Error",JOptionPane.ERROR_MESSAGE);
					}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBounds(182, 478, 114, 33);
		btnReset.setToolTipText("Reset System");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText(null);
				txtPswd.setText(null);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBounds(332, 478, 114, 33);
		btnExit.setToolTipText("Exit System");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame=new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Ticket System",
				JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
				System.exit(0);
				}

			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(btnExit);
		
		txtPswd = new JPasswordField();
		txtPswd.setBounds(237, 367, 149, 33);
		frame.getContentPane().add(txtPswd);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(94, 67, 307, 180);
		Image img = new ImageIcon(this.getClass().getResource("/images.jpg")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img));
		frame.getContentPane().add(lblNewLabel_2);
	}
}

