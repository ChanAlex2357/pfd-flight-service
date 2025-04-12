package itu.s6.framework.pfd.model;

import lombok.Data;

@Data
public class Reservation {
    private Long id;
    private String nomClient;
    private String dateReservation;
    private String details;

    // Getters et Setters
    
}
