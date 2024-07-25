import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.Duration;

public class StringUtilsTest {

    @Test
    public void testStringUtilsMethods() {
        StringUtils stringUtils = new StringUtils();

        // assertTrue
        assertTrue(stringUtils.isPalindrome("madam"), "The string 'madam' should be a palindrome");

        // assertFalse
        assertFalse(stringUtils.isPalindrome("hello"), "The string 'hello' should not be a palindrome");

        // assertNull
        assertNull(stringUtils.reverse(null), "Reversing a null string should return null");

        // assertNotNull
        assertNotNull(stringUtils.reverse("hello"), "Reversing a non-null string should not return null");

        // assertEquals
        assertEquals("olleh", stringUtils.reverse("hello"), "The reverse of 'hello' should be 'olleh'");
        assertEquals(2, stringUtils.countVowels("hello"), "The string 'hello' should contain 2 vowels");

        // assertNotEquals
        assertNotEquals(4, stringUtils.countVowels("hello"), "The string 'hello' should not contain 4 vowels");

        // assertArrayEquals
        String[] expectedArray = {"madam", "racecar"};
        String[] actualArray = {stringUtils.reverse("madam"), stringUtils.reverse("racecar")};
        assertArrayEquals(expectedArray, actualArray, "The reversed strings should be 'madam' and 'racecar'");

        // assertThrows
        Exception exception = assertThrows(NullPointerException.class, () -> {
            String str = null;
            str.length();
        });
        assertEquals("Cannot invoke \"String.length()\" because \"str\" is null", exception.getMessage(), "A NullPointerException should be thrown");

        // assertTimeout
        assertTimeout(Duration.ofSeconds(1), () -> {
            Thread.sleep(500);
        }, "Method should complete within 1 second");

        // assertSame
        String str1 = "hello";
        String str2 = str1;
        assertSame(str1, str2, "Both references should point to the same object");

        // assertNotSame
        String str3 = new String("hello");
        assertNotSame(str1, str3, "Both references should not point to the same object");
    }
}
