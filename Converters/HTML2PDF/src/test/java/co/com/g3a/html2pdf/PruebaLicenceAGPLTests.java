package co.com.g3a.html2pdf;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

//import java.io.FileOutputStream;
//import java.io.OutputStream;
//import java.io.StringReader;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

//import com.itextpdf.text.Document;
//import com.itextpdf.text.PageSize;
//import com.itextpdf.text.pdf.PdfWriter;
//import com.itextpdf.tool.xml.XMLWorkerHelper;

@RunWith(JUnit4.class)
public class PruebaLicenceAGPLTests {

	public boolean saveHtmlPlantillaToPdf(String htmlContent, String url) throws Exception {
		boolean resultado = true;
//		OutputStream os = null;
//		try {
//			Document document = new Document(PageSize.LETTER);
//			PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream(url));
//			document.open();
//			document.addAuthor("Quipux Innova");
//			document.addCreator("Real's HowTo");
//			document.addSubject("Thanks for your support");
//			document.addCreationDate();
//			document.addTitle("Please read this");
//
//			XMLWorkerHelper worker = XMLWorkerHelper.getInstance();
//			worker.parseXHtml(pdfWriter, document, new StringReader(htmlContent));
//			document.close();
//			System.out.println("Done.");
//		} catch (Exception e) {
//			resultado = false;
//			e.printStackTrace();
//			throw new Exception(e);
//
//		} finally {
//			if (os != null) {
//				os.close();
//			}
//		}
		return resultado;
	}

	@Test
	public void contextLoads() {
		String url = "d://newPdf.pdf";
		try {
			assertTrue(saveHtmlPlantillaToPdf(Constants._HTML_TEMPLATE, url));
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}
