package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import oracle.jdbc.OracleDriver;

public class TestDB2 {

	public static void main(String[] args) throws SQLException {
		OracleDriver driver = new OracleDriver();
	      DriverManager.registerDriver(driver);
	      String url ="jdbc:oracle:thin:@localhost:1521:orcl";
	      Connection conn = DriverManager.getConnection(url,"scott","tiger");
	      System.out.println("connected");
	      /*String qry = "update employee set empname =?,empsal = ? where empid=?";
	      PreparedStatement pst = conn.prepareStatement(qry);
	      pst.setString(1,"deloitte");
	      pst.setDouble(2, 4566);
	      pst.setInt(3, 5);*/
	      String qry = "delete from employee where empid>=?";
	   PreparedStatement pst = conn.prepareStatement(qry);	
	   pst.setInt(1,12);
	      int rows = pst.executeUpdate();
	      System.out.println(rows);
          conn.close();
          
	}

}
