package com.example.springback.Repository;

import com.example.springback.Entite.Reclamation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository  // ✅ Ajout de @Repository
public interface ReclamationRepository extends JpaRepository<Reclamation, Long> {  // ✅ Hérite de JpaRepository
    List<Reclamation> findByClientId(Long clientId); // ✅ Assure-toi que cette méthode existe bien
}
