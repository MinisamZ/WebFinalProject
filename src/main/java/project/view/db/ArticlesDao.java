package project.view.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ArticlesDao {

    public ResultSet request(String sqlMain) {
        DBUtil dbUtil = new DBUtil();
        Connection con = dbUtil.getConnection();
        String result = "Data received successfully ";
        String sql = sqlMain;
        System.out.println(sql);
        try {
            PreparedStatement prSt = con.prepareStatement(sql);
            ResultSet resultSet = prSt.executeQuery();
            return resultSet;

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            result = "Data not correct";
        }
        System.out.println(result);

        return null;
    }

}
