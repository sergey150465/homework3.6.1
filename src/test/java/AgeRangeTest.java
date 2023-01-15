import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AgeRangeTest {
    @Test
    public void nationalTeam() {
        //given
        AgeRange ageRange = new AgeRange();
        int[][] a = {{50, 45, 41, 38, 33, 30, 29, 25, 20, 18},
                {60, 57, 55, 51, 49, 47, 43, 37, 30, 20},
                {40, 39, 37, 35, 33, 30, 25, 23, 21, 18}};
        int[] expected = {60, 57, 55, 51, 50, 49, 47, 45, 43, 41};

        //when
        int[] actual = ageRange.nationalTeam(a);

        //then
        Assertions.assertArrayEquals(expected, actual);
    }
}
