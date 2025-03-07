package com.example.springback.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springback.Entite.Produit;
import com.example.springback.Repository.ProduitRepository;
import com.example.springback.Services.ProduitService;

@Service
public class ProduitServiceImpl implements ProduitService{

	@Autowired
	ProduitRepository produitrepository;

	@Override
	public Produit createProduit(Produit produit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> getAllProduit() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit getProduitsById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit updateProduit(Produit produit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduit(Long id) {
		// TODO Auto-generated method stub
		
	}
	
}
