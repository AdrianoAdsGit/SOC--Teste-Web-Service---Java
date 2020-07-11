package br.com.soctest.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static Connection connection;

	private static final String USERNAME = "soc";

	private static final String PASSWORD = "soc";

	private static final String DATABASE_URL = "jdbc:sqlserver://localhost:1433;databaseName=soc";

	public static Connection createConnectionToSQL() throws SQLException {

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;

	}

	}