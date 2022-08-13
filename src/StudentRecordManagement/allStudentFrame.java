package StudentRecordManagement;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import StudentRecordManagement.sql.SqlConnection;
import StudentRecordManagement.Student;
public class allStudentFrame extends Frame{
	
	public allStudentFrame()  {
		Panel panel=new Panel(); 
		Panel panel2=new Panel();
		Label l1 =null,l2=null,l3=null,l4=null,l5=null,l6=null,l7=null,l8=null,l9=null,l10=null,
				l11=null,l12=null,l13=null,l14=null;
		SqlConnection sqlConnect = new SqlConnection();
		ArrayList<Student> arr = sqlConnect.getAllStudents();
		
		Label rn=null,n=null,cl=null,sec=null,gen=null,mn=null,cit=null,state=null,add=null,cou=null,
				tf=null,rm=null,fp=null,sp=null;
		rn = new Label("RollNo");
		rn.setBounds(10, 0, 200, 60);
		n = new Label("Name");
		n.setBounds(10, 0, 200, 60);
		cl = new Label("Class");
		setBounds(10, 0, 150, 60);
		sec = new Label("Section");
		gen = new Label("Gender");
		mn = new Label("MobileNo");
		cit = new Label("City");
		state = new Label("State");
		add = new Label("Address");
		cou = new Label("Course");
		tf = new Label("Total Fees");
		rm = new Label("Remaining Fees");
		fp = new Label("Fees Paid");
		sp = new Label("Sport");
		panel.add(rn);
		panel.add(n);
		panel.add(cl);
		panel.add(sec);
		panel.add(gen);
		panel.add(mn);
		panel.add(cit);
		panel.add(state);
		panel.add(add);
		panel.add(cou);
		panel.add(tf);
		panel.add(rm);
		panel.add(fp);
		panel.add(sp);
		panel.setBounds(10,0,1500,100);
		panel.setLayout(new GridLayout(1,14));
		add(panel);
		int row=1;
		
		for(Student i:arr) {
			System.out.println(i.getName());
			l1 = new Label();
            l1.setText(Integer.toString(i.getRollNo()));
            
            l2 = new Label();
            l2.setText(i.getName());
            
            l3 = new Label();
            l3.setText(i.getCl());
            
            l4 = new Label();
            l4.setText(i.getSection());
            
            
            l5 = new Label();
            l5.setText(i.getGender());
            
            l6 = new Label();
            l6.setText(i.getMobileNo());
            
            l7 = new Label();
            l7.setText(i.getCity());
            
            l8 = new Label();
            l8.setText(i.getState());
            
            l9 = new Label();
            l9.setText(i.getAddress());
            
            l10 = new Label();
            l10.setText(i.getCourse());
            
            l11 = new Label();
            l11.setText(i.getTotalFees());
            
            l12 = new Label();
            l12.setText(i.getRemaiingFees());
            
            l13 = new Label();
            l13.setText(i.getFeesPaid());
            
            l14 = new Label();
            l14.setText(i.getSports());
            
            panel2.add(l1);
            panel2.add(l2);
            panel2.add(l3);
            panel2.add(l4);
            panel2.add(l5);
            
            panel2.add(l6);
            panel2.add(l7);
            panel2.add(l8);
            panel2.add(l9);
            panel2.add(l10);
            panel2.add(l11);
            panel2.add(l12);
            panel2.add(l13);
            panel2.add(l14);
            
            
            panel2.setLayout(new GridLayout(row,14));
            row++;
		}
		panel2.setBounds(10,100,1500,100);
		
        add(panel2);
        
		Color c = new Color(241, 216, 252);
		
		Button b = new Button("Back");
		b.setBounds(660, 660, 100, 27);
		add(b);
		
		b.addActionListener(new ActionListener() {
			
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
	public static void main(String[] args) {
	}
}
