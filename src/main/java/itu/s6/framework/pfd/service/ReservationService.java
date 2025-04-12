package itu.s6.framework.pfd.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import itu.s6.framework.pfd.model.Reservation;
import itu.s6.framework.pfd.repository.ReservationRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService  {

    private final ReservationRepository reservationRepository;

    @Autowired
    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }

    public Optional<Reservation> findById(Long id) {
        return reservationRepository.findById(id);
    }

    public Reservation save(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public Reservation update(Reservation reservation) {
        // Vous pouvez ajouter une vérification ici, par exemple vérifier que la réservation existe
        return reservationRepository.save(reservation);
    }

    public void deleteById(Long id) {
        reservationRepository.deleteById(id);
    }
}
