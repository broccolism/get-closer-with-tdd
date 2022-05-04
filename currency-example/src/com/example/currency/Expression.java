package com.example.currency;

/**
 * @author 사용자명 (메일계정@)
 */
public interface Expression {
    Money reduce(Bank bank, String to);
    Expression plus(Expression addend);
    Expression times(int multiplier);
}
