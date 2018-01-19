package dao.imp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.Basedao;
import dao.SubwayInfo;
import entity.Subway;

public class SubwayImp extends Basedao implements SubwayInfo{

	@Override
	public ArrayList<Subway> select() {
		String sql = "select * from ditie";
		
		ResultSet rs = (ResultSet)super.execute(sql);
		ArrayList<Subway> arr = new ArrayList<Subway>();
		try {
			while(rs.next()){
				arr.add(new Subway(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getInt(5),
						rs.getString(6),
						rs.getInt(7)));
			}
			return arr;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public String selectname(String name) {
		String sql = "select name from ditie where name = ?";
		
		ResultSet rs = (ResultSet)super.execute(sql,name);
		String name1 = null;
		try {
			if(rs.next()){
				name1 = rs.getString(1);
			}
			return name1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
