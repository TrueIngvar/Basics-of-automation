package ru.netology;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void shouldBeLessThen1_000() {
        CashbackHackService cash = new CashbackHackService();
        int amount = 999;

        int actual = cash.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }
    @Test
    public void cashbackShouldBeZero() {
        CashbackHackService cash = new CashbackHackService();
        int amount = 1000;

        int actual = cash.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}