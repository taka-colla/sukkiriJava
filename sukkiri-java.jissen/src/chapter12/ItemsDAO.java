package chapter12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ItemsDAO {

	public static ArrayList<Item> findByMinimumPrice(int i) {
		try {
			Class.forName("org.h2.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:h2:file:C:/data/rpgdb","sa","");


			String sql = ("SELECT * FROM ITEMS WHERE price >= ?");
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, i);
			ResultSet rs = pstmt.executeQuery();

			ArrayList<Item> items = new ArrayList<>();

			while(rs.next()) {
				Item item = new Item();
				item.setName(rs.getString("NAME"));
				item.setPrice(rs.getInt("PRICE"));
				item.setWeight(rs.getInt("WEIGHT"));
				items.add(item);
			}
			rs.close();
			pstmt.close();
			return items;

		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}finally {
			if(con != null) {
				try {
					con.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
