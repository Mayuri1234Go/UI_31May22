package genricMethod;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.annotations.Test;

public class PDFReadTest {
	
	 
	@Test
	public void readPDFTest() throws IOException
	{ 
		URL url=new URL("https://www.clickdimensions.com/links/TestPDFfile.pdf");
		InputStream is = url.openStream();
		
		BufferedInputStream fileparse=new BufferedInputStream(is);
		PDDocument document=null;
		
		document=PDDocument.load(fileparse);
		
		new PDFTextStripper().getText(document);
		String pdfContent= new PDFTextStripper().getText(document);
		System.out.println(pdfContent);
		
	}
	

}
