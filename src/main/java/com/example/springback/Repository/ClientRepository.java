package com.example.springback.Repository;

import com.example.springback.Entite.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    public Client findByEmail(String email);

	Client findBynom(String nom);
	Client findByEmailAndCodeValidation(String email, String codeValidation);

	

		
	
}
