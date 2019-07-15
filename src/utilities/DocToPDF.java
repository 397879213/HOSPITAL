package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;

import org.apache.poi.hwpf.usermodel.Range;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class DocToPDF {

    public static void main(String[] args) {

        POIFSFileSystem fs = null;
        Document document = new Document();

        try {

            fs = new POIFSFileSystem(new FileInputStream("D:\\DOW\\RIS_REPORTS\\testing.doc"));

            HWPFDocument doc = new HWPFDocument(fs);
            WordExtractor we = new WordExtractor(doc);

            OutputStream file = new FileOutputStream(new File("D:\\DOW\\RIS_REPORTS\\123.pdf"));

            PdfWriter writer = PdfWriter.getInstance(document, file);

            Range range = doc.getRange();
            document.open();
            writer.setPageEmpty(true);
            document.newPage();
            writer.setPageEmpty(true);

            String[] paragraphs = we.getParagraphText();
            for (int i = 0; i < paragraphs.length; i++) {

                org.apache.poi.hwpf.usermodel.Paragraph pr = range.getParagraph(i);

                //paragraphs[i] = paragraphs[i].replaceAll("\\cM?\r?\n", "");
                //System.out.println("Length:" + paragraphs[i].length());
                //System.out.println("Paragraph" + i + ": " + paragraphs[i].toString());
                // add the paragraph to the document  
                document.add(new Paragraph(paragraphs[i]));
            }

            System.out.println("Finished");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // close the document  
            document.close();
        }
    }

    public void test() {

        try {

            FileInputStream fis = new FileInputStream(new File("test.doc"));
            FileOutputStream fos = new FileOutputStream(new File("test.pdf"));

          //  OfficeFile f = new OfficeFile(fis, "localhost", "8100", false);
          //  f.convert(fos, "pdf");

        } catch (Exception ex) {

        }
    }

}
