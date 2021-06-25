package com.jobportal.model;

import com.jobportal.services.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ApplyDAO {

    public boolean ApplyDAO(ApplyDAO apply) {
        boolean b = false;

        try {
            Connection con = DBConnection.myMethod();
            if (con != null) {
                String sql = "insert into apply(id,job_id,candidate_id,apply_date)values(?,?,?,?)";
                PreparedStatement ps = con.prepareStatement(sql);

                ps.setInt(1,apply.);

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

