import java.net.*;

public class IPAddressCharacteristics {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.tufohss.edu.np");
            System.out.println("Is Multicast Address: " + address.isMulticastAddress());
            System.out.println("Is Loopback Address: " + address.isLoopbackAddress());
            System.out.println("Is Link Local Address: " + address.isLinkLocalAddress());
            System.out.println("Is Site Local Address: " + address.isSiteLocalAddress());
            System.out.println("Is Any Local Address: " + address.isAnyLocalAddress());
            System.out.println("Is Reachable: " + address.isReachable(5000));
        } catch (Exception e) {
            System.out.println("Could not determine address characteristics: " + e.getMessage());
        }
    }
}
