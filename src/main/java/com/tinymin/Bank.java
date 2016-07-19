package com.tinymin;

/**
 * Created by tinymin on 16. 7. 18..
 */
public class Bank
{
    public Money reduce(Expression source, String to)
    {
        return source.reduce(this, to);
    }

    public void addRate(String from, String to, int rate)
    {

    }
}
