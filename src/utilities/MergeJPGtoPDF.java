/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import com.lowagie.text.Document;
import com.lowagie.text.Image;
import com.lowagie.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.util.List;

/**
 *
 * @author pacslink
 */
public class MergeJPGtoPDF {

    public void convertJPGtoPDF() {

        try {
            //Create Document Object
            Document convertJpgToPdf = new Document();
            //Create PdfWriter for Document to hold physical file
            PdfWriter.getInstance(convertJpgToPdf, new FileOutputStream("D:\\ConvertImagetoPDF.pdf"));
            convertJpgToPdf.open();
            //Get the input image to Convert to PDF
            Image convertJpg = Image.getInstance("D:\\test.jpg");
            //Add image to Document
            convertJpgToPdf.add(convertJpg);
            //Close Document
            convertJpgToPdf.close();
            System.out.println("Successfully Converted JPG to PDF in iText");
        } catch (Exception i1) {
            i1.printStackTrace();
        }
    }

    public boolean convertJpgsToPdf(List<String> listFilePaths,String docName,
            String docType,String empId) {

        Document document = new Document();
        String output = "D:\\"+empId+"_"+docType+"_"+docName+".pdf";
        try {
            FileOutputStream fos = new FileOutputStream(output);
            PdfWriter writer = PdfWriter.getInstance(document, fos);
            writer.open();
            document.open();
            for(int i=0; i<listFilePaths.size();i++){
                document.add(Image.getInstance(listFilePaths.get(i)));
            }
            document.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    
    public void convert2() {

        Document document = new Document();
      
        String input = "D:\\test.jpg"; // .gif and .jpg are ok too!
        String input1 = "D:\\test1.jpg"; // .gif and .jpg are ok too!
        String output = "D:\\test.pdf";
        try {
            FileOutputStream fos = new FileOutputStream(output);
            PdfWriter writer = PdfWriter.getInstance(document, fos);
            writer.open();
            document.open();
            document.add(Image.getInstance(input));
             document.add(Image.getInstance(input1));
            document.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    

    public static void main(String asr[]) {
        MergeJPGtoPDF pdf = new MergeJPGtoPDF();
        //pdf.convertJPGtoPDF();
        pdf.convert2();

    }

}
