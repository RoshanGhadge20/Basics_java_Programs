package java_coding_questions;

public class swap_string_with_stringbuilder 
{
    public static void main(String[] args) 
    {
        String strn = "Hello world";
        String result = swapWords(strn);
        System.out.println("Input: " + strn);
        System.out.println("Output: " + result);
    }

    public static String swapWords(String str)
    {
        // Find the index of the space character
        int spaceIndex = str.indexOf(' ');

        // Extract the two words using substring
        String firstWord = str.substring(0, spaceIndex);
        String secondWord = str.substring(spaceIndex + 1);

        // Use StringBuilder to construct the swapped string
        StringBuilder sb = new StringBuilder();
        sb.append(secondWord).append(" ").append(firstWord);

        // Return the swapped result
        return sb.toString();
        
    }
}
