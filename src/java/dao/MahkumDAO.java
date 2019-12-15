/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Kogus;
import entity.Mahkum;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author akbal
 */
public class MahkumDAO extends DAO{
    
     public List<Mahkum> readAll() {
        String q = "select * from mahkum order by tc_no";
        List<Mahkum> mlist = new ArrayList<>();

        try {
            PreparedStatement pst = this.getConn().prepareStatement(q);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Mahkum tmp = new Mahkum();
                tmp.setTc_no(rs.getLong(1));
                tmp.setAd(rs.getString(2));
                tmp.setSoyad(rs.getString(3));
                tmp.setDogum_tarihi(rs.getDate(4));
                tmp.setCeza_sebebi(rs.getString(5));
                tmp.setGiris_tarihi(rs.getDate(6));
                tmp.setCikis_tarihi(rs.getDate(7));
                tmp.setCinsiyet(rs.getString(8));
                tmp.setKogus_id(9);
                mlist.add(tmp);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return mlist;
    }
}
