import java.net.*;

 class GetIPAddress {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.tufohss.edu.np");
            System.out.println("IP Address: " + address.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Could not find address: " + e.getMessage());
        }
    }
}
