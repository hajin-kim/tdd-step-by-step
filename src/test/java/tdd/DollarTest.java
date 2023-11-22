package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DollarTest {

    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }

    @Test
    void testEquality() {
        assertEquals(new Dollar(5), new Dollar(5));
    }
}