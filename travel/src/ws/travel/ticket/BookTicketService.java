//package ws.travel.ticket;
//
//public class BookTicketService {
//	public String bookTicket(String date, String cityFrom, String cityTo){
//		
//		return "air China";
//	}
//}

package ws.travel.ticket;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookTicketService {
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
	public String bookTicket(String date, String cityFrom, String cityTo){
		/*testOK
		 * AcessTicket acessDB = new AcessTicket();
		 * System.out.println(acessDB.acessTicket("2016-06-01", "fuyang", "beijing"));
		 */
		String airline = "Ticket No result";
		DbConn conn = new DbConn();
		Statement stmt;
			ResultSet rs = null;
			try {
				stmt = conn.getConn().createStatement();
//				rs = stmt.executeQuery("select airline from ticket where cityTo = 'beijing' order by date desc limit 1");// order by insert_time desc limit 10
				String sql = "select airline from ticket where date = \'" +date + "\' and cityFrom = '" + cityFrom + "' and cityTo = '" + cityTo + "' order by date desc limit 1";
//				System.out.println(sql);
				rs = stmt.executeQuery(sql);
				while(rs.next()){
					try{
					airline = rs.getString("airline");
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
		return airline;
		
	}
}
