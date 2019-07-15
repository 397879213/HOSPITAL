package utilities;

 
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.dcm4che2.data.BasicDicomObject;
import org.dcm4che2.data.DicomObject;
import org.dcm4che2.data.Tag;
import org.dcm4che2.data.VR;
import org.dcm4che2.io.DicomInputStream;
import org.dcm4che2.io.DicomOutputStream;

public class UtilityFunction {

    String tempFolder = "";

    public UtilityFunction() {
        tempFolder = (String) Constants.hashPaths.get(Constants.recieveImagesFolder);
    }

    

    public void moveFiles() {

        String sourceFolder = (String) Constants.hashPaths.get(Constants.recieveImagesFolder);
        String destinationFolder = (String) Constants.hashPaths.get(Constants.compressFolder);

        File[] allImages = new File(destinationFolder).listFiles();
        for (int j = 0; j < allImages.length; j++) {
            allImages[j].delete();
        }//DIRECT

        File[] allFiles = new File(sourceFolder).listFiles();
        for (int i = 0; i < allFiles.length; i++) {
            allFiles[i].renameTo(new File(destinationFolder + allFiles[i].getName()));
        }
    }

     

      
    
    
    public void UpdateTags() {

        String sourceFolder = (String) Constants.hashPaths.get(Constants.tagsFolder);
        String destinationFolder = (String) Constants.hashPaths.get(Constants.tempFolder);

        //First Delete Temp Folder Files before copy images there
        File[] tempImages = new File(destinationFolder).listFiles();
        for (int j = 0; j < tempImages.length; j++) {
            tempImages[j].delete();
        }
        //now get all files in tag folder
        File[] allFiles = new File(sourceFolder).listFiles();

        DicomObject dcmObj = new BasicDicomObject();
        DicomInputStream din = null;
        for (int i = 0; i < allFiles.length; i++) {
            System.out.println("Current Image in Progress = " + (i + 1)
                    + " out of = " + allFiles.length);
            try {
                din = new DicomInputStream(allFiles[i]);
                din.readDicomObject(dcmObj, -1);
                String patId = dcmObj.getString(Tag.AccessionNumber);
                String patName = dcmObj.getString(Tag.StudyDate) + dcmObj.getString(Tag.StudyTime);
                dcmObj.putString(Tag.InstitutionName, VR.LO, Constants.name);
                dcmObj.putString(Tag.PatientID, VR.LO, Constants.tag + patId);
                dcmObj.putString(Tag.ImplementationVersionName, VR.SH, Constants.name);
                dcmObj.putString(Tag.PatientName, VR.LO, Constants.tag + patName.substring(0, 14));
                dcmObj.putString(Tag.ReferringPhysicianName, VR.LO, Constants.doctor);
                dcmObj.putString(Tag.PerformingPhysicianName, VR.LO, Constants.doctor);
                dcmObj.putString(Tag.RequestingPhysician, VR.LO, Constants.doctor);
                dcmObj.putString(Tag.RequestingService, VR.LO, Constants.doctor);
                dcmObj.putString(Tag.NameOfPhysiciansReadingStudy, VR.LO, Constants.doctor);
                this.writeFile(dcmObj, destinationFolder, "\\" + allFiles[i].getName());
                din.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } //Loop
    }

    public void directTemp() {

        String sourceFolder = (String) Constants.hashPaths.get(Constants.recieveImagesFolder);
        String destinationFolder = (String) Constants.hashPaths.get(Constants.tempFolder);
        File[] tempImages = new File(destinationFolder).listFiles();

        //Delete All Temp Files 
        for (int j = 0; j < tempImages.length; j++) {
            tempImages[j].delete();
        }

        //Move all images Folder Files to Temp
        File[] allFiles = new File(sourceFolder).listFiles();
        for (int i = 0; i < allFiles.length; i++) {
            System.out.println("Current Image in Progress = " + (i + 1)
                    + " out of = " + allFiles.length);
            allFiles[i].renameTo(new File(destinationFolder + "\\" + allFiles[i].getName()));
        }//
    }

    public void writeFile(DicomObject obj, String copyServer, String fileName) {

        File f = new File(copyServer + fileName);
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        DicomOutputStream dos = new DicomOutputStream(bos);
        try {
            dos.writeDicomFile(obj);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        } finally {
            try {
                dos.close();
            } catch (IOException ignore) {
            }
        }
    }

    public boolean copyFile(File source, File dest) {

        boolean ret = true;
        if (dest.exists()) {
            if (source.length() == dest.length()) {
                System.out.println("  " + dest.getAbsolutePath() + " File Already Copied");
                return ret;
            }
        }
        try {
            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(dest);
            byte[] buf = new byte[20480];
            int i = 0;
            while ((i = fis.read(buf)) != -1) {
                fos.write(buf, 0, i);
            }
            fis.close();
            fos.close();
            System.out.println("  " + dest.getAbsolutePath() + " File Copied");
        } catch (Exception ex) {
            ret = false;
            System.out.print("Problem in Copy File");
            //mail.messageSubject = "Problem in Copy File";
            //mail.message = "\n File did not Copy from " + source.getAbsolutePath()
            //+ " to " + dest.getAbsolutePath() + "\n\n";
            //mail.message += ex.getMessage();
            ex.printStackTrace();
            //  this.sendMail();
        }
        return ret;
    }
    
    

    public void extractData() {
    }
}