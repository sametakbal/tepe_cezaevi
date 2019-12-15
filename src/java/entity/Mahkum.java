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
public class Mahkum {

    private long tc_no;
    private String ad;
    private String soyad;
    private Date dogum_tarihi;
    private String ceza_sebebi;
    private Date giris_tarihi;
    private Date cikis_tarihi;
    private String cinsiyet;
    private int kogus_id;

    public Mahkum() {
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

    public Date getDogum_tarihi() {
        return dogum_tarihi;
    }

    public void setDogum_tarihi(Date dogum_tarihi) {
        this.dogum_tarihi = dogum_tarihi;
    }

    public String getCeza_sebebi() {
        return ceza_sebebi;
    }

    public void setCeza_sebebi(String ceza_sebebi) {
        this.ceza_sebebi = ceza_sebebi;
    }

    public Date getGiris_tarihi() {
        return giris_tarihi;
    }

    public void setGiris_tarihi(Date giris_tarihi) {
        this.giris_tarihi = giris_tarihi;
    }

    public Date getCikis_tarihi() {
        return cikis_tarihi;
    }

    public void setCikis_tarihi(Date cikis_tarihi) {
        this.cikis_tarihi = cikis_tarihi;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public int getKogus_id() {
        return kogus_id;
    }

    public void setKogus_id(int kogus_id) {
        this.kogus_id = kogus_id;
    }

    @Override
    public String toString() {
        return "Mahkum{" + "tc_no=" + tc_no + ", ad=" + ad + ", soyad=" + soyad + ", dogum_tarihi=" + dogum_tarihi + ", ceza_sebebi=" + ceza_sebebi + ", giris_tarihi=" + giris_tarihi + ", cikis_tarihi=" + cikis_tarihi + ", cinsiyet=" + cinsiyet + ", kogus_id=" + kogus_id + '}';
    }

   

}
