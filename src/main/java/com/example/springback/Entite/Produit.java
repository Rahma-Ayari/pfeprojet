package com.example.springback.Entite;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idProduit;
	private String nomProduit;
	
	public Long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	


	public Produit(Long idProduit, String nomProduit) {
		super();
		this.idProduit = idProduit;
		this.nomProduit = nomProduit;
		
	}
	public Produit() {
		super();
	}
	
	
	
}
