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
public class Birimler {

    private int birim_id;
    private String birim;

    public Birimler() {
    }

    public int getBirim_id() {
        return birim_id;
    }

    public void setBirim_id(int birim_id) {
        this.birim_id = birim_id;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    @Override
    public String toString() {
        return "Birimler{" + "birim_id=" + birim_id + ", birim=" + birim + '}';
    }

}
