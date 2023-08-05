/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alldevservices.annuaire.gestion;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author faboukary
 */
@Entity
@Table(name = "PERSONNE")
public class Personne implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "NOM", nullable = false)    
    private String nom;
    
    @Column(name = "PRENOM", nullable = false)
    private String prenom;
    
    @Column(name = "NUMERO_CARTE_IDENTITE", nullable = true)
    private String numeroCarteIdentite;
    
    @Column(name = "NUMERO_PASSE_PORT", nullable = true)
    private String numeroPassePort;
    
    @Column(name = "SEXE", nullable = false)
    private String sexe;
    
    @Column(name = "NATIONALITE", nullable = false)
    private String nationalite;
    
    @Column(name = "TELEPHONE_MOBILE", nullable = false)
    private String telephoneMobile;
    
    @Column(name = "TELEPHONE_FIXE", nullable = false)
    private String telephoneFixe;
    
    @Column(name = "TELEPHONE_FREE", nullable = false)
    private String telephoneFree;

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getTelephoneMobile() {
        return telephoneMobile;
    }

    public void setTelephoneMobile(String telephoneMobile) {
        this.telephoneMobile = telephoneMobile;
    }

    public String getTelephoneFixe() {
        return telephoneFixe;
    }

    public void setTelephoneFixe(String telephoneFixe) {
        this.telephoneFixe = telephoneFixe;
    }

    public String getTelephoneFree() {
        return telephoneFree;
    }

    public void setTelephoneFree(String telephoneFree) {
        this.telephoneFree = telephoneFree;
    }
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumeroCarteIdentite() {
        return numeroCarteIdentite;
    }

    public void setNumeroCarteIdentite(String numeroCarteIdentite) {
        this.numeroCarteIdentite = numeroCarteIdentite;
    }

    public String getNumeroPassePort() {
        return numeroPassePort;
    }

    public void setNumeroPassePort(String numeroPassePort) {
        this.numeroPassePort = numeroPassePort;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getNationalité() {
        return nationalite;
    }

    public void setNationalité(String nationalite) {
        this.nationalite = nationalite;
    }

    public Personne(Long id, String nom, String prenom, String numeroCarteIdentite, String numeroPassePort, String sexe, String nationalite) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.numeroCarteIdentite = numeroCarteIdentite;
        this.numeroPassePort = numeroPassePort;
        this.sexe = sexe;
        this.nationalite = nationalite;
    }

    public Personne() {
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Personne other = (Personne) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.prenom, other.prenom)) {
            return false;
        }
        if (!Objects.equals(this.numeroCarteIdentite, other.numeroCarteIdentite)) {
            return false;
        }
        if (!Objects.equals(this.numeroPassePort, other.numeroPassePort)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (this.sexe != other.sexe) {
            return false;
        }
        return this.nationalite == other.nationalite;
    }

    @Override
    public String toString() {
        return "Personne{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", numeroCarteIdentite=" + numeroCarteIdentite + ", numeroPassePort=" + numeroPassePort + ", sexe=" + sexe + ", nationalit\u00e9=" + nationalite + '}';
    }

    
}
