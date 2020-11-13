package aSimulator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class Deposit extends JFrame implements ActionListener{
    
    JTextField t1,t2;
    JButton b1,b2,b3;
    JLabel l1,l2,l3;
    
    Deposit(){
    	getContentPane().setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
    	setBackground(new Color(240, 248, 255));
        
        setFont(new Font("Tempus Sans ITC", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("DEPOSIT");
        int y = fm.stringWidth(" ");
        int z = getWidth() - (5*x);
        int w = z/y;
        String pad ="";
        //for (int i=0; i!=w; i++) pad +=" ";   
        pad = String.format("%"+w+"s", pad);
        setTitle(pad+"DEPOSIT");
        
        
        l1 = new JLabel("ENTER AMOUNT YOU WANT");
        l1.setBounds(144, 73, 562, 60);
        l1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 35));
        
        l2 = new JLabel("TO DEPOSIT");
        l2.setBounds(277, 144, 300, 60);
        l2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 35));
        
        l3 = new JLabel("Enter Pin");
        l3.setBounds(580, 9, 80, 30);
        l3.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
        
        t1 = new JTextField();
        t1.setBounds(221, 215, 333, 50);
        t1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 22));
        
        t2 = new JTextField();
        t2.setBounds(660, 10, 80, 30);
        t2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
        
        b1 = new JButton("DEPOSIT");
        b1.setBounds(244, 317, 125, 50);
        b1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
    
        b2 = new JButton("BACK");
        b2.setBounds(417, 317, 125, 50);
        b2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        b3 = new JButton("EXIT");
        b3.setBounds(297, 434, 200, 50);
        b3.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        getContentPane().setLayout(null);
        getContentPane().add(l3);
        getContentPane().add(t2);
        getContentPane().add(l1);
        getContentPane().add(l2);
        getContentPane().add(t1);
        getContentPane().add(b1);
        getContentPane().add(b2);
        getContentPane().add(b3);
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        getContentPane().setBackground(new Color(240, 248, 255));
        
        setSize(800,600);
        setLocation(500,90);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
       
        try{        
           
            String a = t1.getText();
            String b = t2.getText();
            
            
            
            
            if(ae.getSource()==b1){
            	 
                if(t1.getText().equals("")||t2.getText().equals("")){
                    
                    JOptionPane.showMessageDialog(null, "Please fill all the required fields");
                
                }else{
                    
                    Conn c1 = new Conn();
                    
                   
                    
                    String q1= "insert into bank values('"+b+"','"+a+"',null,'"+a+"')";
                    c1.s.executeUpdate(q1);
                    
                   
                    JOptionPane.showMessageDialog(null, "Rs. "+a+" Deposited Successfully");
                    
                    new Transactions().setVisible(true);
                    setVisible(false);
                    
                        
                    
                    
                    
                   
                    
                    
                    
                }
                
            }else if(ae.getSource()==b2){
                
                new Transactions().setVisible(true);
                setVisible(false);
                
            }else if(ae.getSource()==b3){
                
                System.exit(0);
                
            }
        }catch(Exception e){
                e.printStackTrace();
                System.out.println("error: "+e);
        }
            
    }
    
    public static void main(String[] args){
        new Deposit().setVisible(true);
    }

    
}