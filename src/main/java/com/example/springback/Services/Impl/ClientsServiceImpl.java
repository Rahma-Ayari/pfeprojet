package com.example.springback.Services.Impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springback.Entite.Client;
import com.example.springback.Repository.ClientRepository;
import com.example.springback.Services.ClientService;
import org.springframework.security.crypto.password.PasswordEncoder;

@Service
public class ClientsServiceImpl implements ClientService {
	@Autowired
	ClientRepository repo;

	
	@Autowired
	private PasswordEncoder encoder;

	@Override
	public Client getClientByNom(String nom) {
		return repo.findBynom(nom);
	}

	@Override
	public Client createClient(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> getAllClient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client getClientsById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client updateClient(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteClient(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	public Client create(Client client) {
        // Générer un code de validation (UUID)
        String code = UUID.randomUUID().toString();
        client.setCodeValidation(code);
       // Client C=this.clientRepository.findByEmail(client.getEmail()).get();
        client.setValidated(false);
        
        // Encoder le mot de passe
        //client.setPassword(encoder.encode(client.getPassword()));
        String pass = encoder.encode(client.getPassword());
		client.setPassword(pass);
        return repo.save(client);
    }
}
