/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import util.DBConnection;
import java.util.List;


/**
 *
 * @author akbal
 */
public abstract class DAO {
    private Connection conn;
    private DBConnection db;
    

    public DAO() {
        
    }
    public abstract void create(Object obj);
    public abstract List readAll();
    public abstract void update(Object obj);
    public abstract void delete(Object obj);
    

    public Connection getConn() {
        if (this.conn == null) {
            this.conn = getDb().connect();
        }
        return this.conn;
    }

    public DBConnection getDb() {
        if (this.db == null) {
            this.db = new DBConnection();
        }
        return this.db;
    }

}