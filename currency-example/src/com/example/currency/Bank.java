package com.example.currency;

/**
 * @author 사용자명 (메일계정@navercorp.com)
 */
public class Bank {
    Money reduce(Expression source, String to) {
        if (source instanceof Money)
            return (Money) source.reduce(to);
        Sum sum = (Sum) source;
        return sum.reduce(to);
    }
}
