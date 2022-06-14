import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCNonSelect {
	
	public static void insertRecord() throws SQLException {
		Statement stmt=null;
		Connection conn=null;
		Scanner sc=null;
		try {
			sc=new Scanner(System.in);
			int empno=0;
			String ename=null;
			String job=null;
			if(sc!=null) {
				System.out.println("Enter empno : ");
				empno=sc.nextInt();
				System.out.println("Enter empname : ");
				ename=sc.next();
				System.out.println("Enter job : ");
				job=sc.next();
			}
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jfs_21","root","root");
			//conn.setAutoCommit(false);
			if(conn!=null)
				stmt=conn.createStatement();
			String query="insert into emp(empno,ename,job) values("+empno+",'"+ename+"','"+job+"')";
			System.out.println("query "+query);
			if(stmt!=null) {
			  int no=stmt.executeUpdate(query);
			  if(no==0) {
				  System.out.println("no records inserted");
			  }else {
				  System.out.println(no+ " record(s) are inserted");
			  }
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			conn.close();
		}
	}
	
	public static void main(String[] args) throws SQLException  {
		
		insertRecord();
	}

}
