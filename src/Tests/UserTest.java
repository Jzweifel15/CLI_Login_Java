package Tests;

import com.company.User;
import Security.Secure;
import org.junit.Assert;
import org.junit.Before;
//import org.junit.After;
import org.junit.Test;

public class UserTest {
    User user1;
    User user2;

    @Before
    public void preTest() {
        user1 = new User("zweifelj", "!@Amazon_CMH1_Warriors@!");
        User.save(user1);
        user2 = new User("gabbg", "HelloWorld123");
        User.save(user2);
    }

    // Test if a User is successfully created and does NOT appear NULL
    @Test
    public void testUsersCreated() {
        Assert.assertNotNull("user1 successfully created", user1);
        Assert.assertNotNull("user2 successfully created", user2);
    }

    // Test for retrieving a user's ID
    @Test
    public void testRetrieveID() {
        Assert.assertTrue("user1's ID: " + user1.getId(), user1.getId() == 1);
        Assert.assertTrue("user2's ID: " + user2.getId(), user2.getId() == 2);
    }

    // Test for retrieving a user's username
    @Test
    public void testRetrieveUsername() {
        Assert.assertTrue("Successfully retrieved user1's username", user1.getUsername().equals("zweifelj"));
        Assert.assertTrue("Successfully retrieved user2's username", user2.getUsername().equals("gabbg"));
    }

    // Test for retrieving a user's password
    @Test
    public void testRetrievePassword() {
        Assert.assertTrue("Successfully retrieved user1's password", user1.getPassword().equals(Secure.encrypt("!@Amazon_CMH1_Warriors@!")));
        Assert.assertTrue("Successfully retrieved user2's password", user2.getPassword().equals(Secure.encrypt("HelloWorld123")));
    }

}
