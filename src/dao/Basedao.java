package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;


public class Basedao {
	private Connection ct;
	private PreparedStatement pt;
	
	
	public Connection getConnetion(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/kaoshi","root","123456");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ct;
		
	}
	
	public Object execute(String sql,Object...a){
		ct = this.getConnetion();
		try {
			pt = ct.prepareStatement(sql);
			for(int i = 0; i<a.length;i++){
				pt.setObject((i+1), a[i]);
			}
			if(pt.execute()){
				RowSetFactory row = RowSetProvider.newFactory();
				CachedRowSet ca =  row.createCachedRowSet();
				
				ca.populate(pt.getResultSet());
				return ca;
			}else{
				return pt.getUpdateCount();
			}	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				this.close(ct, pt.getResultSet(), pt);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	
	private void close(Connection ct,ResultSet rs, PreparedStatement pt){
		
			try {
				if(rs !=null)rs.close();
				if(pt !=null) pt.close();
				if(ct != null)ct.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	
	

}
