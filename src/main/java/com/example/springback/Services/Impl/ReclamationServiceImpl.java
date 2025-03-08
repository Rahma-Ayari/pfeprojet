package com.example.springback.Services.Impl;

import com.example.springback.Entite.Client;
import com.example.springback.Entite.Reclamation;
import com.example.springback.Repository.ReclamationRepository;
import com.example.springback.Services.ReclamtionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReclamationServiceImpl implements ReclamtionService {

    @Autowired
    private ReclamationRepository reclamationRepository;

    @Override
    public Reclamation createReclamation(Reclamation reclamation) {
        
        return reclamationRepository.save(reclamation);
    }
    
    @Override
    public void archiveReclamation(Long id) {
        reclamationRepository.findById(id).ifPresent(reclamation -> {
            reclamation.setArchive(true);
            reclamationRepository.save(reclamation);
        });}
    
    @Override
    public List<Reclamation> getAllReclamation() {
        // Fetch all clients from the repository
        return reclamationRepository.findAll();  // Assuming `findAll()` is available in your repository
    }
    
    
    @Override
    public List<Reclamation> getReclamationsByClient(Long clientId) {
        return reclamationRepository.findByClientId(clientId);
    }
}


    /*@Override
    public Optional<Reclamation> getReclamationById(Long id) {
        return reclamationRepository.findById(id);
    }*/

    /*@Override
    public Reclamation updateReclamation(Long id, Reclamation reclamation) {
        return reclamationRepository.findById(id).map(existingRec -> {
            existingRec.setTitre(reclamation.getTitre());
            existingRec.setDescription(reclamation.getDescription());
            existingRec.setEtatReclamation(reclamation.getEtatReclamation());
            return reclamationRepository.save(existingRec);
        }).orElseThrow(() -> new RuntimeException("Réclamation non trouvée avec l'id " + id));
    }*/



