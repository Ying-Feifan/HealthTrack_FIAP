package br.com.fase6.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	
	private Connection connection;
	
	public DAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection GetConnection() {
		OpenConnection();
		System.out.println("Conexão aberta");
		return this.connection;
	}
	
	private void OpenConnection() {
		try {
			this.connection = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521/ORCL","RM87184","111081");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void CloseConnection() {
		try {
			if(this.connection != null) {
			this.connection.close();
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//------Comandos Insert, Update, Delete-----
	public int ExecuteCommand(PreparedStatement stmt) {
		int j = 0;
		try {
			j = stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			CloseConnection();
		}
		return j;
	}
	
	public ResultSet getDataResultSet (PreparedStatement stmt) {
		
		ResultSet resultSet = null;
		try {
			resultSet = stmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			CloseConnection();
		}
		return resultSet;
	}

	public ResultSet GetData(PreparedStatement stmt) {
		// TODO Auto-generated method stub
		return null;
	}

}
