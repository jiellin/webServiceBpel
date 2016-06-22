//package ws.travel.spot;
//
//public class SpotGuideService {
//	public String spotGuide(String spot, boolean isNational) {
//		return "Zhang San";
//	}
//}


package ws.travel.spot;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SpotGuideService {
	class DbConn {
	private final String dbDriver = "com.mysql.jdbc.Driver";
	
	private final String dbUrl = "jdbc:mysql://127.0.0.1:3306/webServiceCourseDB?useUnicode=true&characterEncoding=utf8";
	private java.sql.Connection conn = null;
	public DbConn(){
		try {
			Class.forName(dbDriver);
			this.conn = DriverManager.getConnection(dbUrl, "root", "root");
			
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public java.sql.Connection getConn(){
		return conn;
	}
	public void closeConn(){
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
	public String spotGuide(String spot, boolean isNational) {
		String name = "guide No result";
		DbConn conn = new DbConn();
		Statement stmt;
			ResultSet rs = null;
			try {
				stmt = conn.getConn().createStatement();
				String sql = "select name from guide where spot = \'" + spot + "\' and isNational = \'" + ((isNational) ? "true":"false") + "\' order by spot desc limit 1";
//				System.out.println(sql);
				rs = stmt.executeQuery(sql);
				while(rs.next()){
					try{
						name = rs.getString("name");
					}catch(Exception e){
						continue;
					}
				}
				rs.close();
				conn.closeConn();
			} catch (SQLException e){
				e.printStackTrace();
			}finally {
			}
		return name;
	}
}

