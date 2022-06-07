package tests.simple;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FailedTests {

    @Test
    @Disabled
    void test00() {
        assertTrue(false);
    }

    @Test
    @Disabled
    void test01() {
        assertTrue(false);
    }


}
