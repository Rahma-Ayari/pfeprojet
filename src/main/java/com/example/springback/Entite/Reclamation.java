package com.example.springback.Entite;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import lombok.*;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@NoArgsConstructor  // Cette annotation devrait générer un constructeur sans argument
@AllArgsConstructor
@Table(name = "reclamations")
public class Reclamation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String titre;
    
    @Column(columnDefinition = "TEXT")
    private String description;

    private Long clientId;  // Lien avec le client

    private boolean archive = false;

    private LocalDateTime dateCreation = LocalDateTime.now();

    @Enumerated(EnumType.STRING) // Stocke en tant que texte
    private EtatReclamation etatReclamation = EtatReclamation.EN_COURS;

    // Constructeur personnalisé
    public Reclamation(String titre, String description, Long clientId) {
        this.titre = titre;
        this.description = description;
        this.clientId = clientId;
        this.etatReclamation = EtatReclamation.EN_COURS; // Valeur par défaut
    }
    
    // Ajout explicite du constructeur sans argument (au cas où Lombok ne fonctionne pas)
    public Reclamation() {
    }

    // Les getters et setters suivants sont redondants avec @Getter et @Setter,
    // mais ils sont laissés ici si vous préférez les versions manuelles.
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public boolean isArchive() {
        return archive;
    }

    public void setArchive(boolean archive) {
        this.archive = archive;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }
 // AJOUT : Getter et Setter pour description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

	public EtatReclamation getEtatReclamation() {
		return etatReclamation;
	}

	public void setEtatReclamation(EtatReclamation etatReclamation) {
		this.etatReclamation = etatReclamation;
	}

	

}
