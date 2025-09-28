package Java_Coding_Interview_Questions_QA;

public class SwapTwoStringWithoutThirdVariableUse {

    public static void main(String[] args) {

        String firstname = "Roshan", lastname = "Ghadge";

        // Swapping the values without using any third variable
        System.out.println("Printing the Initial values :- " + firstname + lastname);

        firstname = firstname + lastname;
        lastname = firstname.substring(0, firstname.length() - lastname.length());
        firstname = firstname.substring(lastname.length());

        System.out.println("After swapping out the values of string :- " + firstname + lastname);

    }

}
