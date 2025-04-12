package itu.s6.framework.pfd.model;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.math.BigDecimal;

@Entity
@Table(name = "VolHoraire")
public class VolHoraire {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(precision = 15, scale = 2)
    private BigDecimal dureeVol;
    
    private LocalDate dateDepart;
    
    private LocalDate dateArrivee;
    
    private LocalTime heureArrive;
    
    private LocalTime heureDepart;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public BigDecimal getDureeVol() { return dureeVol; }
    public void setDureeVol(BigDecimal dureeVol) { this.dureeVol = dureeVol; }
    
    public LocalDate getDateDepart() { return dateDepart; }
    public void setDateDepart(LocalDate dateDepart) { this.dateDepart = dateDepart; }
    
    public LocalDate getDateArrivee() { return dateArrivee; }
    public void setDateArrivee(LocalDate dateArrivee) { this.dateArrivee = dateArrivee; }
    
    public LocalTime getHeureArrive() { return heureArrive; }
    public void setHeureArrive(LocalTime heureArrive) { this.heureArrive = heureArrive; }
    
    public LocalTime getHeureDepart() { return heureDepart; }
    public void setHeureDepart(LocalTime heureDepart) { this.heureDepart = heureDepart; }
}
