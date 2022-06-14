import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCConnect {
	
	public static void main(String[] args) {
		Connection conn=null;
		Statement st=null;
		ResultSet rs=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jfs_21","root","root");
			
			if(conn!=null) {
				st=conn.createStatement();
				String query="select * from emp";
				
				if(st!=null) {
					rs=st.executeQuery(query);
				}
			}
			
			if(rs!=null) {
				boolean isEmptyRs=true;
				while(rs.next()) {
					isEmptyRs=false;
					System.out.println(rs.getInt(1)+" "+rs.getString(2));
				}
				
				if(isEmptyRs) {
					System.out.println("records not foound");
				}else {
					System.out.println("recordsfoound");
				}
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		
	}

}
