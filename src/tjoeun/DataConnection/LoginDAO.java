package tjoeun.DataConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbcp2.BasicDataSource;


import tjoeun.login.Login_1;

public class LoginDAO {
BasicDataSource ds;
	
     public LoginDAO(){
		ds = new BasicDataSource(); 
		
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUsername("scott");
		ds.setPassword("tiger");
		
		ds.setInitialSize(5);
	}
     
	public ArrayList<Login_1> select(){
		ArrayList<Login_1> list = new ArrayList<Login_1>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = ds.getConnection();
			String sql = "SELECT * FROM login order by srno";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) { //dd
				Login_1 login1 = new Login_1();
				login1.setSr(rs.getInt("srno"));
				login1.setLogin(rs.getString("id"));
				login1.setPassword(rs.getString("pass"));
				login1.setQuestion(rs.getString("question"));
				login1.setAnswer(rs.getString("answer"));
				login1.setName(rs.getString("name"));
				login1.setStatus(rs.getString("status"));
				login1.setDateTime(rs.getString("date_time"));
				list.add(login1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) { rs.close(); }
				if(pstmt != null) { pstmt.close(); }
				if(con != null)  { con.close(); }
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}

}
