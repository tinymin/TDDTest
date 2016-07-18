package com.tinymin;

/**
 * Created by tinymin on 16. 7. 14..
 */
public class Money
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
        return (getCurrentcy().equals(money.currency)) && (amount == money.amount);
    }

    public static Dollar dollar(int amount)
    {
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount)
    {
        return new Franc(amount, "CHF");
    }

    public String getCurrentcy()
    {
        return currency;
    }

    public Money times(int multiplier)
    {
        return new Money(amount * multiplier, currency);
    }

    @Override
    public String toString()
    {
        return amount + ", " + currency;
    }
}
