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
public class Kogus {
    private long kogus_id;
    private long kapasite;
    private String cinsiyet;

    public Kogus() {
    }

    public long getKogus_id() {
        return kogus_id;
    }

    public void setKogus_id(long kogus_id) {
        this.kogus_id = kogus_id;
    }

    public long getKapasite() {
        return kapasite;
    }

    public void setKapasite(long kapasite) {
        this.kapasite = kapasite;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    @Override
    public String toString() {
        return "Kogus{" + "kogus_id=" + kogus_id + ", kapasite=" + kapasite + ", cinsiyet=" + cinsiyet + '}';
    }
    
    
}
