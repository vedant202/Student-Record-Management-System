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

public class GetStudentFrame extends Frame{
	private HashMap<String, String> m;
	Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18;
	Label t1, t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15;
	public GetStudentFrame(HashMap<String, String> hm){
		this.m = hm;
		
		
		l3 = new Label();
		l3.setText("Roll No : ");
		l3.setBounds(110, 40, 100, 20);
		l3.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(l3);
		
		t1 = new Label();
		t1.setText(m.get("rNo"));
		t1.setBounds(230, 40, 250, 24);
		t1.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(t1);
		
		l4 = new Label();
		l4.setText("Name : ");
		l4.setBounds(110, 80, 100, 20);
		l4.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(l4);
		
		t2 = new Label();
		t2.setText(m.get("name"));
		t2.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		t2.setBounds(230, 80, 250, 24);
		add(t2);
		
		l5 = new Label();
		l5.setText("class : ");
		l5.setBounds(110, 120, 100, 20);
		l5.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(l5);
		
		t3 = new Label();
		t3.setText(m.get("cl"));
		t3.setBounds(230, 120, 250, 24);
		t3.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(t3);
		
		l6 = new Label();
		l6.setText("Section : ");
		l6.setBounds(110, 160, 100, 20);
		l6.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(l6);
		
		t4 = new Label();
		t4.setText(m.get("section"));
		t4.setBounds(230, 160, 250, 24);
		t4.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(t4);
		
		l7 = new Label();
		l7.setText("Gender : ");
		l7.setBounds(110, 200, 100, 20);
		l7.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(l7);
		
		t5 = new Label();
		t5.setText(m.get("gender"));
		t5.setBounds(230, 200, 250, 24);
		t5.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(t5);
		
		l8 = new Label();
		l8.setText("Mobile No : ");
		l8.setBounds(110, 240, 100, 20);
		l8.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(l8);
		
		t6 = new Label();
		t6.setText(m.get("mbNo"));
		t6.setBounds(230, 240, 250, 24);
		t6.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(t6);
		
		l9 = new Label();
		l9.setText("City : ");
		l9.setBounds(110, 280, 100, 20);
		l9.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(l9);
		
		t7 = new Label();
		t7.setText(m.get("city"));
		t7.setBounds(230, 280, 250, 24);
		t7.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(t7);
		
		l11 = new Label();
		l11.setText("State : ");
		l11.setBounds(110, 320, 100, 20);
		l11.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(l11);
		
		t9 = new Label();
		t9.setText(m.get("state"));
		t9.setBounds(230, 320, 250, 24);
		t9.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(t9);
		
		l12 = new Label();
		l12.setText("Address : ");
		l12.setBounds(110, 360, 100, 20);
		l12.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(l12);
		
		t10 = new Label();
		t10.setText(m.get("address"));
		t10.setBounds(230, 360, 250, 24);
		t10.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(t10);
		
		l13 = new Label();
		l13.setText("Course : ");
		l13.setBounds(110, 400, 100, 20);
		l13.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(l13);
		
		t11 = new Label();
		t11.setText(m.get("course"));
		t11.setBounds(230, 400, 250, 24);
		t11.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(t11);
		
		l14 = new Label();
		l14.setText("Total Fees : ");
		l14.setBounds(110, 440, 100, 20);
		l14.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(l14);
		
		t12 = new Label();
		t12.setText(m.get("tFees"));
		t12.setBounds(230, 440, 250, 24);
		t12.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(t12);
		
		l15 = new Label();
		l15.setText("Remaining Fees : ");
		l15.setBounds(110, 480, 100, 20);
		l15.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(l15);
		
		t13 = new Label();
		t13.setText(m.get("rFees"));
		t13.setBounds(230, 480, 250, 24);
		t13.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(t13);
		
		l16 = new Label();
		l16.setText("Fees Paid : ");
		l16.setBounds(110, 520, 100, 20);
		l16.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(l16);
		
		t14 = new Label();
		t14.setText(m.get("fPaid"));
		t14.setBounds(230, 520, 250, 24);
		t14.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(t14);
		
		l17 = new Label();
		l17.setText("Sports : ");
		l17.setBounds(110, 560, 100, 20);
		l17.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(l17);
		
		t15 = new Label();
		t15.setText(m.get("sport"));
		t15.setBounds(230, 560, 250, 24);
		t15.setFont(new Font(Font.DIALOG,Font.PLAIN,19));
		add(t15);
		
		Button b = new Button("Back");
		
		b.setBounds(330, 600, 100, 27);
		add(b);
		
		setSize(800, 700);
		setTitle("Student Record Management System");
		setLayout(null);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
				StudentRecordManagement st = new StudentRecordManagement();
				
			}
		});
		
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
