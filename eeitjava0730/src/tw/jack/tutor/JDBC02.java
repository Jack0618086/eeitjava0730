package tw.jack.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class JDBC02 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://127.0.0.1:3306/jack";
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		try(Connection conn = DriverManager.getConnection(url, "root", "root")) {

			Statement stmt =  conn.createStatement();
			String sql = "DELETE FROM cust WHERE id = 3"; // 把id3刪除
			int n = stmt.executeUpdate(sql);
			System.out.println(n);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
}