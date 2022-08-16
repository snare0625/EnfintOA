public class Main {

    public static void main(String[] args) {
        //Displays numbers from 2 - 10 in hex
        for (int i=2; i<=10; i++) {
            System.out.println(toHex(i));
        }
    }

    //Converts decimal number to hex
    public static String toHex(int decimal){
        if (decimal < 0) {
            return "-" + toHex(-decimal);
        }
        String hexChars = "0123456789ABCDEF";
        if (decimal < 16) {
            return hexChars.charAt(decimal % 16)
        }
        return toHex(decimal / 16) + hexChars.charAt(decimal % 16);
    }


}
