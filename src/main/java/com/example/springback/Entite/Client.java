package com.example.springback.Entite;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String prenom;
    private String nom;
    private String email;
    private String cin;
    
    private String metier;

    private String lieuDeTravail;
    
    private String password;
    
    // Code de validation généré lors de l'inscription
    private String codeValidation;
    
    // Indique si le compte est validé (true = validé, false = non validé)
    private boolean validated = false;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getMetier() {
		return metier;
	}

	public void setMetier(String metier) {
		this.metier = metier;
	}

	public String getLieuDeTravail() {
		return lieuDeTravail;
	}

	public void setLieuDeTravail(String lieuDeTravail) {
		this.lieuDeTravail = lieuDeTravail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCodeValidation() {
		return codeValidation;
	}

	public void setCodeValidation(String codeValidation) {
		this.codeValidation = codeValidation;
	}

	public boolean isValidated() {
		return validated;
	}

	public void setValidated(boolean validated) {
		this.validated = validated;
	}

	

}