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
    private LocalDate datedebut;
    
    @Column(nullable = false)
    private LocalDate datefin;
    
    @ManyToOne
    @JoinColumn(name = "idtypesiege", nullable = false)
    private TypeSiege typeSiege;
    
    @ManyToOne
    @JoinColumn(name = "idvol", nullable = false)
    private Vol vol;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public Integer getNbPlace() { return nbPlace; }
    public void setNbPlace(Integer nbPlace) { this.nbPlace = nbPlace; }
    
    public BigDecimal getPourcentage() { return pourcentage; }
    public void setPourcentage(BigDecimal pourcentage) { this.pourcentage = pourcentage; }
    
    public LocalDate getDatedebut() { return datedebut; }
    public void setDatedebut(LocalDate dateDebut) { this.datedebut = dateDebut; }
    
    public LocalDate getDatefin() { return datefin; }
    public void setDatefin(LocalDate dateFin) { this.datefin = dateFin; }
    
    public TypeSiege getTypeSiege() { return typeSiege; }
    public void setTypeSiege(TypeSiege typeSiege) { this.typeSiege = typeSiege; }
    
    public Vol getVol() { return vol; }
    public void setVol(Vol vol) { this.vol = vol; }
}
