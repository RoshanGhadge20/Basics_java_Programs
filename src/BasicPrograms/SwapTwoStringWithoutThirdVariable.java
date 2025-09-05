package BasicPrograms;

public class SwapTwoStringWithoutThirdVariable {

    public static void main(String[] args) {

        String str1 = "Roshan", str2 = "Ghadge";
        System.out.println("Before swapping strings are :- " + str1 + " " + str2);

        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("AFter swapping strings are :- " + str1 + " " + str2);
    }
}
