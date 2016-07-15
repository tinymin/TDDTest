import com.tinymin.Dollar;
import com.tinymin.Franc;
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
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));

        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(6)));

        assertFalse(new Franc(5).equals(new Dollar(5)));
    }

    @Test
    public void testCurrentcy() throws Exception
    {
        assertEquals("USD", Money.dollar(1).currentcy());
        assertEquals("CHF", Money.franc(1).currentcy());
    }
}
