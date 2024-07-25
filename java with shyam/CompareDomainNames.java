import java.net.*;

public class CompareDomainNames {
    public static void main(String[] args) {
        try {
            InetAddress address1 = InetAddress.getByName("www.ibiblio.org");
            InetAddress address2 = InetAddress.getByName("helios.ibiblio.org");
            if (address1.equals(address2)) {
                System.out.println("Both domain names refer to the same IP address.");
            } else {
                System.out.println("The domain names refer to different IP addresses.");
            }
        } catch (UnknownHostException e) {
            System.out.println("Could not find address: " + e.getMessage());
        }
    }
}
