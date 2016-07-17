package com.tinymin;

/**
 * Created by tinymin on 16. 7. 14..
 */
public abstract class Money
{
    protected int amount;
    protected String currency;

    public Money(int amount, String currency)
    {
        this.amount = amount;
        this.currency = currency;
    }

    public boolean equals(Object obj)
    {
        Money money = (Money)obj;
        return (getClass().equals(money.getClass())) && (amount == money.amount);
    }

    public static Dollar dollar(int amount)
    {
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount)
    {
        return new Franc(amount, "CHF");
    }

    public String currentcy()
    {
        return currency;
    }

    public abstract Money times(int multiplier);
}
