package com.example.springback.Controller;

import com.example.springback.Entite.Client;
import com.example.springback.Entite.Reclamation;
import com.example.springback.Services.ReclamtionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/reclamations")  // URL de base pour ce contrôleur
@CrossOrigin(origins = "*") // Autorise les requêtes depuis le frontend
public class ReclamationController {

    @Autowired
    private ReclamtionService reclamationService;
    
    @GetMapping
    public List<Reclamation> getAllReclamations() {
        return reclamationService.getAllReclamation();
    }

    @PostMapping("/create")
    public ResponseEntity<Reclamation> createReclamation(@RequestBody Reclamation reclamation) {
        Reclamation newReclamation = reclamationService.createReclamation(reclamation);
        return ResponseEntity.ok(newReclamation);
    }

    // ✅ Obtenir toutes les réclamations d'un client
    @GetMapping("/client/{clientId}")
    public ResponseEntity<List<Reclamation>> getReclamationsByClient(@PathVariable Long clientId) {
        List<Reclamation> reclamations = reclamationService.getReclamationsByClient(clientId);
        return ResponseEntity.ok(reclamations);
    }
    
    
    @PutMapping("/archive/{id}")
    public ResponseEntity<String> archiveReclamation(@PathVariable Long id) {
        reclamationService.archiveReclamation(id);
        return ResponseEntity.ok("Réclamation archivée avec succès !");
    }

    /* ✅ Obtenir une réclamation par son ID
    @GetMapping("/{id}")
    public ResponseEntity<Reclamation> getReclamationById(@PathVariable Long id) {
        Optional<Reclamation> reclamation = reclamationService.getReclamationById(id);
        return reclamation.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }*/

    /* ✅ Modifier une réclamation existante
    @PutMapping("/update/{id}")
    public ResponseEntity<Reclamation> updateReclamation(@PathVariable Long id, @RequestBody Reclamation reclamation) {
        try {
            Reclamation updatedReclamation = reclamationService.updateReclamation(id, reclamation);
            return ResponseEntity.ok(updatedReclamation);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }*/

    
    

    /* ✅ Supprimer une réclamation (optionnel)
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteReclamation(@PathVariable Long id) {
        Optional<Reclamation> reclamation = reclamationService.getReclamationById(id);
        if (reclamation.isPresent()) {
            reclamationService.archiveReclamation(id);  // Plutôt que de supprimer, on peut archiver
            return ResponseEntity.ok("Réclamation supprimée (archivée) !");
        } else {
            return ResponseEntity.notFound().build();
        }
    }*/
}
