/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samotnay;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author MABESH PROJECT
 */
public class delete {
    public void delete (String nis, String nama, String kelas, String kelamin, String alamat, String email, String notelp){
        try{
        String sql = "DELETE FROM siswasmp WHERE nis='"+nis+"'";
        java.sql.Connection conn = (Connection) konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
           
    }                                       
        catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
    }
        
}
}