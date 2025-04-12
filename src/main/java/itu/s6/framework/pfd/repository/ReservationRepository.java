package itu.s6.framework.pfd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import itu.s6.framework.pfd.model.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    // Vous pouvez définir des méthodes personnalisées ici,
    // par exemple : List<Reservation> findByUtilisateurId(Long userId);
}
