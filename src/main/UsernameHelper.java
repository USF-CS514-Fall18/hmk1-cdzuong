package main;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that has methods to generate a username for the user
 * and suggest a better password than the one provided. Fill in code
 * in methods generateUsername, improvePassword and main.
 */
public class UsernameHelper {
    /**
     * Generates a username string that consists of the following:
     * the first three letters of the name in lowercase (or all letters if the
     * name is shorter than 3 letters),
     * an underscore,
     * the day of birth (only the day!).
     * Example: for a person named Katie, born on 09-25-1998,
     * the username will be "kat_25".
     *
     * @param name        first name of the person
     * @param dateOfBirth date of birth: month-day-year, like 09-25-1998
     * @return username
     */
    public String generateUsername(String name, String dateOfBirth) {
        String username = "";
        //TODO: Replace with your code.

        // <= 2 characters
        if (name.length() <= 2) {
            username = name + "_" + dateOfBirth.substring(3, 5);
            return username;
        }

        // 3+ characters
        else {
            username = name.substring(0, 3) + "_" + dateOfBirth.substring(3, 5);
            return username;
        }

    }

    /**
     * Take a given password and return a safer version of it by
     * - making the letter in the middle (length/2) of the password uppercase
     * - replacing all vowels with $
     * - adding a random integer from 0 to 9 at the end
     *
     * @param password old password
     * @return a new (arguably safer) password
     */
    public String improvePassword(String password) {
        String betterPassword = "";
        //TODO: Replace with your code.


        // letter in the middle (length/2) is uppercase
        // odd password
        if ((password.length() / 2) % 2 == 1) {

            betterPassword =
                    password.substring(0, password.length() / 2) +
                            password.toUpperCase().charAt(password.length() / 2 + 1) +
                            password.substring((password.length() / 2 + 1));

        }

        // even password
        else {
            betterPassword =
                    password.substring(0, password.length() / 2 - 1) +
                            password.toUpperCase().charAt(password.length() / 2) + password.toUpperCase().charAt((password.length() / 2) + 1) +
                            password.substring(password.length() / 2 + 1);

        }


        // replace all vowels with $

        for (int x = 0; x < password.length(); x++) {
            if (betterPassword.charAt(x) == 'a' || betterPassword.charAt(x) == 'A' ||
                    betterPassword.charAt(x) == 'e' || betterPassword.charAt(x) == 'E' ||
                    betterPassword.charAt(x) == 'i' || betterPassword.charAt(x) == 'I' ||
                    betterPassword.charAt(x) == 'o' || betterPassword.charAt(x) == 'O' ||
                    betterPassword.charAt(x) == 'u' || betterPassword.charAt(x) == 'U') {
                betterPassword = betterPassword.replace('a', '$');
                betterPassword = betterPassword.replace('e', '$');
                betterPassword = betterPassword.replace('i', '$');
                betterPassword = betterPassword.replace('o', '$');
                betterPassword = betterPassword.replace('u', '$');
            }
        }



        // add a random integer from 0-9 at the end

        Random rand = new Random();
        int randInt = rand.nextInt(10);
        String randInteger = String.valueOf(randInt);
        betterPassword = betterPassword + randInteger;

        return betterPassword;
    }

    /**
     * This method should prompt the user for some information,
     * read their input, and generate and output a username.
     * Then prompt the user for the password, and generate a better
     * version of it. Fill in code in this method (see comments below).
     *
     * @param args arguments to the program - not used in this assignment
     */
    public static void main(String[] args) {
        UsernameHelper usernameHelper = new UsernameHelper();
        //TODO: Replace with your code

        // Create a Scanner to read keyboard input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter name and date of birth
        System.out.println("Enter your name: ");
        String nameType = input.next();
        String name = nameType.toLowerCase();
        System.out.println("Enter your date of birth (mm-dd-yyyy): ");
        String dateOfBirth = input.next();
        String usernameGenerator = usernameHelper.generateUsername(name, dateOfBirth);
        // Compute and print their username using generateUsername method
        System.out.println("Here is your username: " + usernameGenerator);


        // Prompt the user for the password
        System.out.println("Enter a password: ");
        String password = input.next();
        // Print a safer version of the password computed using improvePassword method
        System.out.print("Here is a safer password: " + usernameHelper.improvePassword(password));
        ;


    }
}

