package com.tinymin;

/**
 * Created by tinymin on 16. 7. 19..
 */
public class Sum implements Expression
{
    public Money augend;
    public Money addend;

    public Sum(Money augend, Money addend)
    {
        this.augend = augend;
        this.addend = addend;
    }
}
