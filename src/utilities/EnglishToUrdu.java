/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import com.google.api.GoogleAPI;
import com.google.api.translate.Language;
import com.google.api.translate.Translate;

/**
 *
 * @author Subtain
 */
public class EnglishToUrdu {

    
  public static void main(String[] args) throws Exception {
    // Set the HTTP referrer to your website address.
    //GoogleAPI.setHttpReferrer("www.pacslink.com");

    // Set the Google Translate API key
    // See: http://code.google.com/apis/language/translate/v2/getting_started.html
    //GoogleAPI.setKey("AIzaSyCI8uSnLTSMDq4qAT4J7w33aGaUsgYGMf4");

    String translatedText = Translate.DEFAULT.execute("Hello World", Language.ENGLISH, Language.URDU);

    System.out.println(translatedText);
  }

    
    
}
