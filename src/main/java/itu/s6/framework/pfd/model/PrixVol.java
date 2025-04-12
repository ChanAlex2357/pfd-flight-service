package itu.s6.framework.pfd.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "PrixVol")
public class PrixVol {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal pu;
    
    @ManyToOne
    @JoinColumn(name = "idTypeSiege", nullable = false)
    private TypeSiege typeSiege;
    
    @ManyToOne
    @JoinColumn(name = "idVol", nullable = false)
    private Vol vol;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public BigDecimal getPu() { return pu; }
    public void setPu(BigDecimal pu) { this.pu = pu; }
    
    public TypeSiege getTypeSiege() { return typeSiege; }
    public void setTypeSiege(TypeSiege typeSiege) { this.typeSiege = typeSiege; }
    
    public Vol getVol() { return vol; }
    public void setVol(Vol vol) { this.vol = vol; }
}
