package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        User testUser = new User("zweifelj", "!@Amazon_CMH1_Warriors@!");
        User.save(testUser);

        while(true) {
            // Prompt
            System.out.println("\nChoose an option: ");
            System.out.println("1: Sign In");
            System.out.println("2: Sign Up");
            System.out.println("Q/q to quit");
            System.out.print("Your response: ");

            String input = in.nextLine();   // User's response

            // First, check if the user is trying to quit the process (Q or q)
            if (input.equalsIgnoreCase("Q")) {
                System.out.println("Terminating processes");
                System.out.println("Thank you, come again.");
                break;
            }
            else if (input.equals("1")) {
                // Have user enter their username first
                System.out.print("Enter your username: ");
                String userName = in.nextLine();

                // Check if user is signed up
                if (!(User.userExists(userName))) {
                    System.out.println("Username: " + userName + " does not exist. Try again.");
                    continue;
                }

                // User exists, have them enter their password
                System.out.print("Enter your password: ");
                String password = in.nextLine();

                // Authenticate user's password
                if (!(User.authPassword(password))) {
                    System.out.print("The submitted password was incorrect. Try again.");
                    continue;
                }

                // Successful login
                // User returningUser = User.get(userName, password);
                System.out.print("\nLogin successful!");
                System.out.print("\nWelcome back!");
                break;
            }
            else if (input.equals("2")) {
                // Have User enter a username
                System.out.print("Enter a new username: ");
                String newUsername = in.nextLine();

                // Verify that the username does not already exist
                if (User.userExists(newUsername)) {
                    System.out.print("Sorry, but this username is already taken.");
                    System.out.print("\nPlease, try again.");
                    continue;
                }

                // Have User enter a password
                System.out.print("Enter a new password: ");
                String newPassword = in.nextLine();

                // Have user confirm password by entering again
                System.out.print("Confirm password: ");
                String confirmPassword = in.nextLine();

                // Compare first entered password and confirmed password
                if (!(confirmPassword.equals(newPassword))) {
                    System.out.print("\nSorry, the entered passwords did not match.");
                    System.out.print("\nPlease, try again.");
                    continue;
                }

                // Create the new user and save
                User newUser = new User(newUsername, newPassword);
                User.save(newUser);
                System.out.print("\nSign up successful!");
                System.out.print("\nWelcome!");
                break;
            }
        }

        // Print a success message indicating program exited while loop
        System.out.println();
        User.all();
        System.out.print("\nClosure Status: Successful");
        in.close();
    }
}