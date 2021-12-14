package project.view.db;

import project.view.model.Member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {

    public String insert(Member member) {
        DBUtil dbUtil = new DBUtil();
        Connection con = dbUtil.getConnection();
        String result = "Data entered successfully";
        String sql = "insert into member values(?,?,?,?)";

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, member.getUname());
            ps.setString(2, member.getPassword());
            ps.setString(3, member.getEmail());
            ps.setString(4, member.getPhone());
            System.out.println(ps);
            ps.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            result = "Data not entered";
        }
        return result;
    }

}
