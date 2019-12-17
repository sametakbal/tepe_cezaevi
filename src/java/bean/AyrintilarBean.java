/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import entity.Mahkum;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author akbal
 */
@Named
@SessionScoped
public class AyrintilarBean implements Serializable {
    
    private Mahkum mahkum;

    public AyrintilarBean() {
        
    }

    public Mahkum getMahkum() {
        return mahkum;
    }

    public String setMahkum(Mahkum mahkum) {
        this.mahkum = mahkum;
        return "ayrintilar";
    }
    

}
