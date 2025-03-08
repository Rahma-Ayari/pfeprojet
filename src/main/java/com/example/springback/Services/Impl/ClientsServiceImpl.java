package com.example.springback.Services.Impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springback.Entite.Client;
import com.example.springback.Repository.ClientRepository;
import com.example.springback.Services.ClientService;

@Service
public class ClientsServiceImpl implements ClientService {
    @Autowired
    ClientRepository repo;

    // Uncomment and configure PasswordEncoder if needed for password handling
    // @Autowired
    // public PasswordEncoder encoder;

    @Override
    public Client getClientByNom(String nom) {
        // Fetch client by their name (nom)
        Client client =repo.findBynom(nom); 
        return repo.save(client);
    }

    @Override
    public Client createClient(Client client) {
        // Generate a validation code (UUID)
        String code = UUID.randomUUID().toString();
        client.setCodeValidation(code);
        
        // Set client status as not validated
        client.setValidated(false);

        // If needed, encode the password
        // client.setPassword(encoder.encode(client.getPassword()));
        
        // Save the client in the repository
        return repo.save(client);
    }

    @Override
    public List<Client> getAllClient() {
        // Fetch all clients from the repository
        return repo.findAll();  // Assuming `findAll()` is available in your repository
    }

    @Override
    public Client getClientsById(Long id) {
        // Fetch a client by their ID
        Optional<Client> clientOpt = repo.findById(id);
        return clientOpt.orElse(null);  // Return null if not found, or handle the absence more gracefully
    }

    @Override
    public Client updateClient(Client client) {
        // Ensure the client exists in the database before updating
        if (repo.existsById(client.getId())) {
            return repo.save(client);  // Save the updated client
        }
        return null;  // Return null if the client doesn't exist
    }

    @Override
    public void deleteClient(Long id) {
        // Delete a client by their ID
        if (repo.existsById(id)) {
            repo.deleteById(id);  // Delete the client if it exists
        }
    }

    @Override
    public Client validateClient(String email, String code) {
        // Validate the client based on email and validation code
        Client client = repo.findByEmailAndCodeValidation(email, code); // Assuming a custom query method exists
        if (client != null) {
            client.setValidated(true);  // Set validated flag to true
            return repo.save(client);  // Save the client after validation
        }
        return null;  // Return null if the client was not found or validation failed
    }
}
