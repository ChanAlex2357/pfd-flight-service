package itu.s6.framework.service;

import org.springframework.stereotype.Service;

@Service
public class PdfService {
    
    public String generatePdf(String reservationId) {
        return "PDF generated for reservation ID: " + reservationId;
    }
}
