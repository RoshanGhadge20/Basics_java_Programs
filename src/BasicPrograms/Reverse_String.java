package BasicPrograms;

public class Reverse_String {

    public static void main(String[] args) {

        String example = "Automation";

        // with the help of string buffer
        StringBuffer buffer = new StringBuffer(example);
        buffer.reverse();
        System.out.println(buffer);

        // with the help of loops
        String revString = "";
        for (int i = example.length() - 1; i >= 0; i--) {
            revString = revString + example.charAt(i);
        }
        System.out.println("====" + revString);

        // with the help of while loop
        String reverseStr = "";
        int j = example.length() - 1;
        while (j >= 0) {
            reverseStr = reverseStr + example.charAt(j);
            j--;
        }
        System.out.println("Reversed String with the help of while loop == " + reverseStr);

        // With the help of char array[]
        String revStr = "";
        char[] arr = example.toCharArray();
        for (int k = arr.length - 1; k >= 0; k--) {
            revStr += arr[k];
        }
        System.out.println("Reverse the char array[] with the loops:- " + revStr);
    }

}
