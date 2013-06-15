package sz.hb.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class BaseJdbcDemo {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		String url = "jdbc:postgresql://localhost/postgres";
		Properties props = new Properties();
		props.setProperty("user","hubin");
		props.setProperty("password","hubin");
		//props.setProperty("ssl","false");
		Connection conn = DriverManager.getConnection(url, props);
		
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from actions");
		while(rs.next()){
			System.out.print(rs.getObject(1)+"\t"+rs.getObject(2));
			System.out.println();
		}

		//String url = "jdbc:postgresql://localhost/test?user=fred&password=secret&ssl=true";
		//Connection conn = DriverManager.getConnection(url);

	}

}
