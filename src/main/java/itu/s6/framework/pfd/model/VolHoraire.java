package itu.s6.framework.pfd.model;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.math.BigDecimal;

@Entity
@Table(name = "volhoraire")
public class VolHoraire {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(precision = 15, scale = 2)
    private BigDecimal dureevol;
    
    private LocalDate datedepart;
    
    private LocalDate datearrivee;
    
    private LocalTime heurearrive;
    
    private LocalTime heuredepart;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public BigDecimal getDureevol() { return dureevol; }
    public void setDureevol(BigDecimal dureeVol) { this.dureevol = dureeVol; }
    
    public LocalDate getDatedepart() { return datedepart; }
    public void setDatedepart(LocalDate dateDepart) { this.datedepart = dateDepart; }
    
    public LocalDate getDatearrivee() { return datearrivee; }
    public void setDatearrivee(LocalDate dateArrivee) { this.datearrivee = dateArrivee; }
    
    public LocalTime getHeurearrive() { return heurearrive; }
    public void setHeurearrive(LocalTime heureArrive) { this.heurearrive = heureArrive; }
    
    public LocalTime getHeuredepart() { return heuredepart; }
    public void setHeuredepart(LocalTime heureDepart) { this.heuredepart = heureDepart; }
}
