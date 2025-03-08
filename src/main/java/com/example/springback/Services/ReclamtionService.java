package com.example.springback.Services;

import com.example.springback.Entite.Reclamation;

import java.util.List;
import java.util.Optional;

public interface ReclamtionService {

    Reclamation createReclamation(Reclamation reclamation);
    List<Reclamation> getReclamationsByClient(Long clientId);
    //Optional<Reclamation> getReclamationById(Long id);
    //Reclamation updateReclamation(Long id, Reclamation reclamation);
    void archiveReclamation(Long id);
	List<Reclamation> getAllReclamation();
}
