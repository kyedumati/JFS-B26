import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCPrepareStatement {

	public static void main(String[] args) throws SQLException {
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DBUtil.getConnection();
			if(conn!=null) {
				String query="INSERT INTO EMP(empno,ename,job) VALUES(?,?,?)";
				pstmt=conn.prepareStatement(query);
				
				pstmt.setInt(1, 1234);
				pstmt.setString(2, "testpstmt");
				pstmt.setString(3, "develper");
				
				int result= pstmt.executeUpdate();
				
				if(result==0)
					System.out.println("records are not inserted");
				else
					System.out.println(result+" record(s) are inserted");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			conn.close();
			pstmt.close();
		}
	}
}
