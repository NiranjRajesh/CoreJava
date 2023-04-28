package project1.ust;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","postgres");
    	Statement st = con.createStatement();
    	ResultSet rs = st.executeQuery("SELECT * FROM BRANCH");
    	while(rs.next())
    		System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
    
    }
}
