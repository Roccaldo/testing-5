import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
private Main test = new Main();

    @org.junit.jupiter.api.Test
    void main() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime modifyData = data.plusYears(1).minusMonths(1).plusDays(7);
        String formatData = modifyData.format(DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.ITALY));

        assertEquals("8 febbraio 2024", formatData);
    }
}