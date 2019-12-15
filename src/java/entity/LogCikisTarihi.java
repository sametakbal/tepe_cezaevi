/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;

/**
 *
 * @author ezgih
 */
public class LogCikisTarihi {

    private int log_id;
    private int mahkum_id;
    private Date cikis_tarihi;
    private Date son_guncelleme;
    
    public LogCikisTarihi() {
    }

    public int getLog_id() {
        return log_id;
    }

    public void setLog_id(int log_id) {
        this.log_id = log_id;
    }

    public int getMahkum_id() {
        return mahkum_id;
    }

    public void setMahkum_id(int mahkum_id) {
        this.mahkum_id = mahkum_id;
    }

    public Date getCikis_tarihi() {
        return cikis_tarihi;
    }

    public void setCikis_tarihi(Date cikis_tarihi) {
        this.cikis_tarihi = cikis_tarihi;
    }
    public Date getSon_guncelleme() {
        return son_guncelleme;
    }

    public void setSon_guncelleme(Date son_guncelleme) {
        this.son_guncelleme = son_guncelleme;
    }

    @Override
    public String toString() {
        return "LogCikisTarihi{" + "log_id=" + log_id + ", mahkum_id=" + mahkum_id + ", cikis_tarihi=" + cikis_tarihi + '}';
    }

}
