package com.tinymin;

/**
 * Created by tinymin on 16. 7. 13..
 */
public class Franc extends Money
{
    public Franc(int amount)
    {
        this.amount = amount;
    }

    public Money times(int multiplier)
    {
        return new Franc(amount * multiplier);
    }

    @Override
    public String currentcy()
    {
        return "CHF";
    }
}
