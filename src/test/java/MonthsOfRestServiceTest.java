import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.service.MonthsOfRestService;

public class MonthsOfRestServiceTest {

    @ParameterizedTest
    @CsvFileSource(files ="src/test/resources/FirstIncomeInformation.csv")

    public void testValidData1(int income, int expenses, int threshold) {
  MonthsOfRestService service = new MonthsOfRestService();

  int expected = 3;
  int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvFileSource(files ="src/test/resources/SecondIncomeInformation.csv")

    public void testValidData2(int income, int expenses, int threshold) {
        MonthsOfRestService service = new MonthsOfRestService();

        int expected = 2;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}