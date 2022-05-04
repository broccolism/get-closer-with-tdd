package com.example.currency;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author 사용자명 (메일계정@navercorp.com)
 */
@SuppressWarnings("NonAsciiCharacters")
public class CurrencyTest {
    @Test
    public void 화폐_테스트() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
}
