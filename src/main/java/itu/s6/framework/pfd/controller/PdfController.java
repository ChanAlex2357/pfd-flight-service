package itu.s6.framework.pfd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import itu.s6.framework.pfd.service.PdfService;



@Controller
@RequestMapping("/api/reservations")
public class PdfController {

    @Autowired
    private PdfService pdfService;

    @GetMapping("/pdf/{id}")
    public ResponseEntity<?> getReservationPdf(@PathVariable("id") Long id) {
        System.out.println(
             "HELLO"
        );
        // Générez le PDF ici
        try {
            byte[] pdfBytes = pdfService.generatePdf(id);
            // Créez une réponse avec le PDF
            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=reservation_" + id + ".pdf")
                    .contentType(MediaType.APPLICATION_PDF)
                    .body(pdfBytes);
            
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Erreur generation de pdf pour la reservation : "+id+"\n"+e.getMessage());
        }
        
    }
}
