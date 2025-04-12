package itu.s6.framework.pfd.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "reservationdetails")
public class ReservationDetails {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(precision = 15, scale = 2)
    private BigDecimal prix;
    
    @ManyToOne
    @JoinColumn(name = "idpromotion")
    private Promotion promotion;
    
    @ManyToOne
    @JoinColumn(name = "idsiege", nullable = false)
    private Siege siege;
    
    @ManyToOne
    @JoinColumn(name = "idreservation", nullable = false )
    private Reservation reservation;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public BigDecimal getPrix() { return prix; }
    public void setPrix(BigDecimal prix) { this.prix = prix; }
    
    public Promotion getPromotion() { return promotion; }
    public void setPromotion(Promotion promotion) { this.promotion = promotion; }
    
    public Siege getSiege() { return siege; }
    public void setSiege(Siege siege) { this.siege = siege; }
    
    public Reservation getReservation() { return reservation; }
    public void setReservation(Reservation reservation) { this.reservation = reservation; }
}
