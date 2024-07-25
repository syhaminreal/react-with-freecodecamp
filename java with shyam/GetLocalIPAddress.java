import java.net.*;

public class GetLocalIPAddress {
    public static void main(String[] args) {
        try {
            InetAddress localAddress = InetAddress.getLocalHost();
            System.out.println("Local IP Address: " + localAddress.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Could not find local address: " + e.getMessage());
        }
    }
}
