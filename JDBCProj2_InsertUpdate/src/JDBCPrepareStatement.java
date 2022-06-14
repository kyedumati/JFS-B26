import java.sql.Connection;
import java.sql.PreparedStatement;

public class JDBCPrepareStatement {

	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DBUtil.getConnection();
			if(conn!=null) {
				String query="INSERT INTO EMP(empno,ename,job) VALUES(?,?,?)";
				pstmt=conn.prepareStatement();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
