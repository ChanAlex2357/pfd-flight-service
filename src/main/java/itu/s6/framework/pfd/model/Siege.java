package itu.s6.framework.pfd.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Siege")
public class Siege {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Integer numero;
    
    @ManyToOne
    @JoinColumn(name = "idAvion", nullable = false)
    private Avion avion;
    
    @ManyToOne
    @JoinColumn(name = "idTypeSiege", nullable = false)
    private TypeSiege typeSiege;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public Integer getNumero() { return numero; }
    public void setNumero(Integer numero) { this.numero = numero; }
    
    public Avion getAvion() { return avion; }
    public void setAvion(Avion avion) { this.avion = avion; }
    
    public TypeSiege getTypeSiege() { return typeSiege; }
    public void setTypeSiege(TypeSiege typeSiege) { this.typeSiege = typeSiege; }
}
