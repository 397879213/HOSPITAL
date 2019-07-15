/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

import com.sun.mail.util.BASE64DecoderStream;
import com.sun.mail.util.BASE64EncoderStream;

public class EncryptDecryptWithDES {

    private static SecretKey key;
    private static Cipher ecipher;
    private static Cipher dcipher;

    public EncryptDecryptWithDES() {

        try {
            key = KeyGenerator.getInstance("DES").generateKey();
            ecipher = Cipher.getInstance("DES");
            dcipher = Cipher.getInstance("DES");
            ecipher.init(Cipher.ENCRYPT_MODE, key);
            dcipher.init(Cipher.DECRYPT_MODE, key);
         } catch (NoSuchAlgorithmException e) {
            System.out.println("No Such Algorithm:" + e.getMessage());
            return;
        } catch (NoSuchPaddingException e) {
            System.out.println("No Such Padding:" + e.getMessage());
            return;
        } catch (InvalidKeyException e) {
            System.out.println("Invalid Key:" + e.getMessage());
            return;
        }
    }

    public static void main(String[] args) {

            EncryptDecryptWithDES des = new EncryptDecryptWithDES();
            // generate secret key using DES algorithm
            String encrypted = encrypt("74-E5-43-BD-CA-42");
            System.out.println("Encrypted: " + encrypted);
            String decrypted = decrypt("11Gh3/id63oSFJv5ZiCL1eXfiPjXr1Yd");
            System.out.println("Decrypted: " + decrypted);
        

    }

    public static String encrypt(String str) {

        if(true){
        //    return str;
        }
        try {

            // encode the string into a sequence of bytes using the named charset
            // storing the result into a new byte array. 
            byte[] utf8 = str.getBytes("UTF8");
            byte[] enc = ecipher.doFinal(utf8);
            // encode to base64
            enc = BASE64EncoderStream.encode(enc);
            return new String(enc);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String decrypt(String str) {

         if(true){
           // return str;
        }
        try {

            // decode with base64 to get bytes
            byte[] dec = BASE64DecoderStream.decode(str.getBytes());
            byte[] utf8 = dcipher.doFinal(dec);
            // create new string based on the specified charset
            return new String(utf8, "UTF8");

        } catch (Exception e) {
           // e.printStackTrace();
        }
        return null;

    }

}
