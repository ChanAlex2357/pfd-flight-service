package itu.s6.framework.pfd.service;


import java.io.ByteArrayOutputStream;

import org.springframework.stereotype.Service;

import itu.s6.framework.pfd.model.Reservation;




@Service
public class PdfGeneratorService {

    public byte[] generatePdf(Reservation reservation) throws Exception {
        
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        
        return outputStream.toByteArray();
    }

    public byte[] generatePdf(String id) throws Exception {
        // TODO : inpmlementer la recuperation par l'id
        return new byte[5];
    }
}
