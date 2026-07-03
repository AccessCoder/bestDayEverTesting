import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void add_shouldReturn7_whenCalledWith5And2() {
        //GIVEN -> Vorbereitung -> Was weiß/brauche ich alles?
        int a = 5;
        int b = 2;
        int expected = 7;
        //WHEN -> Methodenaufruf -> Reality Check
        int actual = Main.add(a, b);
        //THEN -> Vergleich -> Erwartung vs Realität
        assertEquals(expected, actual);
    }

    @Test
    void isEven_shouldReturnTrue_whenCalledWith2() {
        //GIVEN
        int a = 2;
        //WHEN
        boolean actual = Main.isEven(a);
        //THEN
        assertTrue(actual);
    }

    @Test
    void isEven_shouldReturnFalse_whenCalledWith1() {
      assertFalse(Main.isEven(1));
    }

}