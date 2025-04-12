package itu.s6.framework.pfd.model;

import jakarta.persistence.*;

@Entity
@Table(name = "contactutilisateur")
public class ContactUtilisateur {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, length = 255)
    private String numero;
    
    @ManyToOne
    @JoinColumn(name = "idutilisateur", nullable = false)
    private Utilisateur utilisateur;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    
    public Utilisateur getUtilisateur() { return utilisateur; }
    public void setUtilisateur(Utilisateur utilisateur) { this.utilisateur = utilisateur; }
}
