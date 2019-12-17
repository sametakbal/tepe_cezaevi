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
public class Personel {

    private long tc_no;
    private String ad;
    private String soyad;
    private String dogum_tarihi;
    private String parola;
    private long birim_id;

    public Personel() {
    }

    public long getTc_no() {
        return tc_no;
    }

    public void setTc_no(long tc_no) {
        this.tc_no = tc_no;
    }



    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getDogum_tarihi() {
        return dogum_tarihi;
    }

    public void setDogum_tarihi(String dogum_tarihi) {
        this.dogum_tarihi = dogum_tarihi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public long getBirim_id() {
        return birim_id;
    }

    public void setBirim_id(long birim_id) {
        this.birim_id = birim_id;
    }

    @Override
    public String toString() {
        return "Personel{" + "tc_no=" + tc_no + ", ad=" + ad + ", soyad=" + soyad + ", dogum_tarihi=" + dogum_tarihi + ", parola=" + parola + ", birim_id=" + birim_id + '}';
    }   

}
