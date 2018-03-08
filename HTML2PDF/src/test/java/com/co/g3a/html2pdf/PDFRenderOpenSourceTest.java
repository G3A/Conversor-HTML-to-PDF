package com.co.g3a.html2pdf;


import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.w3c.dom.Document;
import org.xhtmlrenderer.pdf.ITextOutputDevice;
import org.xhtmlrenderer.pdf.ITextRenderer;
import org.xhtmlrenderer.pdf.ITextUserAgent;
import org.xhtmlrenderer.resource.XMLResource;
import org.xml.sax.InputSource;

import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.BaseFont;


/*
 * Links útiles que permitieron tomar decisiones importantes:
 * 
 * https://softwarerecs.stackexchange.com/questions/36861/free-for-commercial-use-java-library-to-convert-html-to-pdf
 * 
 * https://github.com/flyingsaucerproject/flyingsaucer
 * 
 * https://stackoverflow.com/questions/20495092/flying-saucer-set-custom-dpi-for-output-pdf
 * 
 * https://stackoverflow.com/questions/10250606/generation-of-pdf-from-html-with-non-latin-characters-using-itextrenderer-does-n
 * 
 * Free template
 * http://www.tooplate.com/view/2044-guitar
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class PDFRenderOpenSourceTest {
	
	@Test
	public void htmlToPdfWithflyingSaucerPdfOpenSource() throws IOException, DocumentException {
    	InputStream inputStream=new ByteArrayInputStream(App._HTML_TEMPLATE.getBytes(StandardCharsets.UTF_8));
    	createPDF(inputStream, "d://newPdf.pdf");
    }

    public static void createPDF(InputStream inputStream, String pdf)
            throws IOException, DocumentException {
        OutputStream os = null;
        try {
            os = new FileOutputStream(pdf);

            ITextRenderer renderer = new ITextRenderer();
            ResourceLoaderUserAgent callback = new ResourceLoaderUserAgent(renderer.getOutputDevice());
            callback.setSharedContext(renderer.getSharedContext());
            renderer.getSharedContext ().setUserAgentCallback(callback);
            renderer.getFontResolver().addFont("fonts/arialuni.ttf", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
            
            Document doc = XMLResource.load(new InputSource(inputStream)).getDocument();

            renderer.setDocument(doc, null);
            renderer.layout();
            renderer.createPDF(os);
            os.close();
            os = null;
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    // ignore
                }
            }
        }
    }

    private static class ResourceLoaderUserAgent extends ITextUserAgent
    {
        public ResourceLoaderUserAgent(ITextOutputDevice outputDevice) {
            super(outputDevice);
        }

        protected InputStream resolveAndOpenStream(String uri) {
            InputStream is = super.resolveAndOpenStream(uri);
            System.out.println("IN resolveAndOpenStream() " + uri);
            return is;
        }
    }
}