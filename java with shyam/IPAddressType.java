

public class IPAddressType {
    public static void main(String[] args) {
        String ipAddress = "2001:0db8:85a3:0000:0000:8a2e:0370:7334"; // Example IPv6 address

        if (ipAddress.contains(":")) {
            System.out.println("IPv6 Address");
        } else if (ipAddress.contains(".")) {
            System.out.println("IPv4 Address");
        } else {
            System.out.println("Unknown IP Address type");
        }
    }
}
