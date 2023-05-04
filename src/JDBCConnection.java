import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host="localhost";
		String port="3306";
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/article", "root", "@nkit@12SQL");
		Statement stat=con.createStatement();
		ResultSet res=stat.executeQuery("Select * from pet where name='Micky'");
		//ResultSet res=stat.executeQuery("Select * from pet where name="Micky");
		while(res.next()) {
			System.out.println(res.getString("owner"));
			System.out.println(res.getString("SEX"));
			
		}
		System.out.println("SUCCESSFULLY DB CONNECTION Established1234");
	}

}
