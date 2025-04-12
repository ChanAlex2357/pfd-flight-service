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
    private LocalDate dateReservation;
    
    @Column(precision = 15, scale = 2)
    private BigDecimal pirxTotal;
    
    @ManyToOne
    @JoinColumn(name = "idEtat", nullable = false)
    private Etat etat;
    
    @ManyToOne
    @JoinColumn(name = "idVol", nullable = false)
    private Vol vol;
    
    @ManyToOne
    @JoinColumn(name = "idUtilisateur", nullable = false)
    private Utilisateur utilisateur;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public LocalDate getDateReservation() { return dateReservation; }
    public void setDateReservation(LocalDate dateReservation) { this.dateReservation = dateReservation; }
    
    public BigDecimal getPirxTotal() { return pirxTotal; }
    public void setPirxTotal(BigDecimal pirxTotal) { this.pirxTotal = pirxTotal; }
    
    public Etat getEtat() { return etat; }
    public void setEtat(Etat etat) { this.etat = etat; }
    
    public Vol getVol() { return vol; }
    public void setVol(Vol vol) { this.vol = vol; }
    
    public Utilisateur getUtilisateur() { return utilisateur; }
    public void setUtilisateur(Utilisateur utilisateur) { this.utilisateur = utilisateur; }
}

