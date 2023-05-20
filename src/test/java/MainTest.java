import org.example.Detail;
import org.example.Main;
import org.example.Symptom;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MainTest {
    public Scanner scanner = new Scanner(System.in);
//    public Main main = new Main();

    @ParameterizedTest
    @CsvSource({
            "1,1,1",
            "12,1,3",
            "12,5,4",
            "1,5,2"
    })
    public void giveSuggestionTest(int symptonChosen, int contactChosen, int expectation) {
        Detail mockedDetail = mock(Detail.class);
        Symptom mockedSymptom = mock(Symptom.class);
        when(mockedDetail.symptom(1)).thenReturn(1);
        when(mockedDetail.TemperatureTop(38.0f)).thenReturn(38.0f);
        when(mockedSymptom.selectSymptom(2)).thenReturn(true);

        String detailChosen = "1";
        ByteArrayInputStream strIn = new ByteArrayInputStream(detailChosen.getBytes());
        System.setIn(strIn);
        int a;
        try {
            while ((a = System.in.read()) != -1) {
                System.out.print((char) a);
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        
        assertEquals(expectation, new Main().giveSuggestion(symptonChosen,contactChosen));
    }
}
