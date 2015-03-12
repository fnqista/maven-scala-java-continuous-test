package com.devboon.seed;

import com.devboon.seed.test.group.QuickTests;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;

public class AdderTest {

    @Test
    @Category(QuickTests.class)
    public void testAddition() {
        assertEquals(Integer.valueOf(3), Adder.add(1, 2));
    }
}
