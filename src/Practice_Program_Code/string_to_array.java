package Practice_Program_Code;

public class string_to_array {
    public static void main(String[] args) {

        String name = "Roshan";

        char[] name_array = name.toCharArray();

        System.out.println(name_array[0]);

        for (char i : name_array) {
            System.out.println(i);
        }

    }
}
