package aSimulator;
import java.util.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Signup extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
    
	Random ran=new Random();
	long first4=(ran.nextLong()%9000L)+1000L;
	long first=Math.abs(first4);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup frame = new Signup();
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
	public Signup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 919, 643);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("APPLICATION FORM NO."+first);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 33));
		lblNewLabel.setBounds(178, 38, 577, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Page 1: Personal Details");
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		lblNewLabel_1.setBounds(276, 84, 251, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name:");
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_2.setBounds(40, 132, 88, 27);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(301, 137, 429, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Father's Name:");
		lblNewLabel_3.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_3.setBounds(40, 178, 132, 20);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(301, 180, 429, 27);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Date of Birth:");
		lblNewLabel_4.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_4.setBounds(40, 222, 132, 20);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Date");
		lblNewLabel_5.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblNewLabel_5.setBounds(301, 227, 49, 14);
		contentPane.add(lblNewLabel_5);
		
		String date[]= {"1","2","3","4","5","6","7","8","9","0"};
		JComboBox comboBox = new JComboBox(date);
		comboBox.setBounds(332, 223, 56, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_6 = new JLabel("Month");
		lblNewLabel_6.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblNewLabel_6.setBounds(406, 226, 56, 14);
		contentPane.add(lblNewLabel_6);
		
		String months[]= {"January","February","March","April","May","June","July","August","September","October","November","December"};
		JComboBox comboBox_1 = new JComboBox(months);
		comboBox_1.setBounds(456, 223, 146, 22);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_7 = new JLabel("Year");
		lblNewLabel_7.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblNewLabel_7.setBounds(611, 226, 39, 14);
		contentPane.add(lblNewLabel_7);
		
		String year[]= {"1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2011","2012","2015","2016","2018","2019","2020"};
		JComboBox comboBox_2 = new JComboBox(year);
		comboBox_2.setBounds(642, 223, 88, 22);
		contentPane.add(comboBox_2);
		
		JLabel lblNewLabel_8 = new JLabel("Gender:");
		lblNewLabel_8.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_8.setBounds(40, 267, 88, 14);
		contentPane.add(lblNewLabel_8);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBackground(new Color(240, 248, 255));
		rdbtnNewRadioButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		rdbtnNewRadioButton.setBounds(301, 265, 111, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setBackground(new Color(240, 248, 255));
		rdbtnNewRadioButton_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		rdbtnNewRadioButton_1.setBounds(456, 265, 111, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_9 = new JLabel("Email Address:");
		lblNewLabel_9.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_9.setBounds(40, 303, 137, 20);
		contentPane.add(lblNewLabel_9);
		
		textField_2 = new JTextField();
		textField_2.setBounds(301, 305, 429, 27);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Marital Status:");
		lblNewLabel_10.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_10.setBounds(40, 346, 146, 20);
		contentPane.add(lblNewLabel_10);
		
		table = new JTable();
		table.setBounds(113, 547, 1, 1);
		contentPane.add(table);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Married");
		rdbtnNewRadioButton_2.setBackground(new Color(240, 248, 255));
		rdbtnNewRadioButton_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		rdbtnNewRadioButton_2.setBounds(301, 347, 111, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Unmarried");
		rdbtnNewRadioButton_3.setBackground(new Color(240, 248, 255));
		rdbtnNewRadioButton_3.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		rdbtnNewRadioButton_3.setBounds(456, 347, 111, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Other");
		rdbtnNewRadioButton_4.setBackground(new Color(240, 248, 255));
		rdbtnNewRadioButton_4.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		rdbtnNewRadioButton_4.setBounds(642, 347, 88, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		
		JLabel lblNewLabel_11 = new JLabel("Address:");
		lblNewLabel_11.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_11.setBounds(40, 389, 111, 27);
		contentPane.add(lblNewLabel_11);
		
		textField_3 = new JTextField();
		textField_3.setBounds(301, 394, 429, 27);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("City:");
		lblNewLabel_12.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_12.setBounds(40, 439, 74, 20);
		contentPane.add(lblNewLabel_12);
		
		textField_4 = new JTextField();
		textField_4.setBounds(301, 441, 429, 27);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Pincode:");
		lblNewLabel_13.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_13.setBounds(40, 488, 96, 20);
		contentPane.add(lblNewLabel_13);
		
		textField_5 = new JTextField();
		textField_5.setBounds(301, 487, 429, 27);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("State:");
		lblNewLabel_14.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_14.setBounds(40, 534, 65, 14);
		contentPane.add(lblNewLabel_14);
		
		textField_6 = new JTextField();
		textField_6.setBounds(301, 528, 429, 27);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String a=textField.getText();
				String b=textField_1.getText();
				
				String ac=(String)comboBox.getSelectedItem();
				String bc=(String)comboBox_1.getSelectedItem();
				String cc=(String)comboBox_2.getSelectedItem();
				
				String d=null;
				if(rdbtnNewRadioButton.isSelected()) {
					d="Male";
				}
				else if(rdbtnNewRadioButton_1.isSelected()) {
					d="Female";
				}
				 String e=textField_2.getText();
				 String f=null;
				 if(rdbtnNewRadioButton_2.isSelected()) {
					 f="Married";
				 }else if(rdbtnNewRadioButton_3.isSelected()) {
					 f="Unmarried";
				 }else if(rdbtnNewRadioButton_4.isSelected()) {
					 f="Other";
				 }
				 
				 String g=textField_3.getText();
				 String h=textField_4.getText();
				 String i=textField_5.getText();
				 String j=textField_6.getText();
				 
				 try {
					 if(textField.getText().equals("")||textField_1.getText().equals("")||textField_3.getText().equals("")||textField_4.getText().equals("")||textField_5.getText().equals("")||textField_6.getText().equals("")) {
						 JOptionPane.showMessageDialog(null, "Fill all the required fields");
					 }
					 else {
					 Conn c1=new Conn();
					 String q1="insert into signup0 values('"+a+"','"+b+"','"+ac+"','"+bc+"','"+cc+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"','"+first+"')";
					 
					 c1.s.executeUpdate(q1);
					 new Signup2().setVisible(true);
					 setVisible(false);
					 }
				 }
				 catch(Exception ex) {
				 ex.printStackTrace();}
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 18));
		btnNewButton.setBounds(642, 572, 89, 23);
		contentPane.add(btnNewButton);
	}
}
