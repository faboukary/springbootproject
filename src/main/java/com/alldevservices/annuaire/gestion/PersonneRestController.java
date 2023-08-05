/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alldevservices.annuaire.gestion;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author faboukary
 */

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/personne/api")
public class PersonneRestController {
    
    @Autowired
    private IPersonneServiceImpl personneService;
    
    @Autowired
    private JavaMailSender javaMailSender;
    
    @GetMapping("/personnes")
    public ResponseEntity<List<Personne>> getPersonnes(){
        List<Personne> person = personneService.findAll();
        
        return new ResponseEntity<List<Personne>>(person,HttpStatus.OK);
    } 
              
    @PutMapping("/personne/{IdPersonne}")
    public ResponseEntity<Personne> updatePersonne(@RequestBody Personne newPersonne, @PathVariable Long IdPersonne){
        Personne oldPersonne =  personneService.findPersonneById(IdPersonne);
        
        oldPersonne.setNom(newPersonne.getNom());
        oldPersonne.setPrenom(newPersonne.getPrenom());
        oldPersonne.setSexe(newPersonne.getSexe());
        oldPersonne.setNationalite(newPersonne.getNationalite());
        oldPersonne.setNumeroCarteIdentite(newPersonne.getNumeroCarteIdentite());
        oldPersonne.setNumeroPassePort(newPersonne.getNumeroPassePort());
        oldPersonne.setTelephoneMobile(newPersonne.getTelephoneMobile());
        oldPersonne.setTelephoneFixe(newPersonne.getTelephoneFixe());
        oldPersonne.setTelephoneFree(newPersonne.getTelephoneFree());
           
        Personne person = personneService.updatePersonne(oldPersonne);
         return new ResponseEntity<Personne>(person,HttpStatus.OK);
    }
    
    @DeleteMapping("/personne/{IdPersonne}")
    public void deletePersonne(@PathVariable Long IdPersonne){
        Personne oldPersonne =  personneService.findPersonneById(IdPersonne);
        personneService.deletePersonne(oldPersonne.getId());
    }
    
    @PostMapping("/personne")
    public ResponseEntity<Personne> addPersonne(@RequestBody Personne newPersonne){
        Personne person = personneService.savePersonne(newPersonne);
        return new ResponseEntity<Personne>(person,HttpStatus.OK);
    }
    
    @GetMapping("/personne/id/{IdPersonne}")
    public ResponseEntity<Personne> getPersonneById(@PathVariable Long IdPersonne){        
        Personne person = personneService.findPersonneById(IdPersonne);
        return new ResponseEntity<Personne>(person,HttpStatus.OK);
    }
    
    @GetMapping("/personne/nom/{NomPersonne}")
    public ResponseEntity<List<Personne>> getPersonnesByNom(@PathVariable String NomPersonne){ 
                       
        List<Personne> person = personneService.findPersonneByNom(NomPersonne);
        return new ResponseEntity<List<Personne>>(person,HttpStatus.OK);
    }
 /*   
    @PostMapping("/sendmail")
    public ResponseEntity<Boolean> sendMail() throws MailException
    {
                
        try {
            
            SimpleMailMessage mail = new SimpleMailMessage();
        
            mail.setFrom("fkoulibaly2016@gmail.com");
            mail.setTo("fkoulibaly2016@gmail.com");
            mail.setSentDate(new Date());
            mail.setSubject("Test send Mail with Java in Spring Boot");
            mail.setText("Hello world !, Lets starting with Spring boot framework programming.");
        
            javaMailSender.send(mail);
            
        }catch(MailException e){
            e.printStackTrace();
            return new ResponseEntity<Boolean>(false, HttpStatus.FORBIDDEN);
        }
        return new ResponseEntity<Boolean>(true, HttpStatus.OK);
    }

*/
    
}
