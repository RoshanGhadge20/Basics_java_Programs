package Practice_Program_Code;

public class reverse_each_word_of_string 
{
    public static void main(String[] args) 
    {
        String nameString = "This is the basic example of practice set";
        String words[] = nameString.split(" ");
        
        String rev_str = "", rev_nameString = "";
        char c;
        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            rev_str = ""; // Reset rev_str for each word
            for (int j = 0; j < word.length(); j++)
            {
                c = word.charAt(j); // Use j instead of i
                rev_str = c + rev_str;
            }
            rev_nameString = rev_nameString + rev_str + " ";
        }
        System.out.println("Reverse of Complete string: " + rev_nameString.trim());
    }
}
