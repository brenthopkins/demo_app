package tarot;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
//import java.net.URL;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class BuildPdf {
	public static void main(String[] args) throws MalformedURLException, IOException {
		Document document = new Document();
		try {
			PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));
			document.open();
			document.add(new Paragraph("A Hello World PDF document."));

			document.add(new Paragraph("Image Example"));

			// Add Image
			Image image1 = Image.getInstance("C://Users/brent/workspace/testfile1/cards/c12.jpg");
			// Fixed Positioning
			image1.setAbsolutePosition(100f, 550f);
			// Scale to new height and new width of image
			image1.scaleAbsolute(200, 200);
			// Add to document
			document.add(image1);

//			String imageUrl = "http://www.eclipse.org/xtend/images/java8_logo.png";
//			Image image2 = Image.getInstance("C://Users/brent/workspace/testfile1/cards/m05.jpg");
//			document.add(image2);

			document.close();
			writer.close();
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}