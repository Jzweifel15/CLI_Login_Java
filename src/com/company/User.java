package com.company;

import java.util.HashMap;
import Security.Secure;

public class User {
    private int id = 0;
    private static int count = 0;
    private String userName;
    private String password;
    private static HashMap<Integer, User> users = new HashMap<Integer, User>();

    /**
     * Constructor for a User object
     * @param userName the username that the User will be used for their account
     * @param password the password that the User will be used for their account
     */
    public User(String userName, String password) {
        this.id = users.size() + 1;
        this.userName = userName;
        this.password = Secure.encrypt(password);
    }

    /**
     * Class method that returns all the current users stored in the data store in a formatted fashion
     */
    public static void all() {
        for (int i : users.keySet()) {
            System.out.println("id: " + i + ", userName: "
                    + users.get(i).userName
                    + ", password: " + users.get(i).password);
        }
    }

    /**
     * Class method for saving a User instance after a successful authentication process
     * @param verifiedUser a successfully verified user
     */
    public static void save(User verifiedUser) {
        users.put(verifiedUser.getId(), verifiedUser);
    }

    /**
     * Class helper method that checks if a users exists in the data store
     * @param userName the user name submitted by the user to be checked if exists in the data store
     * @return true if the given user exists, false otherwise
     */
    public static boolean userExists(String userName) {
        boolean exists = false;

        for (int i : users.keySet()) {
            if (userName.equals(users.get(i).userName)) {
                exists = true;
            }
        }

        return exists;
    }

    /**
     * Class helper method for verifying password authentication
     * @param password the password submitted by the user to be authenticated
     * @return true if the password for the user is correct, false otherwise
     */
    public static boolean authPassword(String password) {
        boolean correct = false;

        for (int i : users.keySet()) {
            String decryptedPassword = Secure.decrypt(users.get(i).password);
            if (password.equals(decryptedPassword)) {
                correct = true;
            }
        }

        return correct;
    }

    /**
     * Accessor method to retrieve a User's id
     * @return the id of the specific User instance
     */
    public int getId() {
        return this.id;
    }

    /**
     * Accessor method to retrieve a User's username
     * @return the username of the specific User instance
     */
    public String getUsername() {
        return this.userName;
    }

    /**
     * Accessor method to retrieve a User's password
     * @return the password of the specific User instance
     */
    public String getPassword() {
        return this.password;
    }

}
