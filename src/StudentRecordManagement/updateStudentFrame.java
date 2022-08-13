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

public class updateStudentFrame extends Frame{
	Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18;
	TextField t1, t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15; 
	Button b;
	JFrame f;
	public updateStudentFrame(HashMap<String,String>hm) {
		final Label label = new Label();   
		      
		

		
	    l1 = new Label();
		l1.setText("Update Student Details");
	    l1.setBounds(70, 50, 500, 34);
	    l1.setFont(new Font(Font.DIALOG,Font.BOLD,30));
		add(l1);
	    
		l3 = new Label();
		l3.setText("Roll No : ");
		l3.setBounds(110, 120, 100, 20);
		l3.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(l3);
		
		t1 = new TextField();
		t1.setBounds(230, 120, 250, 24);
		t1.setText(hm.get("rNo"));
		add(t1);
		
		l4 = new Label();
		l4.setText("Name : ");
		l4.setBounds(110, 160, 100, 20);
		l4.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(l4);
		
		t2 = new TextField();
		t2.setBounds(230, 160, 250, 24);
		t2.setText(hm.get("name"));
		add(t2);
		
		l5 = new Label();
		l5.setText("class : ");
		l5.setBounds(110, 200, 100, 20);
		l5.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(l5);
		
		t3 = new TextField();
		t3.setBounds(230, 200, 250, 24);
		t3.setText(hm.get("cl"));
		add(t3);
		
		l6 = new Label();
		l6.setText("Section : ");
		l6.setBounds(110, 240, 100, 20);
		l6.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(l6);
		
		t4 = new TextField();
		t4.setBounds(230, 240, 250, 24);
		t4.setText(hm.get("section"));
		add(t4);
		
		l7 = new Label();
		l7.setText("Gender : ");
		l7.setBounds(110, 280, 100, 20);
		l7.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(l7);
		
		t5 = new TextField();
		t5.setBounds(230, 280, 250, 24);
		t5.setText(hm.get("gender"));
		add(t5);
		
		l8 = new Label();
		l8.setText("Mobile No : ");
		l8.setBounds(110, 320, 100, 20);
		l8.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(l8);
		
		t6 = new TextField();
		t6.setBounds(230, 320, 250, 24);
		t6.setText(hm.get("mbNo"));
		add(t6);
		
		l9 = new Label();
		l9.setText("City : ");
		l9.setBounds(110, 360, 100, 20);
		l9.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(l9);
		
		t7 = new TextField();
		t7.setBounds(230, 360, 250, 24);
		t7.setText(hm.get("city"));
		add(t7);
		
		l10 = new Label();
		l10.setText("PinCode : ");
		l10.setBounds(110, 400, 100, 20);
		l10.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(l10);
		
		t8 = new TextField();
		t8.setBounds(230, 400, 250, 24);
		t8.setText("445001");
		add(t8);
		
		l11 = new Label();
		l11.setText("State : ");
		l11.setBounds(110, 440, 100, 20);
		l11.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(l11);
		
		t9 = new TextField();
		t9.setBounds(230, 440, 250, 24);
		t9.setText(hm.get("state"));
		add(t9);
		
		l12 = new Label();
		l12.setText("Address : ");
		l12.setBounds(110, 480, 100, 20);
		l12.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(l12);
		
		t10 = new TextField();
		t10.setBounds(230, 480, 250, 24);
		t10.setText(hm.get("address"));
		add(t10);
		
		l13 = new Label();
		l13.setText("Course : ");
		l13.setBounds(110, 520, 100, 20);
		l13.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(l13);
		
		t11 = new TextField();
		t11.setBounds(230, 520, 250, 24);
		t11.setText(hm.get("course"));
		add(t11);
		
		l14 = new Label();
		l14.setText("Total Fees : ");
		l14.setBounds(110, 560, 100, 20);
		l14.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(l14);
		
		t12 = new TextField();
		t12.setBounds(230, 560, 250, 24);
		t12.setText(hm.get("tFees"));
		add(t12);
		
		l15 = new Label();
		l15.setText("Remaining Fees : ");
		l15.setBounds(110, 600, 100, 20);
		l15.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(l15);
		
		t13 = new TextField();
		t13.setBounds(230, 600, 250, 24);
		t13.setText(hm.get("rFees"));
		add(t13);
		
		l16 = new Label();
		l16.setText("Fees Paid : ");
		l16.setBounds(110, 640, 100, 20);
		l16.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(l16);
		
		t14 = new TextField();
		t14.setBounds(230, 640, 250, 24);
		t14.setText(hm.get("fPaid"));
		add(t14);
		
		l17 = new Label();
		l17.setText("Sports : ");
		l17.setBounds(110, 680, 100, 20);
		l17.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(l17);
		
		t15 = new TextField();
		t15.setBounds(230, 680, 250, 24);
		t15.setText(hm.get("sport"));
		add(t15);
		
//		 create instance of button with label  
	    b = new Button("Update");   
	    Button b2 = new Button("Back");
	    // set the position for the button in frame   
	    b.setBounds(360, 700, 100, 27); 
	    b2.setBounds(600, 53, 100, 27);
	    add(b);
	    add(b2);
	    
//	    Action Listener to update button
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Event");
				SqlConnection con = new SqlConnection();
				HashMap<String, String> m = getStudentData();
				f = new JFrame();
				JOptionPane.showMessageDialog(f, "Student with Roll No:- "+m.get("rNo")+" and Name:- "+m.get("name")+" updated successfully");
				
				con.updateStudent(m,Integer.parseInt(m.get("rNo")),m.get("name"));
			}
		});
		
	
//		Action Listner to back button
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
	public HashMap<String, String> getStudentData() {
		String rNo,name,cl,section,gender,mbNo,city,pin,state,address,course,tFees,rFees,fPaid,sport;
		HashMap<String, String> m = new HashMap<>();
		rNo= t1.getText();
		name = t2.getText();
		cl = t3.getText();
		section = t4.getText();
		gender = t5.getText();
		mbNo = t6.getText();
		
		city = t7.getText();
		pin = t8.getText();
		state = t9.getText();
		address = t10.getText();
		course = t11.getText();
		tFees = t12.getText();
		rFees = t13.getText();
		fPaid = t14.getText();
		sport = t15.getText();
		System.out.println(rNo+" "+name+" "+cl+" "+mbNo+" "+state);
		m.put("rNo", rNo);
		m.put("name", name);
		m.put("cl", cl);
		m.put("section", section);
		m.put("gender", gender);
		m.put("mbNo", mbNo);
		m.put("city", city);
		m.put("pin", pin);
		m.put("state", state);
		m.put("address", address);
		m.put("course", course);
		m.put("tFees", tFees);
		m.put("rFees", rFees);
		m.put("fPaid", fPaid);
		m.put("sport", sport);
		return m;
	}
	public static void main(String[] args) {
//		updateStudentFrame up = new updateStudentFrame();
	}
}
