/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobportal.model;

import com.jobportal.services.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Win-10
 */
public class UserDAO {

    public boolean insert(UserDTO user) {
        boolean b = false;

        try {
            Connection con = DBConnection.myMethod();
            if (con != null) {
                String sql = "insert into user(first_name,last_name,contact_no,email,password,city,zip,role)values(?,?,?,?,?,?,?,?)";
                PreparedStatement ps = con.prepareStatement(sql);

                ps.setString(1, user.getFristname());
                ps.setString(2, user.getLastname());
                ps.setString(3, user.getContact());
                ps.setString(4, user.getEmail());
                ps.setString(5, user.getPassword());
                ps.setString(6, user.getCity());
                ps.setString(7, user.getZip());
                ps.setString(8, user.getRole());

                int i = ps.executeUpdate();
                if (i > 0) {
                    b = true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }

    public boolean select(UserDTO user) {
        boolean b = false;
        try {
            Connection con = DBConnection.myMethod();
            String sql = "select * from user where email=? and password=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getPassword());

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                b = true;
                user.setRs(rs);
            } else {
                System.out.print("Your connection not estabilshed......");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }

    public int selectId(UserDTO user) {
        try {
            Connection con = DBConnection.myMethod();

            String sql = "select id from user where email=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getEmail());

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt("id");
            } else {
                System.out.print("Your connection not estabilshed......");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public boolean updateDAO(UserDTO edit) throws SQLException {
        boolean b = false;

        try {
            Connection con = DBConnection.myMethod();
            if (con != null) {
                String sql = "update admin set contact_no,password=? where email=?";
                PreparedStatement ps = con.prepareStatement(sql);

                ps.setString(1, edit.getContact());
                ps.setString(2, edit.getPassword());
                ps.setString(3, edit.getEmail());

                int i = ps.executeUpdate();

                if (i > 0) {
                    b = true;
                }
            } else {
                System.out.println("Connection not found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }
}
