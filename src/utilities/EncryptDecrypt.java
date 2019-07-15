/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utilities;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 *
 * @author pacslink
 */
public class EncryptDecrypt {
    
    
     public static String decrypt(String encryptedData , byte [] keyValue) {
        String decryptedValue = "";

        try {
            Key key = generateKey(keyValue);
            Cipher c = Cipher.getInstance(ALGO);
            c.init(Cipher.DECRYPT_MODE, key);
            byte[] decordedValue = new BASE64Decoder().decodeBuffer(encryptedData);
            byte[] decValue = c.doFinal(decordedValue);
            decryptedValue = new String(decValue);
        } catch (Exception ex) {

             //ex.printStackTrace();
        }

        return decryptedValue;
    }

     
     public static String encrypt(String Data , byte[] keyValue) {
        String encryptedValue = "";
        try {
            Key key = generateKey(keyValue);
            Cipher c = Cipher.getInstance(ALGO);
            c.init(Cipher.ENCRYPT_MODE, key);
            byte[] encVal = c.doFinal(Data.getBytes());
            encryptedValue = new BASE64Encoder().encode(encVal);

        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return encryptedValue;
    }
     private static byte[]  keyValue = {'h','e','l','l','o','p','4','t'};
     public static void main(String args []){
         
         //EncryptDecrypt dyp = new EncryptDecrypt();
         //EncryptDecrypt.encrypt("74-E5-43-BD-CA-42", keyValue);
         System.out.println(EncryptDecrypt.encrypt("74-E5-43-BD-CA-42", keyValue));
     }
     
    private static Key generateKey(byte [] keyValue) {
        Key key = null;
        try {
            key = new SecretKeySpec(keyValue, ALGO);

        } catch (Exception e) {
        }
        return key;
    }
    private static final String ALGO = "AES";

}
