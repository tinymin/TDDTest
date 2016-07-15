package com.tinymin;

/**
 * Created by tinymin on 16. 7. 13..
 */
public class Dollar extends Money
{
    private String currentcy;

    public Dollar(int amount)
    {
        this.amount = amount;
        this.currentcy = "USD";
    }

    public Money times(int multiplier)
    {
        return new Dollar(amount * multiplier);
    }

    @Override
    public String currentcy()
    {
        return currentcy;
    }
}
