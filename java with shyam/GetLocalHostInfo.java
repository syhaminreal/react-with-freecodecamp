import java.net.*;

public class GetLocalHostInfo {
    public static void main(String[] args) {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Local Host Name: " + localHost.getHostName());
            System.out.println("Local IP Address: " + localHost.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Could not find local host: " + e.getMessage());
        }
    }
}
