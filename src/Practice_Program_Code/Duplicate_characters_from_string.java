package Practice_Program_Code;

import java.util.HashMap;
import java.util.Map;

public class Duplicate_characters_from_string 
{
    public static void main(String[] args) 
    {
        String sample = "roshan";
        
        // Create a HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        // Convert the string to a character array
        char[] charArray = sample.toCharArray();
        
        // Count the occurrences of each character
        for (char c : charArray) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        
        // Print characters with a count greater than 1
        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet())
        {
            if (entry.getValue() > 1)
            {
                System.out.println(entry.getKey());
            }
        }
    }
}
