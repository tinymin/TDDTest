package com.tinymin;

/**
 * Created by tinymin on 16. 7. 18..
 */
public interface Expression
{

    Money reduce(Bank bank, String to);
}
