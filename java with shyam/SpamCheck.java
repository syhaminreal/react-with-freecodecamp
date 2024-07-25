import java.net.*;

public class SpamCheck {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("example.com");
            String[] blackList = {"spam.com", "blocked.com"};

            for (String spam : blackList) {
                if (address.getHostName().equalsIgnoreCase(spam)) {
                    System.out.println("Domain is blacklisted.");
                    return;
                }
            }

            System.out.println("Domain is not blacklisted.");
        } catch (UnknownHostException e) {
            System.out.println("Could not check domain: " + e.getMessage());
        }
    }
}
