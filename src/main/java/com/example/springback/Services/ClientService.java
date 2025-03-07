package com.example.springback.Services;

import com.example.springback.Entite.Client;
import com.example.springback.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


public interface ClientService {

	Client getClientByNom(String nom);
	Client createClient(Client client);
	Client create(Client client);
	List<Client> getAllClient();
	
	Client getClientsById(Long id);
	
	Client updateClient(Client client);
	
	void deleteClient(Long id);
	
}
