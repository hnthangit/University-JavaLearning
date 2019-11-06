package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DungChung {
	public static Connection cn;

	public void KetNoi() {
		try {
			// b1:nap database driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("Da xac dinh HQTCSDL");
			// b2: ket noi vao csdl: QlSach, user: sa, pass: 123
			String dburl = "jdbc:sqlserver://DESKTOP-G8FN8CR\\SQLEXPRESS:1433;databaseName=QlSach;user=sa; password=123";
			cn = DriverManager.getConnection(dburl);
			System.out.println("Da ket noi");

		} catch (Exception tt) {
			tt.printStackTrace();
			System.out.println(tt.getMessage());
			// TODO: handle exception
		}
	}
}
