package com.example.springback.Services;

import java.util.List;

import com.example.springback.Entite.Produit;

public interface ProduitService {
	Produit createProduit(Produit produit);

	List<Produit> getAllProduit();
	
	Produit getProduitsById(Long id);
	
	Produit updateProduit(Produit produit);
	
	void deleteProduit(Long id);
}
