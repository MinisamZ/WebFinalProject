package project.view;

import java.sql.*;

public class LoginDao {

    private String dbUrl = "jdbc:mysql://localhost/userdb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&characterEncoding=UTF-8";
    private String dbUname = "sam";
    private String dbPassword = "sam";
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
        Connection con = null;
        try {
            con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return con;
    }


    public String verify(Member member) {
        loadDriver(dbDriver);
        Connection con = getConnection();
        String result = "Data received successfully ";
        String sql = "select `uname`, `password`, `email`, `phone` FROM `member` WHERE(";
        System.out.println(sql);
        try {
            sql += "uname = '" + member.getUname() + "'";
            sql += " AND ";
            sql += "password = '" + member.getPassword() + "')";

            System.out.println(sql);
            PreparedStatement prSt = con.prepareStatement(sql);
            ResultSet resultSet = prSt.executeQuery();

            if (resultSet.next()) {
                Member c = new Member(null,null,null,null);
                c.setUname(resultSet.getString("uname"));
                c.setEmail(resultSet.getString("email"));
                c.setPhone(resultSet.getString("phone"));
                result = "Hello " + c.getUname() + "! Your phone: " + c.getPhone() + " and mail: " + c.getEmail();
                System.out.println("asdasd " + c.toString() + " asdasd");
            } else {
                System.out.println(false);
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            result = "Data not correct";
        }
        return result;
    }

}
