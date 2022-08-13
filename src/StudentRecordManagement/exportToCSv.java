package StudentRecordManagement;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

import StudentRecordManagement.sql.SqlConnection;

public class exportToCSv {
	SqlConnection sqlConnection = null;
	
	public void addData() throws Exception {
		sqlConnection = new SqlConnection();
		CSVWriter write = new CSVWriter(new FileWriter("studentsCsvData//data.csv"));
		String[] set = {"rollNo","name","class","section","gender","mobileNo","city","state","Address","course","totalFees","feespaid","remainingFess","sports"};
		write.writeNext(set);
		List<List<String>> arr =sqlConnection.allStdData();
		arr.forEach(s->{
			String[] strarray = s.toArray(new String[0]);
			write.writeNext(strarray);
		});
		write.flush();
	}
	public static void main(String[] args) throws Exception {
		exportToCSv e = new exportToCSv();
		e.addData();
		
	}
}
