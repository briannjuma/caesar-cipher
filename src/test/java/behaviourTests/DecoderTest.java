package behaviourTests;

import brayocodes.Decoder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecoderTest {
    Decoder testDecoder = new Decoder("BOY",2);

    @Test
    public void testInstanceCreated(){
        assertEquals(true, testDecoder instanceof Decoder);
    }

    @Test
    public void testInputSaved(){
        assertEquals("BOY", testDecoder.getUserInput());
    }
    @Test
    public void testInputNotEmpty(){
        assertEquals(true, testDecoder.isNotEmpty());
    }

    @Test
    public void testKeySaved(){
        assertEquals(2, testDecoder.getShiftKey());
    }
    @Test
    public void testKeyValid(){
        assertEquals(true, testDecoder.isKeyValid());
    }

    @Test
    public void testDecrypt(){
        Decoder testDecrypt = new Decoder("DQA",2);
        assertEquals("BOE",testDecoder.decrypt());
    }

}
