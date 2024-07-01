package com.example.demo.controller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.PdfService;
import com.example.demo.service.TransactionService;
import com.itextpdf.text.DocumentException;

@Controller
@RequestMapping("/pdf")
public class PdfController {

    @Autowired
    PdfService pdfService;

    @Autowired
    TransactionService transactionService;

    @GetMapping("/createPdf/{collectionId}")
    public ResponseEntity<InputStreamResource> getPdf(@PathVariable String collectionId) throws IOException, DocumentException {
    		
    		JSONObject data = transactionService.generateResponse(collectionId);
    		ByteArrayInputStream pdf = pdfService.createPDF(data);
    		
    		HttpHeaders httpHeaders  = new HttpHeaders();
    		httpHeaders.add("Content-Disposition", "inLine; filename= kyzer.pdf");
    		return ResponseEntity.ok()
    				.headers(httpHeaders)
    				.contentType(MediaType.APPLICATION_PDF)
    				.body(new InputStreamResource(pdf)); 
    		
    }
}
