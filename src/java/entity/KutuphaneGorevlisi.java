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
public class KutuphaneGorevlisi {

    private int tc_no;
    private String gorsel;//gorselin türü????
    private String ad;
    private String soyad;
    private Date dogum_tarihi;
    private String parola;
    private int birim_id;
    private int kutuphane_maas;

    public KutuphaneGorevlisi() {
    }

    public int getTc_no() {
        return tc_no;
    }

    public void setTc_no(int tc_no) {
        this.tc_no = tc_no;
    }

    public String getGorsel() {
        return gorsel;
    }

    public void setGorsel(String gorsel) {
        this.gorsel = gorsel;
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

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBirim_id() {
        return birim_id;
    }

    public void setBirim_id(int birim_id) {
        this.birim_id = birim_id;
    }

    public int getKutuphane_maas() {
        return kutuphane_maas;
    }

    public void setKutuphane_maas(int kutuphane_maas) {
        this.kutuphane_maas = kutuphane_maas;
    }

    @Override
    public String toString() {
        return "KutuphaneGorevlisi{" + "tc_no=" + tc_no + ", gorsel=" + gorsel + ", ad=" + ad + ", soyad=" + soyad + ", dogum_tarihi=" + dogum_tarihi + ", parola=" + parola + ", birim_id=" + birim_id + ", kutuphane_maas=" + kutuphane_maas + '}';
    }

}
