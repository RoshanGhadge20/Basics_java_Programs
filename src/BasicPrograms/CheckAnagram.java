package BasicPrograms;

import java.util.Arrays;

public class CheckAnagram {

    public static boolean checkAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        // Fetch the freq of each character
        int countchar[] = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            countchar[s1.charAt(i)]++;
            // System.out.println("S1" + s1.charAt(i));
            countchar[s2.charAt(i)]--;
            // System.out.println("S2" + s2.charAt(i));
        }

        for (int count : countchar) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";
        // System.out.println(checkAnagram(str1, str2));

        // Check two string are anagram or not with the help of arrays
        String str3 = "roshan";
        String str4 = "oshanr";
        char ch3[] = str3.toCharArray();
        char ch4[] = str4.toCharArray();
        Arrays.sort(ch3);
        Arrays.sort(ch4);

        System.out.println("Checked with the help of arrays" + Arrays.equals(ch3, ch4));
    }
}
