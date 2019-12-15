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
public class KogusBean implements Serializable {

    private List<Kogus> klist;
    private KogusDAO kdao;
    private Kogus kogus;

    public KogusBean() {
        this.klist = new ArrayList<>();
        kdao = new KogusDAO();
    }
    public String update(){
        this.getKdao().update(this.kogus);
        clearForm();
         return "index";
    }
    
    public String updateForm(Kogus kg){
        this.kogus = kg;
        return "index";
    }
    public String clearForm(){
        this.kogus = new Kogus();
        return "index";
    }
    
    public String insert(){
        this.getKdao().create(this.kogus);
        clearForm();
         return "index";

    }
    public String remove(Kogus kogus){
        this.getKdao().delete(kogus);
        return "index";
    }

    public List<Kogus> getKlist() {
        this.klist = getKdao().readAll();
        return this.klist;
    }

    public void setKlist(List<Kogus> klist) {
        this.klist = klist;
    }

    public Kogus getKogus() {
        if (this.kogus == null) {
            this.kogus = new Kogus();
        }
        return kogus;
    }

    public void setKogus(Kogus kogus) {
        this.kogus = kogus;
    }

    public KogusDAO getKdao() {
        if (this.kdao == null) {
            this.kdao = new KogusDAO();
        }
        return this.kdao;
    }
}
