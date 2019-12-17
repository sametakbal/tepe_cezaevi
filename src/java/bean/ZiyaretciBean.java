/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.ZiyaretciDAO;
import entity.Ziyaretci;
import entity.ZiyaretciJoin;
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
public class ZiyaretciBean implements Serializable {

    private List<Ziyaretci> zlist;
    private List<ZiyaretciJoin> joinlist;
    private ZiyaretciDAO zdao;
    private Ziyaretci ziyaretci;

    public ZiyaretciBean() {
    }

    public String update() {
        this.getZdao().update(this.ziyaretci);
        clearForm();
        return "ziyaretci";
    }

    public String updateForm(Ziyaretci zy) {
        this.ziyaretci = zy;
        return "ziyaretci";
    }

    public String clearForm() {
        this.ziyaretci = new Ziyaretci();
        return "ziyaretci";
    }

    public String insert() {
        this.getZdao().create(this.ziyaretci);
        clearForm();
        return "ziyaretci";

    }

    public String remove(Ziyaretci ziy) {
        this.getZdao().delete(ziy);
        return "ziyaretci";
    }

    public List<Ziyaretci> getZlist() {
        if (zlist==null) {
            zlist = this.getZdao().readAll();
        }
        return zlist;
    }

    public void setZlist(List<Ziyaretci> zlist) {
        this.zlist = zlist;
    }

    public ZiyaretciDAO getZdao() {
        if (zdao == null) {
            zdao = new ZiyaretciDAO();
        }
        return zdao;
    }

    public void setZdao(ZiyaretciDAO zdao) {
        this.zdao = zdao;
    }

    public Ziyaretci getZiyaretci() {
        if (this.ziyaretci == null) {
            this.ziyaretci = new Ziyaretci();
        }
        return ziyaretci;
    }

    public void setZiyaretci(Ziyaretci ziyaretci) {
         if (this.zdao == null) {
            this.zdao = new ZiyaretciDAO();
        }
        this.ziyaretci = ziyaretci;
    }

    public List<ZiyaretciJoin> getJoinlist() {
        joinlist = getZdao().full_outer_join();
        return joinlist;
    }

    public void setJoinlist(List<ZiyaretciJoin> joinlist) {
        this.joinlist = joinlist;
    }
}