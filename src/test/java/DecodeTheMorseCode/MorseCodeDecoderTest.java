package DecodeTheMorseCode;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;


class MorseCodeDecoderTest {
    @Test
    public void testExampleFromDescription() {
        MatcherAssert.assertThat(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."), is("HEY JUDE"));
    }
}