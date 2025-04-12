package itu.s6.framework.pfd.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.math.BigDecimal;

@Entity
@Table(name = "Promotionn")
public class Promotion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Integer nbPlace;
    
    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal pourcentage;
    
    @Column(nullable = false)
    private LocalDate dateDebut;
    
    @Column(nullable = false)
    private LocalDate dateFin;
    
    @ManyToOne
    @JoinColumn(name = "idTypeSiege", nullable = false)
    private TypeSiege typeSiege;
    
    @ManyToOne
    @JoinColumn(name = "idVol", nullable = false)
    private Vol vol;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public Integer getNbPlace() { return nbPlace; }
    public void setNbPlace(Integer nbPlace) { this.nbPlace = nbPlace; }
    
    public BigDecimal getPourcentage() { return pourcentage; }
    public void setPourcentage(BigDecimal pourcentage) { this.pourcentage = pourcentage; }
    
    public LocalDate getDateDebut() { return dateDebut; }
    public void setDateDebut(LocalDate dateDebut) { this.dateDebut = dateDebut; }
    
    public LocalDate getDateFin() { return dateFin; }
    public void setDateFin(LocalDate dateFin) { this.dateFin = dateFin; }
    
    public TypeSiege getTypeSiege() { return typeSiege; }
    public void setTypeSiege(TypeSiege typeSiege) { this.typeSiege = typeSiege; }
    
    public Vol getVol() { return vol; }
    public void setVol(Vol vol) { this.vol = vol; }
}
