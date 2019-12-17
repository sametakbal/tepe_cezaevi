/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Ziyaretci;
import entity.ZiyaretciJoin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author akbal
 */
public class ZiyaretciDAO extends DAO {

    @Override
    public void create(Object obj) {
        String q = "insert into ziyaretci values (default,?,?)";
        Ziyaretci ziyaretci = (Ziyaretci) obj;
        try {
            PreparedStatement pst = this.getConn().prepareStatement(q);
            pst.setString(1, ziyaretci.getAd());
            pst.setString(2, ziyaretci.getSoyad());

            pst.executeQuery();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List readAll() {
        String q = "select * from ziyaretci order by ziyaretci_id";
        List<Ziyaretci> klist = new ArrayList<>();

        try {
            PreparedStatement pst = this.getConn().prepareStatement(q);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Ziyaretci tmp = new Ziyaretci();
                tmp.setZiyaretci_id(rs.getLong(1));
                tmp.setAd(rs.getString(2));
                tmp.setSoyad(rs.getString(3));
                klist.add(tmp);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return klist;
    }

    @Override
    public void update(Object obj) {
        String q = "update ziyaretci set ad=?,soyad=? where ziyaretci_id=?";
        Ziyaretci ziyaretci = (Ziyaretci) obj;
        try {
            PreparedStatement pst = this.getConn().prepareStatement(q);
            pst.setString(1, ziyaretci.getAd());
            pst.setString(2, ziyaretci.getSoyad());
            pst.setLong(3, ziyaretci.getZiyaretci_id());

            pst.executeQuery();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete(Object obj) {
        String q = "delete from ziyaretci where ziyaretci_id=?";
        Ziyaretci ziyaretci = (Ziyaretci) obj;

        try {
            PreparedStatement pst = this.getConn().prepareStatement(q);
            pst.setLong(1, ziyaretci.getZiyaretci_id());

            pst.executeQuery();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<ZiyaretciJoin> full_outer_join() {
        String q = "select zi.ad,zi.soyad,count(mz.ziyaretci_id) as ziyaret_sayisi from mahkum_ziyaret mz full outer join ziyaretci zi on zi.ziyaretci_id=mz.ziyaretci_id\n"
                + "group by zi.ziyaretci_id order by count(mz.ziyaretci_id) desc;";
        List<ZiyaretciJoin> klist = new ArrayList<>();

        try {
            PreparedStatement pst = this.getConn().prepareStatement(q);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                ZiyaretciJoin tmp = new ZiyaretciJoin(rs.getString(1), rs.getString(2), rs.getInt(3));
                klist.add(tmp);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return klist;
    }

}
