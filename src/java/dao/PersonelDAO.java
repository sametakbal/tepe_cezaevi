/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Personel;
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
public class PersonelDAO extends DAO {

    @Override
    public void create(Object obj) {
        String q = "insert into personel values (?,?,?,?,?,?)";
        Personel personel = (Personel) obj;
        try {
            PreparedStatement pst = this.getConn().prepareStatement(q);
            pst.setLong(1, personel.getTc_no());
            pst.setString(2, personel.getAd());
            pst.setString(3, personel.getSoyad());
            pst.setDate(4, Date.valueOf(personel.getDogum_tarihi()));
            pst.setString(5, personel.getParola());
            pst.setLong(6, personel.getBirim_id());

            pst.executeQuery();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Personel> readAll() {
        String q = "select * from personel order by ad";
        List<Personel> plist = new ArrayList<>();

        try {
            PreparedStatement pst = this.getConn().prepareStatement(q);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Personel tmp = new Personel();
                tmp.setTc_no(rs.getLong(1));
                tmp.setAd(rs.getString(2));
                tmp.setSoyad(rs.getString(3));
                tmp.setDogum_tarihi(rs.getString(4));
                tmp.setParola(rs.getString(5));
                tmp.setBirim_id(rs.getLong(6));
                plist.add(tmp);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return plist;
    }

    @Override
    public void update(Object obj) {
        String q = "update personel set ad=?,soyad=? where tc_no=?";
        Personel personel = (Personel) obj;
        try {
            PreparedStatement pst = this.getConn().prepareStatement(q);
            pst.setString(1, personel.getAd());
            pst.setString(2, personel.getSoyad());
            pst.setLong(3, personel.getTc_no());

            pst.executeQuery();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete(Object obj) {
        String q = "delete from personel where tc_no=?";
        Personel personel = (Personel) obj;

        try {
            PreparedStatement pst = this.getConn().prepareStatement(q);
            pst.setLong(1, personel.getTc_no());

            pst.executeQuery();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
