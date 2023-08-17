package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import config.ServerInfo;


public class ItemDAO implements ItemDAOTemplate{

	
	public static void main(String[] args) {
		ItemDAO da = new ItemDAO();
		
		try {
			da.getAllItem();
//			da.getItem(42);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	private static ItemDAO dao = new ItemDAO();	
	private ItemDAO() {
		try {
			Class.forName(ServerInfo.DRIVER_NAME);
		} catch (ClassNotFoundException e) {
				
		}
	}
	public static ItemDAO getInstance() {
		return dao;
	} 
	
	@Override
	public Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(ServerInfo.URL,ServerInfo.USER,ServerInfo.PASSWORD);
		return conn;
	}

	@Override
	public void closeAll(PreparedStatement ps, Connection conn) throws SQLException {
		ps.close();
		conn.close();
		
	}

	@Override
	public void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException {
		
		rs.close();
		closeAll(ps,conn);
		
	}

	@Override
	public ArrayList<Item> getAllItem() throws SQLException {
		String query = "SELECT * FROM ITEM";
		ArrayList<Item> item = new ArrayList<>();
		Connection conn = getConnection();
		PreparedStatement ps = conn.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		Item it = null;
		
		while(rs.next()) {
			it = new Item(rs.getInt("item_id"),rs.getString("item_name"),rs.getInt("price"),rs.getString("DESCRIPTION"),rs.getString("picture_url"),rs.getInt("count"));						
			item.add(it);			
		}
		System.out.println(item);
 		return item;
	}

	@Override
	public Item getItem(int itemId) throws SQLException {
		String query = "SELECT * FROM ITEM WHERE item_id=?";
		Connection conn = getConnection();
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setInt(1, itemId);
		ResultSet rs = ps.executeQuery();
		Item item = null;
		if(rs.next()) {
			item = new Item(rs.getInt("item_id"),rs.getString("item_name"),rs.getInt("price"),rs.getString("DESCRIPTION"),rs.getString("picture_url"),rs.getInt("count"));		
		}
		
	
		return item;
	}

	@Override
	public boolean updateRecordCount(int itemId) throws SQLException {
		String query = "UPDATE ITEM SET count=count+1 WHERE item_id=?";
		Connection conn = getConnection();
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setInt(1, itemId);
		
			int row = ps.executeUpdate();	
			
			boolean result = false;
			if(row>0) result = true;
			closeAll(ps,conn);
		
		return true;
	}
	
	
	
}
