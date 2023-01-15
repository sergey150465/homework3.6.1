import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CrossZeroGameTest {
    @Test
    public void isWin(){
        //given
        CrossZeroGame crossZeroGame = new CrossZeroGame();
        char[][] a = {
                {CrossZeroGame.ZERO, CrossZeroGame.ZERO, CrossZeroGame.ZERO, CrossZeroGame.EMPTY, CrossZeroGame.EMPTY},
                {CrossZeroGame.CROSS, CrossZeroGame.CROSS, CrossZeroGame.CROSS, CrossZeroGame.CROSS, CrossZeroGame.CROSS},
                {CrossZeroGame.CROSS, CrossZeroGame.ZERO, CrossZeroGame.CROSS, CrossZeroGame.ZERO, CrossZeroGame.CROSS},
                {CrossZeroGame.ZERO, CrossZeroGame.ZERO, CrossZeroGame.EMPTY, CrossZeroGame.ZERO, CrossZeroGame.CROSS},
                {CrossZeroGame.ZERO, CrossZeroGame.EMPTY, CrossZeroGame.ZERO, CrossZeroGame.CROSS, CrossZeroGame.CROSS}
        };
        char b = CrossZeroGame.CROSS;

        //when
        boolean actual = crossZeroGame.isWin(a, b);

        //then
        Assertions.assertTrue(actual);
    }
}
