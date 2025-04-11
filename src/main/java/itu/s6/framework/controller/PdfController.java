package itu.s6.framework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import itu.s6.framework.service.PdfService;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/api/reservations")
public class PdfController {

    @Autowired
    private PdfService pdfService;

    
    @GetMapping("/{id}/pdf")
    public ResponseEntity<?> getAllReservations(@PathParam("id") String id) {
        pdfService.generatePdf(id);
        return ResponseEntity.ok().body("Reservation PDF for ID: " + id);
    }
}
