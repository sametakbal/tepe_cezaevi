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
public class KogusDAO extends DAO{

    
    public List<Kogus> readAll(){
        System.err.println("-------------------------------------------------------");
        String q = "select * from kogus";
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
                System.out.println(tmp.toString()+"------------------------------------------");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage()+"+++++++---------------------");
        }
        
        return klist;
    }
}
