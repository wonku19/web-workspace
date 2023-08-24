package model.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import config.ServerInfo;
import model.vo.UserDTO;

public class UserDAO {
	
	UserDAO dao = new UserDAO();


public UserDAO() {

	try {
		Class.forName(ServerInfo.DRIVER_NAME);
	} catch (ClassNotFoundException e) {}
	
}

public Connection getConnection() throws SQLException {

	Connection conn = DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASSWORD);
	System.out.println("DB Connection..!!");
	return conn;
}

public void closeAll(PreparedStatement ps, Connection conn) throws SQLException {

	ps.close();
	conn.close();
}

public void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException {
	rs.close();
	closeAll(ps, conn);
}


public UserDTO findByNameMember(String name) throws SQLException {
	Connection conn = getConnection();
	

	String query = "SELECT * FROM MEMBER WHERE USER_NO=?";
	PreparedStatement ps = conn.prepareStatement(query);
	ps.setString(1, name);
	

	UserDTO dto = null;
	ResultSet rs = ps.executeQuery();
	if(rs.next()) {
		dto = new UserDTO(rs.getInt("user_No"), 
				rs.getString("user_Id"), rs.getString("user_Name"), rs.getInt("user_Age"));
	}
	
	closeAll(rs, ps, conn);
	return dto;
}
	
}
