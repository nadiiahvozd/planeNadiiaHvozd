package org.prog;

public class Main {
    public static void main(String... args) {
        String[] passanger = new String[10];
        passanger[1] = "Joe Lee";
        passanger[2] = "Zoe Klabits";
        passanger[3] = "Rebekka Minkoff";
        passanger[4] = "Kit Harrington";
        passanger[5] = "Lena Josef";

        if (passanger[1].equals(passanger[2])) {
            System.out.println("they are the same");
        } else {
            System.out.println("they are different");
        }

    }
}



