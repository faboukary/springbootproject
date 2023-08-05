/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.alldevservices.annuaire.gestion;

import java.util.List;

/**
 *
 * @author faboukary
 */
public interface IPersonneService {
    
    public Personne savePersonne(Personne personne);
    
    public Personne updatePersonne(Personne personne);
    
    public void deletePersonne(Long PersonneId);
    
    public List<Personne> findAll();
    
    public Personne findPersonneById(Long IdPersonne);
    
    public List<Personne> findPersonneByNom(String nom);
    
    public List<Personne> findPersonneByPrenom(String prenom);
    
    public Personne findPersonneByNumeroCarteIdentite(String numeroCarteIdentite);
    
    public Personne findPersonneByNumeroPassePort(String numeroPassePort);
    
    public List<Personne> findPersonneBySexe(String sexe);
    
    public List<Personne> findPersonneByNationalite(Pays IdPays);
    
    public List<Personne> findPersonneByTelephoneMobile(String telephoneMobile);
    
    public List<Personne> findPersonneByTelephoneFixe(String telephoneFixe);
    
    public List<Personne> findPersonneByTelephoneFree(String telephoneFree);
    
}
