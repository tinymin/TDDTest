package com.tinymin;

/**
 * Created by tinymin on 16. 7. 18..
 */
public class Bank
{
    public Money reduce(Expression source, String to)
    {
        /*
        아래 코드가 지저분한 이유는 2가지이다.
        1. 캐스팅(형변환). 이 코드는 모든 Expression에 대해 작동해야 한다.
        2. 공용(public) 필드와 그 필드들에 대한 두 단계에 걸친 레퍼런스.
        */

        Sum sum = (Sum)source;
        int amount = sum.augend.amount + sum.addend.amount;
        return new Money(amount, to);
    }
}
