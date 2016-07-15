package com.tinymin;

/**
 * Created by tinymin on 16. 7. 13..
 */
public class Dollar extends Money
{
    public Dollar(int amount)
    {
        this.amount = amount;
    }

    public Money times(int multiplier)
    {
        return new Dollar(amount * multiplier);
    }
}
