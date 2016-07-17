import com.tinymin.Money;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tinymin on 16. 7. 13..
 */
public class TestCurrency
{
    @Test
    public void testMulitipication() throws Exception
    {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void testFrancMulitipication() throws Exception
    {
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    public void testEquality() throws Exception
    {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));

        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.franc(6)));

        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }

    @Test
    public void testCurrentcy() throws Exception
    {
        assertEquals("USD", Money.dollar(1).currentcy());
        assertEquals("CHF", Money.franc(1).currentcy());
    }
}
