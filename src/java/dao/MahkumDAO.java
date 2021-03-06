/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Mahkum;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author akbal
 */
public class MahkumDAO extends DAO {

    @Override
    public void create(Object obj) {
        String q = "insert into mahkum values (?,?,?,?,?,?,?,?,?)";
        Mahkum mahkum = (Mahkum) obj;
        try {
            PreparedStatement pst = this.getConn().prepareStatement(q);
            pst.setLong(1, mahkum.getTc_no());
            pst.setString(2, mahkum.getAd());
            pst.setString(3, mahkum.getSoyad());
            pst.setDate(4, Date.valueOf(mahkum.getDogum_tarihi()));
            pst.setString(5, mahkum.getCeza_sebebi());
            pst.setDate(6, Date.valueOf(mahkum.getGiris_tarihi()));
            pst.setDate(7, Date.valueOf(mahkum.getCikis_tarihi()));
            pst.setString(8, mahkum.getCinsiyet());
            pst.setLong(9, mahkum.getKogus_id());

            pst.executeQuery();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Mahkum> readAll() {
        String q = "select * from mahkum order by ad";
        List<Mahkum> mlist = new ArrayList<>();
        try {
            PreparedStatement pst = this.getConn().prepareStatement(q);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Mahkum tmp = new Mahkum();
                tmp.setTc_no(rs.getLong(1));
                tmp.setAd(rs.getString(2));
                tmp.setSoyad(rs.getString(3));
                tmp.setDogum_tarihi(rs.getString(4));
                tmp.setCeza_sebebi(rs.getString(5));
                tmp.setGiris_tarihi(rs.getString(6));
                tmp.setCikis_tarihi(rs.getString(7));
                tmp.setCinsiyet(rs.getString(8));
                tmp.setKogus_id(rs.getLong(9));
                mlist.add(tmp);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return mlist;
    }

    @Override
    public void update(Object obj) {
        String q = "update mahkum set ad=?,soyad=? where tc_no=?";
        Mahkum mahkum = (Mahkum) obj;
        try {
            PreparedStatement pst = this.getConn().prepareStatement(q);
            pst.setString(1, mahkum.getAd());
            pst.setString(2, mahkum.getSoyad());
            pst.setLong(3, mahkum.getTc_no());

            pst.executeQuery();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void delete(Object obj) {
        String q = "delete from mahkum where tc_no=?";
        Mahkum mahkum = (Mahkum) obj;

        try {
            PreparedStatement pst = this.getConn().prepareStatement(q);
            pst.setLong(1, mahkum.getTc_no());

            pst.executeQuery();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

}
