package project.view.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBUtil {
    // JDBC URL, username and password of MySQL server
    private final String url = "jdbc:mysql://localhost/userdb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&characterEncoding=UTF-8";
    private final String user = "sam";
    private final String password = "sam";

    // JDBC variables for opening and managing connection
    private Connection con;
    private Statement stmt;
    private ResultSet rs;
    private String dbDriver = "com.mysql.cj.jdbc.Driver";

    public void loadDriver(String dbDriver) {
        try {
            Class.forName(dbDriver);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        loadDriver(dbDriver);
        try {
            // opening database connection to MySQL server

            con = DriverManager.getConnection(url, user, password);


        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error connection creation");
        }
        return con;
    }
}
