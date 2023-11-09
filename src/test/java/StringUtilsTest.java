import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {


    @Test
    void isEmpty() {
        assertFalse(StringUtils.isEmpty("TEST"));
        assertTrue(StringUtils.isEmpty(""));
        assertTrue(StringUtils.isEmpty(" "));
    }

    @Test
    void toDouble() {
        assertEquals(3.1415, StringUtils.toDouble("3.1415"), 0.0001);
        assertEquals(Double.NaN, StringUtils.toDouble(null), 0.00001);
    }

    @Test
    void fromDouble() {
        double source = 3.1415;
        String expected="3.1415";
        String actual = StringUtils.fromDouble(source);
        assertEquals(expected, actual);
    }
}