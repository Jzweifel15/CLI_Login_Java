package Tests;

import Security.Secure;
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class SecureTest {
    String testPassword;

    // Pre-test setup
    @Before
    public void pretest() {
        testPassword = "12+HelloWorld+21";
    }

    // Test Encryption
    @Test
    public void testEncryption() {
        Assert.assertTrue("Test encryption did not match", Secure.encrypt(testPassword).equals("97_PslliAiflt_79"));
    }

    // Test Decryption
    @Test
    public void testDecryption() {
        Assert.assertTrue("Test decryption did not match", Secure.decrypt("97_PslliAiflt_79").equals(testPassword));
    }

    // Post-test teardown
    @After
    public void postTest() {
        testPassword = "";
    }

}
