//package ws.travel.car;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//public class BookCarService {
//	public String bookCar(String size, boolean isAT, String cityBook, String cityBack){
//		
//		return "China Auto Rental";
//	}
//}

package ws.travel.car;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookCarService {
	class DbConn {
		private final String dbDriver = "com.mysql.jdbc.Driver";

		private final String dbUrl = "jdbc:mysql://127.0.0.1:3306/webServiceCourseDB?useUnicode=true&characterEncoding=utf8";
		private java.sql.Connection conn = null;

		public DbConn() {
			try {
				Class.forName(dbDriver);
				this.conn = DriverManager.getConnection(dbUrl, "root", "root");

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		public java.sql.Connection getConn() {
			return conn;
		}

		public void closeConn() {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public String bookCar(String size, boolean isAT, String cityBook, String cityBack) {
		String company = "car No result";
		DbConn conn = new DbConn();
		Statement stmt;
		ResultSet rs = null;
		try {
			stmt = conn.getConn().createStatement();
			String sql = "select company from webservicecoursedb.car where size = \'" + size + "\' and isAT = \'"
					+ ((isAT) ? "true" : "false") + "\' and cityBook = \'" + cityBook + "\' and cityBack = \'"
					+ cityBack + "\' order by size desc limit 1";
//			System.out.println(sql);
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				try {
					company = rs.getString("company");
				} catch (Exception e) {
					continue;
				}
			}
			rs.close();
			conn.closeConn();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
		}
		return company;

	}

}
