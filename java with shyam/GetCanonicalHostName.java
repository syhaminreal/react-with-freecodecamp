import java.net.*;

public class GetCanonicalHostName {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.tufohss.edu.np");
            System.out.println("Canonical Hostname: " + address.getCanonicalHostName());
        } catch (UnknownHostException e) {
            System.out.println("Could not find address: " + e.getMessage());
        }
    }
}
