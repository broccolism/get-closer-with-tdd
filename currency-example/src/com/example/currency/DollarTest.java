package com.example.currency;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author 손영인 (youngin.son@navercorp.com)
 */
public class DollarTest {

    @Deprecated
    public void 곱셈_테스트_버전_1() {
        // Dollar five = new Dollar(5);
        // five.times(2);
        // assertEquals(10, five.amount);
    }

    @Test
    public void 곱셈_테스트_버전_2() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void equal_메서드_테스트() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
    }
}
