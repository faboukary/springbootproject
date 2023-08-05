/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alldevservices.annuaire.gestion;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author faboukary
 */
@Service(value = "personneService")
@Transactional
public class IPersonneServiceImpl implements IPersonneService {
    
    @Autowired
    private IPersonneDao personneDao;

    @Override
    public Personne savePersonne(Personne personne) {
        return personneDao.save(personne);
    }

    @Override
    public Personne updatePersonne(Personne personne) {
        return personneDao.save(personne);
    }

    @Override
    public void deletePersonne(Long PersonneId) {
        personneDao.deleteById(PersonneId);
    }

    @Override
    public List<Personne> findPersonneByNom(String nom) {
        return personneDao.findPersonneByNom(nom);
    }

    @Override
    public List<Personne> findPersonneByPrenom(String prenom) {
        return personneDao.findPersonneByPrenom(prenom);
    }

    @Override
    public Personne findPersonneByNumeroCarteIdentite(String numeroCarteIdentite) {
        return personneDao.findPersonneByNumeroCarteIdentite(numeroCarteIdentite);
    }

    @Override
    public Personne findPersonneByNumeroPassePort(String numeroPassePort) {
        return personneDao.findPersonneByNumeroPassePort(numeroPassePort);
    }

    @Override
    public List<Personne> findPersonneBySexe(String sexe) {
        return personneDao.findPersonneBySexe(sexe);
    }

    @Override
    public List<Personne> findPersonneByNationalite(Pays IdPays) {
        return personneDao.findPersonneByNationalite(IdPays);
    }

    @Override
    public List<Personne> findPersonneByTelephoneMobile(String telephoneMobile) {
        return personneDao.findPersonneByTelephoneMobile(telephoneMobile);
    }

    @Override
    public List<Personne> findPersonneByTelephoneFixe(String telephoneFixe) {
        return personneDao.findPersonneByTelephoneFixe(telephoneFixe);
    }

    @Override
    public List<Personne> findPersonneByTelephoneFree(String telephoneFree) {
        return personneDao.findPersonneByTelephoneFree(telephoneFree);
    }

    @Override
    public List<Personne> findAll() {
        return personneDao.findAll();
    }

    @Override
    public Personne findPersonneById(Long IdPersonne) {
        return personneDao.findPersonneById(IdPersonne);
    }
    
    
    
}
