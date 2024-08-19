package tw.jack.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class JDBC01 {

	public static void main(String[] args) {
		// 載入驅動程式 Load Driver (Connector)
		// BUT, ....
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("OK");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
			throw new RuntimeException();
		}
		// 問號隔開參數
		// jdbc:mysql://主機:埠/庫 ?參數列
		// 第一種連線寫法
		String url = "jdbc:mysql://127.0.0.1:3306/jack?user=root&password=root";
		try(Connection conn = DriverManager.getConnection(url)) {
			System.out.println("OK2");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		// 第二種連線寫法
		String url2 = "jdbc:mysql://127.0.0.1:3306/jack";
		try(Connection conn = DriverManager.getConnection(url2, "root", "root")) {
			System.out.println("OK3");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		// 第三種連線寫法彈性較大
		String url3 = "jdbc:mysql://127.0.0.1:3306/jack";
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		try(Connection conn = DriverManager.getConnection(url2, "root", "root")) {
//			System.out.println("OK4");
			Statement stmt =  conn.createStatement();
			String sql = "INSERT INTO cust (name,tel,birthday) VALUES ('Jack','123','1999-01-02')";
			sql += ", ('Spencer','222','1999-01-02')";
			sql += ", ('Shawn','333','1999-01-02')";
			int n = stmt.executeUpdate(sql);
			System.out.println(n);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
	}
}