package utilities;

import Handler.ApplicationSetupHandler;
import java.net.InetAddress;
import java.net.NetworkInterface;

public class ApplicationSetup {

    ApplicationSetupHandler setup = new ApplicationSetupHandler();

    public boolean terminalVerification() {
        boolean terminal = false;

        String mac = getMAC();
        if (DAO.ip.equalsIgnoreCase("127.0.0.1")) {
            mac = "A0-48-1C-CE-3B-4E"; //68-17-29-E9-F5-D9
        }

        if (mac.length() == 0) {
            terminal = false;
        } else {
            terminal = setup.getTerminalInformation(mac);
            if (!terminal) {
                return false;
            }
        }
        return terminal;
    }

    public static String getIP() {
        String str = "";
        InetAddress ip;
        try {
            ip = InetAddress.getLocalHost();
            return ip.getHostAddress();
        } catch (Exception ex) {
            return str;
        }
    }

    public static String getMAC() {

        InetAddress ip;
        try {
            ip = InetAddress.getLocalHost();
            NetworkInterface network = NetworkInterface.getByInetAddress(ip);
            byte[] mac = network.getHardwareAddress();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < mac.length; i++) {
                sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
            }
            return sb.toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            return "";
        }
    }

    public static void main(String args[]) {

        ApplicationSetup setup = new ApplicationSetup();
        setup.terminalVerification();
    }
}
