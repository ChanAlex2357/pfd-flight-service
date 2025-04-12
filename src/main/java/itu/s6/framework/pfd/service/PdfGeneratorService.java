package itu.s6.framework.pfd.service;


import java.io.ByteArrayOutputStream;

import org.springframework.stereotype.Service;

import itu.s6.framework.pfd.model.Reservation;




@Service
public class PdfGeneratorService {

    public byte[] generatePdf(Reservation reservation) throws Exception {
        // Document document = new Document();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        // PdfWriter.getInstance(document, outputStream);
        // document.open();
        
        // // Ajoutez le contenu du PDF ici
        // document.add(new Paragraph("Réservation ID: " + reservation.getId()));
        // document.add(new Paragraph("Nom du client: " + reservation.getNomClient()));
        // document.add(new Paragraph("Date de réservation: " + reservation.getDateReservation()));
        // document.add(new Paragraph("Détails: " + reservation.getDetails()));
        
        // document.close();
        return outputStream.toByteArray();
    }

    public byte[] generatePdf(String id) throws Exception {
        // TODO : inpmlementer la recuperation par l'id
        return new byte[5];
    }
}
