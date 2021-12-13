package com.dvd.view;

public class MemberDao {
    public String uname, password, email, phone;

    public String getPassword() {
        return password;
    }

    public String getUname() {
        return uname;
    }

    public String toString() {
        return "MemberDao{" +
                "uname=" + uname +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

}
