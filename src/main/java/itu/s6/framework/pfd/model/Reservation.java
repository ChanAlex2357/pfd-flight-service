package itu.s6.framework.pfd.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.math.BigDecimal;

@Entity
@Table(name = "Reservation")
public class Reservation {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private LocalDate datereservation;
    
    @Column(precision = 15, scale = 2)
    private BigDecimal pirxtotal;
    
    @ManyToOne
    @JoinColumn(name = "idetat", nullable = false)
    private Etat etat;
    
    @ManyToOne
    @JoinColumn(name = "idvol", nullable = false)
    private Vol vol;
    
    @ManyToOne
    @JoinColumn(name = "idutilisateur", nullable = false)
    private Utilisateur utilisateur;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public LocalDate getDatereservation() { return datereservation; }
    public void setDatereservation(LocalDate dateReservation) { this.datereservation = dateReservation; }
    
    public BigDecimal getPirxtotal() { return pirxtotal; }
    public void setPirxtotal(BigDecimal pirxTotal) { this.pirxtotal = pirxTotal; }
    
    public Etat getEtat() { return etat; }
    public void setEtat(Etat etat) { this.etat = etat; }
    
    public Vol getVol() { return vol; }
    public void setVol(Vol vol) { this.vol = vol; }
    
    public Utilisateur getUtilisateur() { return utilisateur; }
    public void setUtilisateur(Utilisateur utilisateur) { this.utilisateur = utilisateur; }
}

