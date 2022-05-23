package edubit;

import java.sql.*;

public class Main {

    Connection conn = db.java_db();
    ResultSet rs = null;
    PreparedStatement pst = null;
    String status, temp;

    public String Startup() {

        String queryStart = "SELECT * FROM SCHOOL_INFO";
        String queryInit = "SELECT * FROM SYSUSERS WHERE DIVISION = 'Admin'";
        try {
            pst = conn.prepareStatement(queryStart);
            rs = pst.executeQuery();
            if (rs.next()) {
                temp = "schoolIn";
            }
            pst = conn.prepareStatement(queryInit);
            rs = pst.executeQuery();
            if (rs.next()) {
                temp = "allIn";
            }

            if ("allIn".equals(temp)) {
                pst = conn.prepareStatement(queryStart);
                rs = pst.executeQuery();
                if (rs.next()) {
                    status = "on";
                } else {
                    status = "offSchool";
                }

            } else if ("schoolIn".equals(temp)) {
                status = "middle";
            } else {
                status = "off";
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return status;

    }

}
