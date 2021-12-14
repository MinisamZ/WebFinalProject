package project.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {

    public String verify(Member member) {
        DBUtil dbUtil = new DBUtil();
        Connection con = dbUtil.getConnection();
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
                Member c = new Member(null, null, null, null);
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