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

/**
 *
 * @author Win-10
 */
public class CategoriesDAO {

    public boolean insert(CategoriesDTO cat) {
        boolean b = false;
        try {
            Connection con = DBConnection.myMethod();
            if (con != null) {
                String sql = "insert into jobcategory(id,name)values(?,?))";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, cat.getId());
                ps.setString(2, cat.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }

    public ResultSet select() {
        try {
            Connection con = DBConnection.myMethod();
            String sql = "select * from jobcategory ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs;
            } else {
                System.out.print("Your connection not estabilshed......");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
