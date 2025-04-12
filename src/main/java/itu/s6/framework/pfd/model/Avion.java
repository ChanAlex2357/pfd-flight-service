package itu.s6.framework.pfd.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Avion")
public class Avion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Integer nbPlace;
    
    private String libelle;
    
    @ManyToOne
    @JoinColumn(name = "idModel", nullable = false)
    private ModelAvion model;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public Integer getNbPlace() { return nbPlace; }
    public void setNbPlace(Integer nbPlace) { this.nbPlace = nbPlace; }
    
    public String getLibelle() { return libelle; }
    public void setLibelle(String libelle) { this.libelle = libelle; }
    
    public ModelAvion getModel() { return model; }
    public void setModel(ModelAvion model) { this.model = model; }
}
