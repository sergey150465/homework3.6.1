import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PlusThreeTest {
    PlusThree plusThree = new PlusThree();

    @ParameterizedTest
    @MethodSource("sumWithDataSource")
    public void sum(int a, int b, int c, int expected) {
        //when
        int actual = plusThree.sum(a, b, c);

        //then
        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> sumWithDataSource() {
        return Stream.of(Arguments.of(1, 2, 3, 6),
                Arguments.of(4, 5, 6, 15),
                Arguments.of(7, 8, 9, 24));
    }
}
