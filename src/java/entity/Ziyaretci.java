/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author ezgih
 */
public class Ziyaretci {

    private long ziyaretci_id;
    private String ad;
    private String soyad;

    public Ziyaretci() {
    }

    public long getZiyaretci_id() {
        return ziyaretci_id;
    }

    public void setZiyaretci_id(long ziyaretci_id) {
        this.ziyaretci_id = ziyaretci_id;
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

    @Override
    public String toString() {
        return "Ziyaretci{" + "ziyaretci_id=" + ziyaretci_id + ", ad=" + ad + ", soyad=" + soyad + '}';
    }

}
