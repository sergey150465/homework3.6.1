import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class YearCheckTest {
    @Test
    public void yearCheck(){
        //given
        YearCheck yearCheck = new YearCheck();
        int a = 2004, expected = 366;

        //when
        int actual = yearCheck.yearCheck(2004);

        //then
        Assertions.assertEquals(expected, actual);
    }
}
