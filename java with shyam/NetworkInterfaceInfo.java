import java.net.*;
import java.util.Enumeration;

public class NetworkInterfaceInfo {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
                NetworkInterface ni = interfaces.nextElement();
                System.out.println("Name: " + ni.getName());
                System.out.println("Display Name: " + ni.getDisplayName());
                System.out.println("Is Up: " + ni.isUp());
                System.out.println("Is Loopback: " + ni.isLoopback());
                System.out.println("Supports Multicast: " + ni.supportsMulticast());
                System.out.println("Is Virtual: " + ni.isVirtual());
                System.out.println();
            }
        } catch (SocketException e) {
            System.out.println("Could not retrieve network interface information: " + e.getMessage());
        }
    }
}
