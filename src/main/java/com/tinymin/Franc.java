package com.tinymin;

/**
 * Created by tinymin on 16. 7. 13..
 */
public class Franc extends Money
{
    public Franc(int amount, String currency)
    {
        super(amount, currency);
    }

    public Money times(int multiplier)
    {
        return Money.franc(amount * multiplier);
    }
}
