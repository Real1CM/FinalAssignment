import org.example.Detail;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DetailTest {

    @ParameterizedTest
    @CsvSource({"37.3", "37.4", "38.0", "41.9", "42.0", "50.0"})
    void TemperatureTopTest(float i) {
        assertEquals(i <= 42.0 && i >= 37.3, new Detail().TemperatureTop(i) != 0);
    }

    @ParameterizedTest
    @CsvSource({
            "0,持续14天以内",
            "1,持续14天以内",
            "14,持续14天以内",
            "13,持续14天以内",
            "7,持续14天以内",
            "15,持续14天以上",
            "16,持续14天以上",
            "20,持续14天以上"
    })
    void symptomDurationTest(int a, String expected) {
        assertEquals(expected, new Detail().symptomDuration(a));
    }

    @ParameterizedTest
    @CsvSource({"0, 持续14天以内", "14, 持续14天以内", "15, 持续14天以上", "100, 持续14天以上"})
    public void testSymptomDuration(int inputNumber, String expectedResult) {
        assertEquals(expectedResult, new Detail().symptomDuration(inputNumber));
    }
}
