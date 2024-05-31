package com.example.demo.service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.HeaderFooter;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfWriter;

@Service
public class PdfService {
	
	private Logger logger = LoggerFactory.getLogger(PdfService.class);
	
	public ByteArrayInputStream createPdf() {
		
		logger.info("Create PDF has started: ");
		
		String title ="Welcome to Tech Radar Nexus";
		String content=" We provide educational service related to Technology advancements";
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		
		Document document = new Document();
		
		PdfWriter.getInstance(document, out);
		
        HeaderFooter footer = new HeaderFooter(true, new Phrase(" Header Footer"));
        footer.setAlignment(Element.ALIGN_CENTER);
        footer.setBorderWidthBottom(0);
        document.setFooter(footer);
		
		document.open();
		
		Font titleFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD,20);
		Paragraph titlePara = new Paragraph(title,titleFont);
		titlePara.setAlignment(Element.ALIGN_CENTER);
		document.add(titlePara);
		
		Font contentFont = FontFactory.getFont(FontFactory.HELVETICA,15);
		Paragraph paragraph = new Paragraph(content,contentFont);
		paragraph.add(new Chunk("Thsi text was added after the paragraph was created"));
		document.add(paragraph);
		
		document.close();
		
		return new ByteArrayInputStream(out.toByteArray());
	}
}
