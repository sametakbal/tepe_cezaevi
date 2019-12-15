/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

//import java.sql.ResultSet;
import entity.Kogus;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import util.DBConnection;

/**
 *
 * @author akbal
 */
public class KogusDAO extends DAO {

    public List<Kogus> readAll() {
        String q = "select * from kogus order by kogus_id";
        List<Kogus> klist = new ArrayList<>();

        try {
            PreparedStatement pst = this.getConn().prepareStatement(q);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Kogus tmp = new Kogus();
                tmp.setKogus_id(rs.getLong(1));
                tmp.setKapasite(rs.getLong(2));
                tmp.setCinsiyet(rs.getString(3));
                klist.add(tmp);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return klist;
    }

    public void create(Kogus kogus) {
        String q = "insert into kogus values (default,?,?)";

        try {
            PreparedStatement pst = this.getConn().prepareStatement(q);
            pst.setLong(1, kogus.getKapasite());
            pst.setString(2, kogus.getCinsiyet());

            pst.executeQuery();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void delete(Kogus kogus) {
        String q = "delete from kogus where kogus_id=?";

        try {
            PreparedStatement pst = this.getConn().prepareStatement(q);
            pst.setLong(1, kogus.getKogus_id());

            pst.executeQuery();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void update(Kogus kogus) {
        String q = "update kogus set kapasite=?,cinsiyet=? where kogus_id=?";

        try {
            PreparedStatement pst = this.getConn().prepareStatement(q);
            pst.setLong(1, kogus.getKapasite());
            pst.setString(2,kogus.getCinsiyet());
            pst.setLong(3, kogus.getKogus_id());

            pst.executeQuery();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
