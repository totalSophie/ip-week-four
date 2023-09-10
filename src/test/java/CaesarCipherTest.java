import org.example.CaesarCipher;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CaesarCipherTest {
    @Test
    public void testCipher() {
        CaesarCipher cipher = new CaesarCipher(2);
        //assertEquals("HI", cipher.decrypt("JK"));
        assertEquals("JGNNQ", cipher.encrypt("HELLO"));
        assertEquals("Hello, World!", cipher.decrypt("Jgnnq, Yqtnf!"));
    }

    @Test
    public void testKeyChange() {
        CaesarCipher cipher = new CaesarCipher(3);

        assertEquals("KL", cipher.encrypt("HI"));
        assertEquals("HI", cipher.decrypt("KL"));

        assertEquals("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", cipher.decrypt("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
        assertEquals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", cipher.encrypt("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD"));

        cipher.setKey(5);

        assertEquals("MN", cipher.encrypt("HI"));
        assertEquals("HI", cipher.decrypt("MN"));

    }
}
