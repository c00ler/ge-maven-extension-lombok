package com.github.avenderov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {

    @Test
    void getsCarManufacturer() {
        var toyota = new Car("TOYOTA");

        assertEquals("TOYOTA", toyota.getManufacturer());
    }
}
