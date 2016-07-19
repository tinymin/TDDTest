package com.tinymin;

/**
 * Created by tinymin on 16. 7. 20..
 */
public class Pair
{
    private String from;
    private String to;

    public Pair(String from, String to)
    {
        this.from = from;
        this.to = to;
    }

    @Override
    public int hashCode()
    {
        return 0;
    }

    @Override
    public boolean equals(Object obj)
    {
        Pair pair = (Pair)obj;
        return from.equals(pair.from) && to.equals(pair.to);
    }
}
