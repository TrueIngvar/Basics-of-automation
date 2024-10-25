package ru.netology;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void shouldBeLessThen1_000() {
        CashbackHackService cash = new CashbackHackService();
        int amount = 365;

        int actual = cash.remain(amount);
        int expected = 635;

        assertEquals(expected, actual);
    }
}
