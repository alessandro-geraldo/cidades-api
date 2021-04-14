package com.geraldo.cities1.country;

import org.hibernate.annotations.ValueGenerationType;

import javax.persistence.*;

@Entity
@Table(name = "pais")
public class Country {

    @Id
    private Long id;
    @Column(name = "nome")
    private String name;

    @Column(name = "nome_pt")
    private String NamePt;

    @Column(name = "sigla")
    private String sigla;

    @Column(name = "bacen")
    private int bacen;

    public Country(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamePt() {
        return NamePt;
    }

    public void setNamePt(String namePt) {
        NamePt = namePt;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getBacen() {
        return bacen;
    }

    public void setBacen(int bacen) {
        this.bacen = bacen;
    }
}
