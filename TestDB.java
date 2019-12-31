package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;

public class TestDB {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
      OracleDriver driver = new OracleDriver();
      DriverManager.registerDriver(driver);
      String url ="jdbc:oracle:thin:@localhost:1521:orcl";
      Connection conn = DriverManager.getConnection(url,"scott","tiger");
      System.out.println("connected");

      Statement st =conn.createStatement();
      /*String qry ="insert into employee values(2,'deal',67)";
      st.executeUpdate(qry);
      conn.close();*/
      String qry ="insert into employee values(?,?,?)";
      PreparedStatement pst =conn.prepareStatement(qry);
      for(int i=0;i<3;i++)
      {
      pst.setInt(1,sc.nextInt());
      pst.setString(2,sc.next());
      pst.setDouble(3,sc.nextDouble());
     int rows=pst.executeUpdate();
      System.out.println("inserted "+rows);
      }
      
      conn.close();
	}

}
