package com.tinymin;

/**
 * Created by tinymin on 16. 7. 18..
 */
public class Bank
{
    public Money reduce(Expression source, String to)
    {
        if (source instanceof Money)
            return (Money)source;
        Sum sum = (Sum)source;
        return sum.reduce(to);
    }
}
