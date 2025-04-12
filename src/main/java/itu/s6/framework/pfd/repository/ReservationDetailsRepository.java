package itu.s6.framework.pfd.repository;

import itu.s6.framework.pfd.model.ReservationDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ReservationDetailsRepository extends JpaRepository<ReservationDetails, Long> {
    // Retourne la liste des détails en fonction de l'identifiant de la réservation
    List<ReservationDetails> findByReservationId(Long reservationId);
}
