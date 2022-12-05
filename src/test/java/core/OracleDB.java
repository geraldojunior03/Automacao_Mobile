package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleDB {

	private static String host = "";
	private static String port = "";
	private static String user = "";
	private static String password = "";
	private static String db = "";
	private static String myUrl = "jdbc:oracle:thin:@//" + host + ":" + port + "/" + db;

	public static void CustomQuery(String sql) throws SQLException {
		try {
			// String myDriver = "com.mysql.cj.jdbc.Driver";
			String myDriver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(myUrl, user, password);
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			conn.close();
		} catch (Exception ex) {
			System.err.println("Houve uma exceção!");
			System.out.println("SQLException: " + ex.getMessage());
		}
	}

	public static void CustomQueryLocal(String sql) {
		try {
			String myDriver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(myUrl, user, password);
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);

			conn.close();
		} catch (Exception e) {
			System.err.println("Houve uma exceção!");
			System.err.println(e.getMessage());
		}
	}

	public static String QuerySelect(String sql) {
		ResultSet rs = null;
		String json = "[";
		try {

			String myDriver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(myUrl, user, password);

			Statement stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			Integer contador = 1;
			while (rs.next()) {
				if (contador > 1) {
					json += ",";
				}
				json += "{\"nome\":\"" + rs.getString("nome") + "\"}";
				contador++;
			}
			json += "]";
			conn.close();
		} catch (Exception e) {
			System.err.println("Houve uma exceção!");
			System.err.println(e.getMessage());
		}
		return json;
	}

	public static String DBLookup(String sql) throws SQLException, ClassNotFoundException {
		ResultSet rs = null;
		String lookup = "";
		try {
			String myDriver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(myUrl, user, password);
			Statement stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (!rs.next()) {
				lookup = "";
			} else {
				lookup = rs.getString("");
			}

			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return lookup;
	}

	public static void QueryInsert(String sql) {
		try {
			
			String myDriver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(myUrl, user, password);
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			conn.close();
		} catch (Exception e) {
			System.err.println("Houve uma exceção!");
			System.err.println(e.getMessage());
		}
	}
}