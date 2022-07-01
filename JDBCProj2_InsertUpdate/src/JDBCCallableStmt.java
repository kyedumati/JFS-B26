import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class JDBCCallableStmt {
	
	public static void sum() {
		
	}
	
	public static void mul() {
		
	}
	
	public static void main(String[] args) {
		Connection conn=null;
		CallableStatement stmt=null;
		ResultSet rs=null;
		try {
			conn=DBUtil.getConnection();
			String QUERY="CALL GETEMPLOYEES()";
			stmt=conn.prepareCall(QUERY);
//			stmt.execute();
			rs= stmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(5));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}


//Assignments2
// Create a simple procedure to insert records dynamically by accepting input params and call that procedure from JDBC
// Insert multiple records to employee table at a time from JDBC app (Note: using preparedstatement)