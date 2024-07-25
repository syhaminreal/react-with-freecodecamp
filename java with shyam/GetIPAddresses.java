import java.net.*;

public class GetIPAddresses {
    public static void main(String[] args) {
        try {
            InetAddress[] addresses = InetAddress.getAllByName("www.tufohss.edu.np");
            for (InetAddress address : addresses) {
                System.out.println(address.getHostAddress());
            }
        } catch (UnknownHostException e) {
            System.out.println("Could not find address: " + e.getMessage());
        }
    }
}
