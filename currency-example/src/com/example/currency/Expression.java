package com.example.currency;

/**
 * @author 사용자명 (메일계정@navercorp.com)
 */
public interface Expression {
    Money reduce(String to);
}
