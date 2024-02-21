import org.junit.Test;

import java.time.OffsetDateTime;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MainTest {
    @Test
    public void testIsAfterMethod() {
        Main test1 = new Main();
        String date1 = "2024-04-01T15:00:00Z";
        OffsetDateTime data1 = OffsetDateTime.parse(date1);
        String date2 = "2023-03-01T13:00:00Z";
        OffsetDateTime data2 = OffsetDateTime.parse(date2);
        boolean result = test1.isDateAfter(data1, data2);
        assertTrue(result);
    }

    @Test
    public void testDateNull() {
        Main test2 = new Main();
        String date2 = "2023-03-01T13:00:00Z";
        OffsetDateTime data2 = OffsetDateTime.parse(date2);
        boolean result1 = test2.isDateAfter(null, data2);
        assertFalse(result1);
    }


}