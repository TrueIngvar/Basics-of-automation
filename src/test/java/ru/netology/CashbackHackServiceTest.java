package ru.netology;


//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {
    @Test
    public void shouldBeLessThen1_000() {
        CashbackHackService cash = new CashbackHackService();
        int amount = 999;

        int actual = cash.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }
}
