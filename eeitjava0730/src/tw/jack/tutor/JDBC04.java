package tw.jack.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.x.protobuf.MysqlxExpr.Identifier;

public class JDBC04 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://127.0.0.1:3306/jack";
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		try(Connection conn = DriverManager.getConnection(url, "root", "root")) {
			String name = "Amy";
			String tel = "1234567";
			String birthday = "1997-05-08";
			int id = 2;
			String sql = "UPDATE cust SET name = ?, tel = ?, birthday = ? WHERE id = ?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			// index從1開始算
			pstmt.setString(1, name);
			pstmt.setString(2, tel);
			pstmt.setString(3, birthday);
			pstmt.setInt(4, id);
			
			pstmt.executeUpdate();
			System.out.println("OK");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
}