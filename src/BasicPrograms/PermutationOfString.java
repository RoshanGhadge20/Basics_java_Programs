package BasicPrograms;

public class PermutationOfString {

    public static void permute(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            String ros = str.substring(0, i) + str.substring(1 + i);
            permute(ros, ans + ch);
        }
    }

    public static void main(String[] args) {
        System.out.println("All the permutations of string are:-");
        String exmple = "ABC";
        permute(exmple, "");

    }

}
