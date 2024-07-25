import java.net.*;
import java.util.Enumeration;

public class ListNetworkInterfaces {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
                NetworkInterface ni = interfaces.nextElement();
                System.out.println("Network Interface: " + ni.getName());
            }
        } catch (SocketException e) {
            System.out.println("Could not list network interfaces: " + e.getMessage());
        }
    }
}
