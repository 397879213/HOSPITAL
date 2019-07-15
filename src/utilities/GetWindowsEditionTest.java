/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

public class GetWindowsEditionTest {

    public static void main(String[] args) {
 
        System.out.println(System.getenv("PROCESSOR_IDENTIFIER"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("os.arch"));
        System.out.println("Total Processors in system = " + Runtime.getRuntime().availableProcessors());
 
    }
}