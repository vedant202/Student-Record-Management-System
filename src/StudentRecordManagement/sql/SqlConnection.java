package StudentRecordManagement.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import StudentRecordManagement.Student;

public class SqlConnection {
	
	public Connection sqlConnect() {
		try {
			String url="jdbc:mysql://localhost:3306/studentrecord";
			String user="root";
			String pass="aryan@222";
			
//			String query = "Select * from Student_Record";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user,pass);
			return con;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	public HashMap<String, Integer> searchFeeDetails(int rollNo,String name){
		HashMap<String, Integer> h = new HashMap<>();
		String query = "select * from student_record where(rollNo="+rollNo+" and name='"+name+"')";
		try {
			Connection con = sqlConnect();
			PreparedStatement st = con.prepareStatement(query);
			
//			st.setInt(1, rollNo);
//			st.setString(2,name);
			ResultSet rs = st.executeQuery();
			rs.next();
			System.out.println("Fee details "+rs.getString("remainingFess"));
			h.put("r_fees", Integer.parseInt(rs.getString("remainingFess")));
			h.put("p_fees", Integer.parseInt(rs.getString("feespaid")));
			h.put("t_fees", Integer.parseInt(rs.getString("totalFees")));
//			con.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return h;
		
	}
	
	public void deleteStudent(int rollNo,String name,String cl) {
		boolean isDel = false;
		try {
			Connection con = sqlConnect();
			PreparedStatement st;
			String query = "DELETE FROM student_record WHERE rollNo=? and name=? and class= ?";
			if(name.length()==0 || cl.length()==0) {
				String query1 = "DELETE FROM student_record WHERE rollNo=?";
				st = con.prepareStatement(query1);
				st.setInt(1, rollNo);
				st.executeUpdate();
			}
			else {
				st = con.prepareStatement(query);
				st.setInt(1, rollNo);
				st.setString(2, name);
				st.setString(3, cl);
				st.executeUpdate();
			}
			con.close();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
	
	public List<List<String>> allStdData() throws Exception{
		List<List<String>> arr = new ArrayList<>();
		
		Connection con = sqlConnect();
		String query = "Select * from Student_Record";
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
//			rs.getString("name"),rs.getString("class"),rs.getString("section"),rs.getString("gender"),
//			rs.getString("mobileNo"),rs.getString("city"),rs.getString("state"),rs.getString("Address"),rs.getString("course"),
//			rs.getString("totalFees"),rs.getString("feesPaid"),rs.getString("remainingFess"),rs.getString("sports"),rs.getInt("rollNo")
			ArrayList<String> d = new ArrayList<>();
			d.add(rs.getString("rollNo"));
			d.add(rs.getString("name"));
			d.add(rs.getString("class"));
			d.add(rs.getString("section"));
			d.add(rs.getString("gender"));
			d.add(rs.getString("mobileNo"));
			d.add(rs.getString("totalFees"));
			d.add(rs.getString("feesPaid"));
			d.add(rs.getString("remainingFess"));
			d.add(rs.getString("sports"));
			d.add(rs.getString("city"));
			d.add(rs.getString("state"));
			d.add(rs.getString("Address"));
			d.add(rs.getString("course"));
			arr.add(d);
			
		}
		rs.close();
		st.close();
		con.close();
		return arr;
	}
	
	public String updateStudent(HashMap<String, String> stud,int r,String n){
		
		String mes="";
		try {
			Connection con = sqlConnect();
		
//		String query = "Update Student_Record(rollNo,name,class,section,gender,mobileNo,city,state,Address,course,totalFees,feespaid,remainingFess,sports) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		String query = "Update Student_Record set rollNo=?,name=?,class=?,section=?,gender=?,mobileNo=?,city=?,state=?,Address=?,course=?,totalFees=?,feespaid=?,remainingFess=?,sports=? where rollNo="+r;
		
		
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, Integer.parseInt(stud.get("rNo")));
		System.out.println("Update mn no"+stud.get("mbno")+" fpaid "+stud.get("FPaid"));
		st.setString(2, stud.get("name"));
		st.setString(3, stud.get("cl"));
		st.setString(4, stud.get("section"));
		st.setString(5, stud.get("gender"));
		st.setString(6, stud.get("mbNo"));
		st.setString(7, stud.get("city"));
		st.setString(8, stud.get("state"));
		st.setString(9, stud.get("address"));
		st.setString(10, stud.get("course"));
		st.setString(11, stud.get("tFees"));
		st.setString(12, stud.get("fPaid"));
		st.setString(13, stud.get("rFees"));
		st.setString(14, stud.get("sport"));
		
		
		int count = st.executeUpdate();
		System.out.println("Rows "+ count+" is affected");
		if(count>=0) {
			mes= "Student Roll No :- " + stud.get("rno")+" Name:- "+stud.get("name")+" is updated";
					
		}
		con.close();
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
		mes = "Error";
	}
	return mes;
	}
	
	public HashMap<String, String> getStudent2(int rollNo,String name){
		HashMap<String,String> m = new HashMap<>();
		try {
			Connection con = sqlConnect();
			String query = "select * from Student_Record where(rollNo=? and name=?)";
			PreparedStatement st = con.prepareStatement(query);
			st.setInt(1, rollNo);
			st.setString(2, name);
			ResultSet rs = st.executeQuery();
			rs.next();
			m.put("rNo", Integer.toString(rs.getInt(2)));
			m.put("name", rs.getString(3));
			m.put("cl", rs.getString(4));
			m.put("section", rs.getString(5));
			m.put("gender", rs.getString(6));
			m.put("mbNo", rs.getString(7));
			m.put("city", rs.getString(8));
//			m.put("pin", pin);
			m.put("state", rs.getString(9));
			m.put("address", rs.getString(10));
			m.put("course", rs.getString(11));
			m.put("tFees", rs.getString(12));
			m.put("rFees", rs.getString(13));
			m.put("fPaid", rs.getString(14));
			m.put("sport", rs.getString(15));
			
			st.close();
			con.close();
			
		}
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return m;
	}
	
	public HashMap<String,String> getStudent(int rollNo,String name, String cl) {
		HashMap<String,String> m = new HashMap<>();
		try {
			Connection con = sqlConnect();
			String query = "select * from Student_Record where(rollNo=? and name=? and class=?)";
			PreparedStatement st = con.prepareStatement(query);
			st.setInt(1, rollNo);
			st.setString(2, name);
			st.setString(3, cl);
			ResultSet rs = st.executeQuery();
			rs.next();
			m.put("rNo", Integer.toString(rs.getInt(2)));
			m.put("name", rs.getString(3));
			m.put("cl", rs.getString(4));
			m.put("section", rs.getString(5));
			m.put("gender", rs.getString(6));
			m.put("mbNo", rs.getString(7));
			m.put("city", rs.getString(8));
//			m.put("pin", pin);
			m.put("state", rs.getString(9));
			m.put("address", rs.getString(10));
			m.put("course", rs.getString(11));
			m.put("tFees", rs.getString(12));
			m.put("rFees", rs.getString(13));
			m.put("fPaid", rs.getString(14));
			m.put("sport", rs.getString(15));
			st.close();
			con.close();
		}
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return m;
	}
	
	public String addStudentDB(HashMap<String, String> stud) {
		String mes="";
		try {
			Connection con = sqlConnect();
			String query = "Insert into Student_Record(rollNo,name,class,section,gender,mobileNo,city,state,Address,course,totalFees,feespaid,remainingFess,sports) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement st = con.prepareStatement(query);
			st.setInt(1, Integer.parseInt(stud.get("rNo")));

			st.setString(2, stud.get("name"));
			st.setString(3, stud.get("cl"));
			st.setString(4, stud.get("section"));
			st.setString(5, stud.get("gender"));
			st.setString(6, stud.get("mbNo"));
			st.setString(7, stud.get("city"));
			st.setString(8, stud.get("state"));
			st.setString(9, stud.get("address"));
			st.setString(10, stud.get("course"));
			st.setString(11, stud.get("tFees"));
			st.setString(12, stud.get("fPaid"));
			st.setString(13, stud.get("rFees"));
			st.setString(14, stud.get("sport"));
			int count = st.executeUpdate();
			System.out.println("Rows "+ count+" is affected");
			if(count>=0) {
				mes= "Student Roll No :- " + stud.get("rno")+" Name:- "+stud.get("name")+" is created";
						
			}
			st.close();
			con.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			mes = "Error";
		}
		return mes;
	}
	
	public ArrayList<Student> getAllStudents() {
		ArrayList<Student> arr = new ArrayList<>();
		
		try {
			Connection con = sqlConnect();
			String query = "Select * from Student_Record";
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
			
				Student std1 = new Student(rs.getString("name"),rs.getString("class"),rs.getString("section"),rs.getString("gender"),
						rs.getString("mobileNo"),rs.getString("city"),rs.getString("state"),rs.getString("Address"),rs.getString("course"),
						rs.getString("totalFees"),rs.getString("feesPaid"),rs.getString("remainingFess"),rs.getString("sports"),rs.getInt("rollNo"));
				
				arr.add(std1);
			}
			rs.close();
			con.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return arr;
		
	}
	public static void main(String[] args) throws Exception{

	}
}
