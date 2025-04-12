package itu.s6.framework.pfd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PdfService {

    @Autowired
    private PdfGeneratorService pdfGeneratorService;

    public byte[] generatePdf(String id) throws Exception{
        // Logique pour récupérer la réservation par ID et générer le PDF
        // Générez le PDF et retournez le tableau d'octets
        return pdfGeneratorService.generatePdf(id);
    }
}
