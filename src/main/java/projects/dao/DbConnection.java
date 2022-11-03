package projects.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import DbException.DbException;


public class DbConnection {
  private static String HOST = "localhost";
  private static String PASSWORD = "Projects1";
  private static int PORT = 3306;
  private static String SCHEMA = "projects";
  private static String USER = "projects";


  public static Connection getconnection() {
    String url = String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s", HOST, PORT, SCHEMA,
        USER, PASSWORD);


    try {
      Connection conn = DriverManager.getConnection(url);
      System.out.println("Connection to schema is working.");
      return conn;


    } catch (SQLException e) {
      System.out.println("unable to get connection at" + url);
  throw new DbException(e);
    }
  

  }
}
