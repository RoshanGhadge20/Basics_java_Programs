package BasicPrograms;

public class CheckAnagram {

    public static boolean checkAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] countchar = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            countchar[s1.charAt(i)]++;
            countchar[s2.charAt(i)]--;
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

        System.out.println(checkAnagram(str1, str2));
    }
}
