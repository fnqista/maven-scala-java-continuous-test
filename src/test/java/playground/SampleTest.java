package playground;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class SampleTest {

    @Test
    public void shouldAddCorrectly() {
        assertEquals(Integer.valueOf(8), Sample.add(1, 2));

    }
}
