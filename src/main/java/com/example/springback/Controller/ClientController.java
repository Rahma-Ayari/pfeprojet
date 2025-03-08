package com.example.springback.Controller;

import com.example.springback.Entite.Client;
import com.example.springback.Services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
@CrossOrigin("*")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping
    public Client createClient(@RequestBody Client client) {
        return clientService.createClient(client);
    }

    @GetMapping
    public List<Client> getAllClients() {
        return clientService.getAllClient();
    }
    
    @GetMapping("/nom/{nom}")
    public Client getClientByNom(@PathVariable String nom) {
        return clientService.getClientByNom(nom);
    }

    @PutMapping("/validate")
    public Client validateClient(@RequestParam String email, @RequestParam String code) {
        return clientService.validateClient(email, code);
    }
}
