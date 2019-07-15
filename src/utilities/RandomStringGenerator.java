/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

/**
 *
 * @author lucky
 */
public class RandomStringGenerator {

    public static enum Mode {

        ALPHA, ALPHANUMERIC, NUMERIC
    }

    public static String generateRandomString(int length, Mode mode) throws Exception {

        StringBuffer buffer = new StringBuffer();
        String characters = "";

        switch (mode) {

            case ALPHA:
                characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
                break;

            case ALPHANUMERIC:
                characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
                break;

            case NUMERIC:
                characters = "1234567890";
                break;
        }

        int charactersLength = characters.length();

        for (int i = 0; i < length; i++) {
            double index = Math.random() * charactersLength;
            buffer.append(characters.charAt((int) index));
        }
        return buffer.toString();
    }
    
    public static void main(String [] args){

        try{
        for(int i=0;i<15;i++){
	System.out.println(RandomStringGenerator.generateRandomString(12,RandomStringGenerator.Mode.ALPHANUMERIC).toUpperCase());
        }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}