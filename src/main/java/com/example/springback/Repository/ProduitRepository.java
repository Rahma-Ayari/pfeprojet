package com.example.springback.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springback.Entite.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>{

}
