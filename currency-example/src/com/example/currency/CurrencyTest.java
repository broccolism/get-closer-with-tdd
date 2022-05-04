package com.example.currency;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author 사용자명 (메일계정@)
 */
@SuppressWarnings("NonAsciiCharacters")
public class CurrencyTest {
    @Test
    public void 화폐_테스트() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

    @Test
    public void 서로_다른_통화_reduce_테스트() {
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Money result = bank.reduce(Money.franc(2), "USD");
        assertEquals(Money.dollar(1), result);
    }

    @Test
    public void 서로_같은_통화_테스트() {
        assertEquals(1, new Bank().rate("USD", "USD"));
    }
}
