/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import com.way2sms.SMS;
class TestSMS {

public static void main(String[] args) {

SMS smsClient=new SMS();

smsClient.send( "", "", "03008434328", "Here is siibtain","");
}
}