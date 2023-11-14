public class DefangingAnIPAddress {
     public static String defangIPaddr(String address) {
          StringBuilder defangString = new StringBuilder();
          String Ad = "[.]";
          for (char c : address.toCharArray()) {
               if (c == '.') {
                    defangString.append(Ad);
               } else {
                    defangString.append(c);
               }
          }
          return defangString.toString();
     }

     public static void main(String[] args) {
          // String address = "1.1.1.1";
          String address = "255[.]100[.]50[.]0";
          System.out.println(defangIPaddr(address));
     }
}
/*
 * Given a valid (IPv4) IP address, return a defanged version of that IP
 * address.
 * 
 * A defanged IP address replaces every period "." with "[.]".
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: address = "1.1.1.1"
 * Output: "1[.]1[.]1[.]1"
 * Example 2:
 * 
 * Input: address = "255.100.50.0"
 * Output: "255[.]100[.]50[.]0"
 * 
 * 
 * Constraints:
 * 
 * The given address is a valid IPv4 address.
 */