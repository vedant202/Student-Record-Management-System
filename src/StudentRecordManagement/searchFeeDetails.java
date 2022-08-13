package StudentRecordManagement;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import StudentRecordManagement.sql.SqlConnection;

public class searchFeeDetails extends Frame{
	Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	TextField t1, t2,t3;
	JFrame f;
	
	public searchFeeDetails() {
		l1 = new Label();
		l1.setText("Search Fee Details");
//		l1.setSize(100,300);
	    l1.setBounds(70, 80, 600, 34);
	    l1.setFont(new Font(Font.DIALOG,Font.BOLD,30));
		add(l1);
		
//		l6 = new Label();
//		l6.setText("Enter roll no or enter all details");
//		l6.setBounds(80, 110, 200, 20);
//		l6.setFont(new Font(Font.DIALOG,Font.PLAIN,11));
//		add(l6);
		
		l3 = new Label();
		l3.setText("Roll No : ");
		l3.setBounds(110, 200, 100, 20);
		l3.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(l3);
		
		t1 = new TextField();
		t1.setBounds(230, 200, 250, 24);
		add(t1);
		
		l4 = new Label();
		l4.setText("Name : ");
		l4.setBounds(110, 240, 100, 20);
		l4.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(l4);
		
		t2 = new TextField();
		t2.setBounds(230, 240, 250, 24);
		add(t2);
		
		
		Button b = new Button("Fee Details");   
		  
	    // set the position for the button in frame   
	    b.setBounds(330, 330, 100, 27); 
	    
	    add(b);
	    
	    Button b2 = new Button("Back");   
		  
	    // set the position for the button in frame   
	    b2.setBounds(480, 330, 100, 27); 
	    
	    add(b2);
		
	    
	    b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					SqlConnection sqlCon = new SqlConnection();
					int rNo;
					String name,cl;
					rNo = Integer.parseInt(t1.getText());
					name = t2.getText();
					System.out.println("r no: "+rNo+" name :"+name);
					f = new JFrame();
					HashMap<String,Integer> hm = sqlCon.searchFeeDetails(rNo,name);
					l5 = new Label();
					l5.setText("Total Fees : ");
					l5.setBounds(110, 380, 100, 20);
					l5.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
					add(l5);
					
					l6 = new Label();
					l6.setText(hm.get("t_fees").toString());
					l6.setBounds(340, 380, 100, 20);
					l6.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
					add(l6);
					
					l7 = new Label();
					l7.setText("Remaining Fees");
					l7.setBounds(110, 420, 100, 20);
					l7.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
					add(l7);
					
					l8 = new Label();
					l8.setText(hm.get("r_fees").toString());
					l8.setBounds(340, 420, 100, 20);
					l8.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
					add(l8);
					
					l9 = new Label();
					l9.setText("Paid Fees");
					l9.setBounds(110, 460, 100, 20);
					l9.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
					add(l9);
					
					l10 = new Label();
					l10.setText(hm.get("p_fees").toString());
					l10.setBounds(340, 460, 100, 20);
					l10.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
					add(l10);
					
//					JOptionPane.showMessageDialog(f, "Student with Roll No:- "+rNo+" and Name:- "+name+" deleted successfully");
				} catch (Exception e2) {
					// TODO: handle exception
					System.out.println(e2.getMessage());
				}
			}
		});
		
	    b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
				StudentRecordManagement st = new StudentRecordManagement();
				
			}
		});
	    
		setSize(800, 700);
		setTitle("Student Record Management System");
		setLayout(null);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				dispose();
			}
		});
		setVisible(true);
	}
	
}
