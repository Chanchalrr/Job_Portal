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
public class ProviderDAO {

    public boolean insert(ProviderDTO provider) {
        boolean b = false;

        try {
            Connection con = DBConnection.myMethod();
            if (con != null) {
                String sql = "insert into providerdetails (id,provider_type,aadhar_num,about)values(?,?,?,?)";
                PreparedStatement ps = con.prepareStatement(sql);

                ps.setInt(1, provider.getId());
                ps.setString(2, provider.getProvider_type());
                ps.setString(3, provider.getAadhar_num());
                ps.setString(4, provider.getAbout());

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
}
