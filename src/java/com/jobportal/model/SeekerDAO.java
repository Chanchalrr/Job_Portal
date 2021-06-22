/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobportal.model;

import com.jobportal.services.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Win-10
 */
public class SeekerDAO {

    public boolean insert(SeekerDTO seeker) {
        boolean b = false;

        try {
            Connection con = DBConnection.myMethod();
            if (con != null) {
                String sql = "insert into seekerdetails (id,aadhar_num,higher_que,skill)values(?,?,?,?)";
                PreparedStatement ps = con.prepareStatement(sql);

                ps.setInt(1, seeker.getId());
                ps.setString(2, seeker.getAadhar_num());
                ps.setString(3, seeker.getHigher_que());
                ps.setString(4, seeker.getSkill());

                int i = ps.executeUpdate();
                if (i > 0) {
                    b = true;
                }
            }
        } catch (Exception e) {
            System.out.print(e);
        }

        return b;
    }
}
