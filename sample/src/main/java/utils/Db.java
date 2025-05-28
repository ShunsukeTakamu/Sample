package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.NamingException;

public class Db {
	
	public static Connection open() throws SQLException, NamingException {
	    Connection con = null;
	    try {
	        con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/sample2", "root", "root");
	        System.out.println("データベース接続成功");
	    } catch (SQLException e) {
	        System.out.println("データベース接続失敗: " + e.getMessage());
	        throw e;
	    }
	    return con;
	}


	public static void close(Connection c) throws SQLException {
		if (c != null) {
			try {
				c.close();
			} catch (SQLException e) {
				System.out.println("接続のクローズに失敗しました: " + e.getMessage());
				e.printStackTrace();  // 詳細なスタックトレースを表示
				throw e;
			}
		}
	}
}
