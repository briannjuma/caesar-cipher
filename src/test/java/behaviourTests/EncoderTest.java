package behaviourTests;

import brayocodes.Encoder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class EncoderTest {
    Encoder testEncoder = new Encoder("BOY",3); // import our class

    // Test 1
    @Test
    public void testNewInstanceCreated(){
        assertEquals(true, testEncoder instanceof Encoder);
    }

    // Test 2 - user input
    @Test
    public void testInputSaved(){
        assertEquals("BOY", testEncoder.getUserInput());
    }
    @Test
    public void testInputNotEmpty(){
        assertEquals(true, testEncoder.isNotEmpty());
    }

    // Test 3 - shift key
    @Test
    public void testKeySaved(){
        assertEquals(3, testEncoder.getShiftKey());
    }
    @Test
    public  void testKeyValid(){
        assertEquals(true, testEncoder.isKeyValid());
    }

    //Test 4
    @Test
    public void testEncrypt(){
        Encoder testEncrypt = new Encoder("BOY",2);
        assertEquals("DQA", testEncrypt.encrypt());
    }
}
