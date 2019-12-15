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
public class MahkumZiyaret {

    private int mahkum_id;
    private int ziyaretci_id;
    private Date tarih;

    public MahkumZiyaret() {
    }

    public int getMahkum_id() {
        return mahkum_id;
    }

    public void setMahkum_id(int mahkum_id) {
        this.mahkum_id = mahkum_id;
    }

    public int getZiyaretci_id() {
        return ziyaretci_id;
    }

    public void setZiyaretci_id(int ziyaretci_id) {
        this.ziyaretci_id = ziyaretci_id;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    @Override
    public String toString() {
        return "MahkumZiyaret{" + "mahkum_id=" + mahkum_id + ", ziyaretci_id=" + ziyaretci_id + ", tarih=" + tarih + '}';
    }

}
