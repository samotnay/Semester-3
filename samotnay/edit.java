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
public class edit {
    public void edit (String nis, String nama, String kelas, String kelamin, String alamat, String email, String notelp){
        try {
            String sql = "UPDATE `siswasmp` SET `nis` ='"+nis+"',`nama_siswa`='"+nama+"',`kelas`='"+kelas+"',`jenis kelamin`='"+kelamin+"',`alamat`='"+alamat+"',`email`='"+email+"',`notlp`='"+notelp+"' WHERE nis= '"+nis+"'";
            java.sql.Connection conn = (Connection) konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Edit Data Berhasil....");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
    }
}
}