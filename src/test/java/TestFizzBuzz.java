import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestFizzBuzz {

    @Test
    public void isFizz() throws Exception {
        int number = 3;
        String actual = FizzBuzz.isFizz(number);
        String expected = "fizz";
        assertEquals(actual,expected);
    }
}
