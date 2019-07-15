/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class JarRunner {
    
    public JarRunner(){
        
    }
    
    public void transferStudy(String ip , String port , String AETitle, 
            String serverName , String studyPath , String transferStudyPath){
        
        
        String jarPath = "D:\\TESTING\\PACSSERVER.jar "
                +serverName+ " "+AETitle+ " "+ip+" "+port+ " "+studyPath+ " "+transferStudyPath;
        
        System.out.println("jar file command = "+jarPath);
        
        ProcessBuilder pb = new ProcessBuilder("java", "-jar", jarPath);
        pb.directory(new File("D:\\TESTING\\"));
        try {
            Process p = pb.start();
            LogStreamReader lsr = new LogStreamReader(p.getInputStream());
            Thread thread = new Thread(lsr, "LogStreamReader");
            thread.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    
    public static void main(String[] args) {
     
    }
}

class LogStreamReader implements Runnable {

    private BufferedReader reader;

    public LogStreamReader(InputStream is) {
        this.reader = new BufferedReader(new InputStreamReader(is));
    }

    public void run() {
        try {
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}