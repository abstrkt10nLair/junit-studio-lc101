package test;
import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void oddBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    @Test
    public void assertEqualExample() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    @Test
    public void returnSpecificString() {
        assertSame(BalancedBrackets.hasBalancedBrackets("[]"), true);
    }

    @Test
    public void doesNotReturnSpecificString() {
        assertNotSame(BalancedBrackets.hasBalancedBrackets("[]"), false);
    }

    @Test
    public void notNullExample() {
        assertNotNull(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

}
