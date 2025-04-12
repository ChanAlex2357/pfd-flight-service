package itu.s6.framework.pfd.model;

import jakarta.persistence.*;

@Entity
@Table(name = "modelavion")
public class ModelAvion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, length = 255)
    private String val;
    
    @Column(length = 255)
    private String desce;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getVal() { return val; }
    public void setVal(String val) { this.val = val; }
    
    public String getDesce() { return desce; }
    public void setDesce(String desce) { this.desce = desce; }
}

