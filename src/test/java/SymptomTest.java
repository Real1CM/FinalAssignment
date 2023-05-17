import org.example.Detail;
import org.example.Symptom;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SymptomTest {
    @ParameterizedTest
    @CsvSource({
            "1"
    })
    void selectSymptomTest(int a) {
        Detail mockedDetail = mock(Detail.class);
        when(mockedDetail.symptom(1)).thenReturn(1);
        if (a == 1) {

        }
    }

    @ParameterizedTest
    @CsvSource({
            "0",
            "1",
            "4",
            "3",
            "5",
            "14",
    })
    void contactHistoryTest(int a) {
        assertEquals(a <= 4, new Symptom().contactHistory(a) == 0);
    }
}
