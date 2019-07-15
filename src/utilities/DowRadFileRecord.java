/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utilities;

import java.io.File;
import java.util.StringTokenizer;

/**
 *
 * @author pacslink
 */
public class DowRadFileRecord {
    
        public void readFiles(File file) {

        File[] allFiles = file.listFiles();

        for (int i = 0; i < allFiles.length; i++) {

            if (allFiles[i].isDirectory()) {

                readFiles(allFiles[i]);
            } else {
                System.out.println(allFiles[i].getAbsolutePath());
                
                String fullFileName = allFiles[i].getName();
                //003626-NU-NQ SHABNUM (BRAIN).docx
                StringTokenizer token = new  StringTokenizer(fullFileName , ".");
                
                String fileName = token.nextToken();
                //003626-NU-NQ SHABNUM (BRAIN)
                token = new  StringTokenizer(fileName , "-");
                String patientId = token.nextToken();
                String transcribedBy =token.nextToken();
                
                String lastToken = token.nextToken();
                token = new  StringTokenizer(lastToken , " ");
                String patientName = token.nextToken();
                String studyName = "NOT APPLCIABLE";
                if(token.hasMoreTokens()){
                //String studyName = token.nextToken();
                }
                //CT\0029058-NU-NQ HAJI BASHEER (ABDOMEN)
                
                //section_id  patientID , trnascribed by , patient Name , study Description 
                System.out.println(patientId + "   " + patientName + "  "
                        + studyName+ transcribedBy);    

            }
        }

    }

    
    public static void main(String args []){
        
        File file = new File("D:\\DOW\\DOW-RAD\\OLD_REPORTS\\02-04-2014\\CT");
        DowRadFileRecord d = new DowRadFileRecord();
        d.readFiles(file);
        
        
        
        
    }
}
