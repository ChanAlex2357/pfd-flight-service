package itu.s6.framework.pfd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import itu.s6.framework.pfd.model.Reservation;

@Service
public class PdfService {

    @Autowired
    private PdfGeneratorService pdfGeneratorService;

    @Autowired
    private ReservationService reservationService;

    public byte[] generatePdf(Long id) throws Exception{
        Reservation reservation =  reservationService.findById(id).get();
        return pdfGeneratorService.generatePdf(reservation);
    }
}
