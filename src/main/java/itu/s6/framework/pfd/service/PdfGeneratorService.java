package itu.s6.framework.pfd.service;

import java.io.ByteArrayOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import com.openhtmltopdf.pdfboxout.PdfRendererBuilder;

import itu.s6.framework.pfd.model.Reservation;

@Service
public class PdfGeneratorService {

    @Autowired
    private TemplateEngine templateEngine;

    public byte[] generatePdf(Reservation reservation) throws Exception {
        // 1. Créer un contexte Thymeleaf avec les données
        Context context = new Context();
        context.setVariable("reservation", reservation);

        // 2. Générer le HTML depuis le template
        String htmlContent = templateEngine.process("reservation-pdf", context);

        // 3. Convertir le HTML en PDF
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PdfRendererBuilder builder = new PdfRendererBuilder();

        builder.useFastMode();
        builder.withHtmlContent(htmlContent, null); // pas besoin de base URI
        builder.toStream(outputStream);
        builder.run();

        return outputStream.toByteArray();
    }

    public byte[] generatePdf(String idReservation) throws Exception {
        Reservation res = new Reservation();            // Recuperation de la reservation associer a l'id

        return this.generatePdf(res);
    }
}
