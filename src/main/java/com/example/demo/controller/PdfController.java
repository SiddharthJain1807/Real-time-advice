package com.example.demo.controller;

import java.io.ByteArrayOutputStream;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.PdfService;
import com.example.demo.service.TransactionService;
import com.itextpdf.text.DocumentException;

import java.io.IOException;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.RestController;
@RestController
public class PdfController {
	
	@GetMapping("/about")
	public String getAbout() {
		String str = "hello world";
		return str;
	}
    @Autowired
    PdfService pdfService;

    @Autowired
    TransactionService transactionService;
    
    @GetMapping("/createPdf/{collectionId}")
    public ResponseEntity<byte[]> getPdf(@PathVariable String collectionId) throws IOException, DocumentException {
        JSONObject data = transactionService.generateResponse(collectionId);
        ByteArrayOutputStream pdfStream = pdfService.createPDF(data);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);
        headers.setContentDispositionFormData("attachment", "generated.pdf");

        return ResponseEntity
                .ok()
                .headers(headers)
                .body(pdfStream.toByteArray());
    }

    
}
