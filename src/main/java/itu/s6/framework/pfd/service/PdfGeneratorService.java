package itu.s6.framework.pfd.service;

import java.io.ByteArrayOutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import com.openhtmltopdf.pdfboxout.PdfRendererBuilder;

import itu.s6.framework.pfd.model.Reservation;
import itu.s6.framework.pfd.model.ReservationDetails;

@Service
public class PdfGeneratorService {
    @Autowired
    private TemplateEngine templateEngine;

    @Autowired
    private ReservationDetailsService reservationDetailsService;

    public byte[] generatePdf(Reservation reservation) throws Exception {
        List<ReservationDetails> details = reservationDetailsService.findByReservationId(reservation.getId());
        
        Context context = new Context();
        context.setVariable("reservation", reservation);
        context.setVariable("details", details);

        String htmlContent = templateEngine.process("reservation-pdf", context);
    
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PdfRendererBuilder builder = new PdfRendererBuilder();

        builder.useFastMode();
        builder.withHtmlContent(htmlContent, null);
        builder.toStream(outputStream);
        builder.run();

        return outputStream.toByteArray();
    }
}
