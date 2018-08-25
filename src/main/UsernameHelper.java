package main;

import java.util.Random;
import java.util.Scanner;

/** A class that has methods to generate a username for the user
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
     * @param name first name of the person
     * @param dateOfBirth date of birth: month-day-year, like 09-25-1998
     * @return username
     */
    public String generateUsername(String name, String dateOfBirth) {
        String username = "";
        //TODO: Replace with your code.

        return username;
    }

    /**
     * Take a given password and return a safer version of it by
     * - making the letter in the middle (length/2) of the password uppercase
     * - replacing all vowels with $
     * - adding a random integer from 0 to 9 at the end
     * @param password old password
     * @return a new (arguably safer) password
     */
    public String improvePassword(String password) {
        String betterPassword = "";
        //TODO: Replace with your code.

        return betterPassword;
    }

    /**
     * This method should prompt the user for some information,
     * read their input, and generate and output a username.
     * Then prompt the user for the password, and generate a better
     * version of it. Fill in code in this method (see comments below).
     * @param args arguments to the program - not used in this assignment
     */
    public static void main(String[] args) {
        UsernameHelper usernameHelper = new UsernameHelper();
        //TODO: Replace with your code

        // Create a Scanner to read keyboard input
        // Prompt the user to enter name and date of birth
        // Compute and print their username using generateUsername method

        // Prompt the user for the password
        // Print a safer version of the password computed using improvePassword method


    }
}
