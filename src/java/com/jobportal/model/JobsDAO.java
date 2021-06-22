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
public class JobsDAO {

    public boolean insert(JobsDTO job) {
        boolean b = false;

        try {
            Connection con = DBConnection.myMethod();
            if (con != null) {
                String sql = "insert into jobs(id,category_id,name,wages,desc,mobile_num,address)values(?,?,?,?,?,?,?)";
                PreparedStatement ps = con.prepareStatement(sql);

                ps.setInt(1, job.getId());
                ps.setInt(2, job.getCategory_id());
                ps.setString(3, job.getName());
                ps.setString(4, job.getWages());
                ps.setString(5, job.getDesc());
                ps.setString(6, job.getMobile_num());
                ps.setString(7, job.getAddress());

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

    public ResultSet selectByCategory(int category) {

        try {
            Connection con = DBConnection.myMethod();
            String sql = "select * from jobs where category_id =?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, category);
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

    public ResultSet selectById(int id) {

        try {
            Connection con = DBConnection.myMethod();

            String sql = "select * from jobs where id = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
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
