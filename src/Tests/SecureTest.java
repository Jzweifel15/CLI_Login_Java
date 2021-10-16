package Tests;

import Security.Secure;
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class SecureTest {
    String testPassword1;
    String testPassword2;
    String testPassword3;

    // Pre-test setup
    @Before
    public void pretest() {
        testPassword1 = "12+HelloWorld+21";
        testPassword2 = "<!TestDrivenDev342";
        testPassword3 = "*Java_Development47*";
    }

    // Test Encryption
    @Test
    public void testEncryption() {
        Assert.assertTrue("Test encryption for testPassword1 did not match", Secure.encrypt(testPassword1).equals("97_PslliAiflt_79"));
        Assert.assertTrue("Test encryption for testPassword2 did not match", Secure.encrypt(testPassword2).equals("?]DsedTfobsjTsb567"));
        Assert.assertTrue("Test encryption for testPassword3 did not match", Secure.encrypt(testPassword3).equals("(Nwbw+Tsbslihksjd62("));
    }

    // Test Decryption
    @Test
    public void testDecryption() {
        // TODO: Add the proper decryption sequence for testPasswords 2 and 3
        Assert.assertTrue("Test decryption for testPassword1 did not match", Secure.decrypt("97_PslliAiflt_79").equals(testPassword1));
        Assert.assertTrue("Test decryption for testPassword2 did not match", Secure.decrypt("?]DsedTfobsjTsb567").equals(testPassword2));
        Assert.assertTrue("Test decryption for testPassword3 did not match", Secure.decrypt("(Nwbw+Tsbslihksjd62(").equals(testPassword3));
    }

    // Post-test teardown
    @After
    public void postTest() {
        testPassword1 = "";
        testPassword2 = "";
        testPassword3 = "";
    }

}
