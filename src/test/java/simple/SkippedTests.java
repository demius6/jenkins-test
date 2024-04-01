package simple;

import io.qameta.allure.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SkippedTests {

    @Test
    @Disabled
    void test00() {
        assertTrue(false);
    }

    @Test
    @Owner("demius6")
    @Disabled("With some reason")
    void test01() {
        assertTrue(false);
    }
}