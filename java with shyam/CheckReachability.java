import java.net.*;

public class CheckReachability {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.tufohss.edu.np");
            if (address.isReachable(5000)) {
                System.out.println("Host is reachable.");
            } else {
                System.out.println("Host is not reachable.");
            }
        } catch (Exception e) {
            System.out.println("Could not check reachability: " + e.getMessage());
        }
    }
}
