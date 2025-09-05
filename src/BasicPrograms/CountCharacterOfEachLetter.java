package BasicPrograms;

public class CountCharacterOfEachLetter {

    public static void main(String[] args) {

        String str1 = "RRjafdjjjjs";
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str1.length() - 1; i++) {
            if (str1.charAt(i) == str1.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str1.charAt(i)).append(count);
                count = 1;
            }
        }
        sb.append(str1.charAt(str1.length() - 1)).append(count);

        System.out.println("Printing the result :- " + sb.toString());
    }

}
