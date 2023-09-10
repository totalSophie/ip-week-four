import org.example.CaesarCipher;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CaesarCipherTest {
    @Test
    public void testCipher() {
        CaesarCipher cipher = new CaesarCipher(2);
        assertEquals("HI", cipher.decrypt("JK"));
        assertEquals("JGNNQ", cipher.encrypt("HELLO"));
        assertEquals("Hello, World!", cipher.decrypt("Jgnnq, Yqtnf!"));
    }

    @Test
    public void testKeyChange() {
        CaesarCipher cipher = new CaesarCipher(3);

        assertEquals("KL", cipher.encrypt("HI"));
        assertEquals("HI", cipher.decrypt("KL"));


        cipher.setKey(5);

        assertEquals("MN", cipher.encrypt("HI"));
        assertEquals("HI", cipher.decrypt("MN"));

    }
}
