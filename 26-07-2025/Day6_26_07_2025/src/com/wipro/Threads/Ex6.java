package com.wipro.Threads;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Ex6 {

    @Test
    public void testIsUpperCaseWithUpperCaseString() {
        assertTrue(StringUtil.isUpperCase("HELLO"));
    }

    @Test
    public void testIsUpperCaseWithLowerCaseString() {
        assertFalse(StringUtil.isUpperCase("hello"));
    }

    @Test
    public void testIsUpperCaseWithNull() {
        assertFalse(StringUtil.isUpperCase(null));
    }

    @Test
    public void testIsUpperCaseWithEmptyString() {
        assertTrue(StringUtil.isUpperCase(""));
    }
}

