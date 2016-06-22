//package ws.travel.hotel;
//
//public class BookHotelService {
//	public String bookHotel(String date, String city){
//		
//		return "Hilton";
//	}
//}


package ws.travel.hotel;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookHotelService {
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
	public String bookHotel(String date, String city){
		/*testOK
		 AcessDB acessDB = new AcessDB();
		System.out.println(acessDB.acessHotel("2016-06-01", "beijing"));
		 */
		String hotel = "hotel No result";
		DbConn conn = new DbConn();
		Statement stmt;
			ResultSet rs = null;
			try {
				stmt = conn.getConn().createStatement();
				String sql = "select hotel from webservicecoursedb.hotel where date = \'" +date + "\' and city = \'" + city + "\' order by date desc limit 1" ;
				rs = stmt.executeQuery(sql);
				while(rs.next()){
					try{
						hotel = rs.getString("hotel");
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
		return hotel;
	}
}
