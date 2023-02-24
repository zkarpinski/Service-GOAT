package com.zacharykarpinski;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyUnitTest {

    @MicronautTest
    public void SampleTestOne() {
        final String NAME = "MyUnitTest";

        assertEquals("MyUnitTest", NAME);

    }
}