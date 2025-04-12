package itu.s6.framework.pfd.model;
import jakarta.persistence.*;

@Entity
@Table(name = "Ville")
public class Ville {
    
    @Id
    @Column(length = 255)
    private String id;
    
    @Column(nullable = false, length = 255)
    private String nom;

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
}
