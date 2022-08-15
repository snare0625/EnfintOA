public class Main {

    public static void main(String[] args) {
        //Displays numbers from 2 - 10 in hex
        for (int i=2; i<=10; i++) {
            System.out.println(toHex(i));
        }
    }

    //Converts decimal number to hex
    public static String toHex(int decimal){
        int rem;
        String hex = "";
        char hexChars[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while(decimal > 0) {
            rem = decimal % 16;
            hex = hexChars[rem] + hex;
            decimal = decimal/16;
        }
        return hex;
    }


}
