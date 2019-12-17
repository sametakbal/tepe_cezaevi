/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.MahkumDAO;
import entity.Mahkum;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author akbal
 */
@Named
@SessionScoped
public class MahkumBean implements Serializable {

    private List<Mahkum> mlist;
    private MahkumDAO mdao;
    private Mahkum mahkum;
    private String search;

    public MahkumBean() {
    }

    public String update() {
        this.getMdao().update(this.mahkum);
        clearForm();
        return "mahkum";
    }

    public String updateForm(Mahkum mh) {
        this.mahkum = mh;
        return "mahkum";
    }

    public String clearForm() {
        this.mahkum = new Mahkum();
        return "mahkum";
    }

    public String insert() {
        this.getMdao().create(this.mahkum);
        clearForm();
        return "mahkum";

    }

    public String remove(Mahkum mahkum) {
        this.getMdao().delete(mahkum);
        return "mahkum";
    }

    public List<Mahkum> getMlist() {
        this.mlist = this.getMdao().readAll();
        return mlist;
    }

    public void setMlist(List<Mahkum> mlist) {
        this.mlist = mlist;
    }

    public MahkumDAO getMdao() {
        if (this.mdao == null) {
            this.mdao = new MahkumDAO();
        }
        return mdao;
    }

    public void setMdao(MahkumDAO mdao) {
        this.mdao = mdao;
    }

    public Mahkum getMahkum() {
        if (this.mahkum == null) {
            this.mahkum = new Mahkum();
        }
        return mahkum;
    }

    public void setMahkum(Mahkum mahkum) {
        this.mahkum = mahkum;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

}
