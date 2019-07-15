package utilities;

import java.io.*;

public class Utility implements java.io.Serializable{

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
