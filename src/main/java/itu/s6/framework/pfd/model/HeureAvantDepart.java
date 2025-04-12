package itu.s6.framework.pfd.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "HeureAvantDepart")
public class HeureAvantDepart {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private LocalDate dateConfig;
    
    @Column(nullable = false)
    private LocalTime heure;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public LocalDate getDateConfig() { return dateConfig; }
    public void setDateConfig(LocalDate dateConfig) { this.dateConfig = dateConfig; }
    
    public LocalTime getHeure() { return heure; }
    public void setHeure(LocalTime heure) { this.heure = heure; }
}
