package itu.s6.framework.pfd.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Avion")
public class Avion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Integer nbplace;
    
    private String libelle;
    
    @ManyToOne
    @JoinColumn(name = "idmodel", nullable = false)
    private ModelAvion model;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public Integer getNbplace() { return nbplace; }
    public void setNbplace(Integer nbPlace) { this.nbplace = nbPlace; }
    
    public String getLibelle() { return libelle; }
    public void setLibelle(String libelle) { this.libelle = libelle; }
    
    public ModelAvion getModel() { return model; }
    public void setModel(ModelAvion model) { this.model = model; }
}
