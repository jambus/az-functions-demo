package com.jambus.az.function.demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for Function class.
 */
public class FunctionTest {
    /**
     * Unit test for hello method.
     */
    @Test
    public void testSayHi() throws Exception {
        final Function function = new Function();

        final String ret = function.sayhi("function", null);

        assertEquals("Hello, function!", ret);
    }
}
