/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

//import java.sql.ResultSet;
import entity.Kogus;
import java.sql.PreparedStatement;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author akbal
 */
public class KogusDAO extends DAO {

    @Override
    public void create(Object obj) {
        String q = "insert into kogus values (default,?,?)";
        Kogus kogus = (Kogus) obj;
        try {
            PreparedStatement pst = this.getConn().prepareStatement(q);
            pst.setLong(1, kogus.getKapasite());
            pst.setString(2, kogus.getCinsiyet());

            pst.executeQuery();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List readAll() {
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

    @Override
    public void update(Object obj) {
        String q = "update kogus set kapasite=?,cinsiyet=? where kogus_id=?";
        Kogus kogus = (Kogus) obj;
        try {
            PreparedStatement pst = this.getConn().prepareStatement(q);
            pst.setLong(1, kogus.getKapasite());
            pst.setString(2, kogus.getCinsiyet());
            pst.setLong(3, kogus.getKogus_id());

            pst.executeQuery();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete(Object obj) {
        String q = "delete from kogus where kogus_id=?";
        Kogus kogus = (Kogus) obj;

        try {
            PreparedStatement pst = this.getConn().prepareStatement(q);
            pst.setLong(1, kogus.getKogus_id());

            pst.executeQuery();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

}
