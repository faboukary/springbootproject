/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.alldevservices.annuaire.gestion;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author faboukary
 */
@Repository
public interface IPersonneDao extends JpaRepository<Personne, Long>{
    
    public List<Personne> findPersonneByNom(String nom);
    
    public Personne findPersonneById(Long IdPersonne);
    
    public List<Personne> findPersonneByPrenom(String prenom);
    
    public Personne findPersonneByNumeroCarteIdentite(String numeroCarteIdentite);
    
    public Personne findPersonneByNumeroPassePort(String numeroPassePort);
    
    public List<Personne> findPersonneBySexe(String sexe);
    
    @Query("SELECT p FROM Personne p WHERE p.nationalite = :nationalite")
    public List<Personne> findPersonneByNationalite(@Param("nationalite") Pays nationalite);
    
    public List<Personne> findPersonneByTelephoneMobile(String telephone_mobile);
    
    public List<Personne> findPersonneByTelephoneFixe(String telephone_fixe);
    
    public List<Personne> findPersonneByTelephoneFree(String telephone_free);
    
}
