package com.tinymin;

/**
 * Created by tinymin on 16. 7. 14..
 */
public abstract class Money
{
    protected int amount;

    public boolean equals(Object obj)
    {
        Money money = (Money)obj;
        return (getClass().equals(money.getClass())) && (amount == money.amount);
    }

    public static Dollar dollar(int amount)
    {
        return new Dollar(amount);
    }

    public static Money franc(int amount)
    {
        return new Franc(amount);
    }

    public abstract Money times(int multiplier);

    public abstract String currentcy();
}
