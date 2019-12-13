/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.KogusDAO;
import entity.Kogus;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author akbal
 */
@Named
@SessionScoped
public class KogusBean implements Serializable{
    private List<Kogus> klist;
    private KogusDAO kdao;

    public KogusBean() {
       this.klist = new ArrayList<>();
        kdao = new KogusDAO();
    }

    public List<Kogus> getKlist() {
        this.klist = getKdao().readAll();
        return this.klist;
    }

    public void setKlist(List<Kogus> klist) {
        this.klist = klist;
    }


    public KogusDAO getKdao() {
        if (this.kdao == null) {
            this.kdao = new KogusDAO();
        }
        return this.kdao;
    }   
}