package ex21jdbc.crud;

import java.sql.SQLException;

public class SQLdelete extends MyConnection {
	
	public SQLdelete(String user, String pass) {
		super(user, pass);
	}
	
	String quary;
	int result;
	
	@Override
	public void dbExcute() {
		try { 
			stmt = con.createStatement();
			quary = "DELETE FROM member WHERE id='test'";
			result = stmt.executeUpdate(quary);
			System.out.println(result + "행 삭제됨.");
			
			/////////////////////////////////////////////
			quary = "DELETE FROM member WHERE id=?";
			psmt = con.prepareStatement(quary);
			psmt.setString(1, inputValue("삭제할 아이디"));
			System.out.println(psmt.executeUpdate() + "행 삭제됨.");
		}
		catch(SQLException e) {
			System.out.println("쿼리실행 중 예외발생");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		new SQLdelete("education", "1234").dbExcute();
	}

}
