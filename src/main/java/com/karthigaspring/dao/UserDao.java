package com.karthigaspring.dao;

import com.karthigaspring.Db.DbConnection;
import com.karthigaspring.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDao {

    private final Connection connection;
    public UserDao() {

        this.connection= DbConnection.getConnection();
    }


    public static final String SELECT_USER = "SELECT id,username,password,gender FROM user WHERE username=? AND password=?;";
    public static final String INSERT_USER = "INSERT INTO user (username, password,gender) VALUES (?,?,?);";

    public User loginUser(String username, String password) {
        User user = null;

        try {
            PreparedStatement ps1 = connection.prepareStatement(SELECT_USER);
            ps1.setString(1, username);
            ps1.setString(2, password);
            ResultSet rs = ps1.executeQuery();
            if (rs.next()) {
                user = new User();
                user.setId(Integer.parseInt(rs.getString("id")));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setGender(rs.getString("gender"));

                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public Boolean register(String username, String password, String gender) {
        try {
            PreparedStatement ps= connection.prepareStatement(INSERT_USER);
            ps.setString(1,username);
            ps.setString(2,password);
            ps.setString(3,gender);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
