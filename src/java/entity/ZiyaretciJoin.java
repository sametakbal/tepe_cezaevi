/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author akbal
 */
public class ZiyaretciJoin {

    private String ad;
    private String soyad;
    private int ziyaret_sayisi;

    public ZiyaretciJoin(String ad, String soyad, int ziyaret_sayisi) {
        this.ad = ad;
        this.soyad = soyad;
        this.ziyaret_sayisi = ziyaret_sayisi;
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

    public int getZiyaret_sayisi() {
        return ziyaret_sayisi;
    }

    public void setZiyaret_sayisi(int ziyaret_sayisi) {
        this.ziyaret_sayisi = ziyaret_sayisi;
    }

}
