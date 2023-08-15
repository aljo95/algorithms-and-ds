import java.lang.Math;

public class ReverseInteger {
    
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }

    public static int reverse(int x) {

        String reverseString = "";
        String numberLength = "" + x;
       // int 
        int lastNumber;

        while (x != 0) {
            lastNumber = x % 10;
            reverseString += "" + lastNumber;   //"3", "32", "321"
            numberLength = numberLength.substring(0, numberLength.length() -1); //"123" -> "12" -> "1"
            if (numberLength == "") return Integer.parseInt(reverseString);
            x = Integer.parseInt(numberLength);
        }
        return 0;
        //return Integer.parseInt(reverseString);

    }
}
