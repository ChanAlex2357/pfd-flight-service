package itu.s6.framework.pfd.model;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "Vol")
public class Vol {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "idHoraire", nullable = false)
    private VolHoraire horaire;
    
    @ManyToOne
    @JoinColumn(name = "idHeureAvantDepart", nullable = false)
    private HeureAvantDepart heureAvantDepart;
    
    @ManyToOne
    @JoinColumn(name = "idAvion", nullable = false)
    private Avion avion;
    
    // Ces colonnes correspondent aux clés étrangères sur Ville
    @ManyToOne
    @JoinColumn(name = "idVilleDepart", nullable = false)
    private Ville villeDepart;
    
    @ManyToOne
    @JoinColumn(name = "idVilleArrivee", nullable = false)
    private Ville villeArrivee;
    
    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public VolHoraire getHoraire() { return horaire; }
    public void setHoraire(VolHoraire horaire) { this.horaire = horaire; }
    
    public HeureAvantDepart getHeureAvantDepart() { return heureAvantDepart; }
    public void setHeureAvantDepart(HeureAvantDepart heureAvantDepart) { this.heureAvantDepart = heureAvantDepart; }
    
    public Avion getAvion() { return avion; }
    public void setAvion(Avion avion) { this.avion = avion; }
    
    public Ville getVilleDepart() { return villeDepart; }
    public void setVilleDepart(Ville villeDepart) { this.villeDepart = villeDepart; }
    
    public Ville getVilleArrivee() { return villeArrivee; }
    public void setVilleArrivee(Ville villeArrivee) { this.villeArrivee = villeArrivee; }
}
