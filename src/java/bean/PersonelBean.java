/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.PersonelDAO;
import entity.Personel;
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
public class PersonelBean implements Serializable {

    private List<Personel> plist;
    private PersonelDAO pdao;
    private Personel personel;

    public PersonelBean() {
    }

    public String update() {
        this.getPdao().update(this.personel);
        clearForm();
        return "personel";
    }

    public String updateForm(Personel pr) {
        this.personel = pr;
        return "personel";
    }

    public String clearForm() {
        this.personel = new Personel();
        return "personel";
    }

    public String insert() {
        this.getPdao().create(this.personel);
        clearForm();
        return "personel";

    }

    public String remove(Personel personel) {
        this.getPdao().delete(personel);
        return "personel";
    }

    public List<Personel> getPlist() {
        this.plist = getPdao().readAll();
        return this.plist;
    }

    public void setPlist(List<Personel> plist) {
        this.plist = plist;
    }

    public PersonelDAO getPdao() {
        if (pdao == null) {
            pdao = new PersonelDAO();
        }
        return pdao;
    }

    public void setPdao(PersonelDAO pdao) {
        this.pdao = pdao;
    }

    public Personel getPersonel() {
        if (this.personel == null) {
            this.personel = new Personel();
        }
        return personel;
    }

    public void setPersonel(Personel personel) {
        this.personel = personel;
    }

}
