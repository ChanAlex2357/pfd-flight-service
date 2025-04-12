package itu.s6.framework.pfd.service;


import itu.s6.framework.pfd.model.ReservationDetails;
import itu.s6.framework.pfd.repository.ReservationDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class  ReservationDetailsService {

    private final ReservationDetailsRepository repository;

    @Autowired
    public ReservationDetailsService(ReservationDetailsRepository repository) {
        this.repository = repository;
    }

    public List<ReservationDetails> findAll() {
        return repository.findAll();
    }

    public Optional<ReservationDetails> findById(Long id) {
        return repository.findById(id);
    }

    public ReservationDetails save(ReservationDetails details) {
        return repository.save(details);
    }

    public ReservationDetails update(ReservationDetails details) {
        // Vous pouvez ajouter ici une logique de vérification avant de mettre à jour
        return repository.save(details);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public List<ReservationDetails> findByReservationId(Long reservationId) {
        return repository.findByReservationId(reservationId);
    }
}
