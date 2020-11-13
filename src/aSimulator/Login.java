package aSimulator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.event.ActionEvent;

public class Login extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 692, 508);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 245, 238));
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.setForeground(new Color(255, 245, 238));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO ATM");
		lblNewLabel.setForeground(new Color(0, 0, 139));
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 32));
		lblNewLabel.setBounds(225, 24, 241, 72);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CARD NO:");
		lblNewLabel_1.setFont(new Font("Yu Gothic", Font.BOLD, 24));
		lblNewLabel_1.setBounds(95, 126, 154, 36);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PIN:");
		lblNewLabel_2.setFont(new Font("Yu Gothic", Font.BOLD, 24));
		lblNewLabel_2.setBounds(89, 191, 107, 36);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 0, 0));
		textField.setBounds(269, 116, 248, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(269, 192, 248, 30);
		contentPane.add(passwordField);
		
		 btnNewButton = new JButton("SIGN IN");
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(UIManager.getColor("Button.highlight"));
		btnNewButton.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setBounds(270, 271, 115, 36);
		contentPane.add(btnNewButton);
		
		 btnNewButton_1 = new JButton("SIGN UP");
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setForeground(UIManager.getColor("Button.highlight"));
		btnNewButton_1.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_1.setBounds(409, 271, 108, 36);
		contentPane.add(btnNewButton_1);
		
		 btnNewButton_2 = new JButton("CLEAR");
		btnNewButton_2.setForeground(UIManager.getColor("Button.highlight"));
		btnNewButton_2.setBackground(new Color(0, 0, 0));
		btnNewButton_2.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_2.setBounds(269, 330, 250, 30);
		contentPane.add(btnNewButton_2);
		
		btnNewButton.addActionListener(this);
		btnNewButton_1.addActionListener(this);
		btnNewButton_2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		try {
			Conn c1=new Conn();
			String a=textField.getText();
			String b=passwordField.getText();
			String q="select * from login where cardno = '"+a+"' and pin = '"+b+"'";
			ResultSet rs=c1.s.executeQuery(q);
			if(ae.getSource()==btnNewButton) {
				if(rs.next()) {
					new Transactions().setVisible(true);
					setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(null, "Incorrect Card Number or Password");
					textField.setText("");
					passwordField.setText("");
				}
			}
			else if(ae.getSource()==btnNewButton_1) {
				new Signup().setVisible(true);
				setVisible(false);
			}
			else if(ae.getSource()==btnNewButton_2) {
				textField.setText("");
				passwordField.setText("");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("error: "+e);
		}
	}
	
}
