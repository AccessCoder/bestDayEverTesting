import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

//    @Test
//    void add_shouldReturn7_whenCalledWith5And2() {
//        //GIVEN -> Vorbereitung -> Was weiß/brauche ich alles?
//        int a = 5;
//        int b = 2;
//        int expected = 7;
//        //WHEN -> Methodenaufruf -> Reality Check
//        int actual = Main.add(a, b);
//        //THEN -> Vergleich -> Erwartung vs Realität
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void isEven_shouldReturnTrue_whenCalledWith2() {
//        //GIVEN
//        int a = 2;
//        //WHEN
//        boolean actual = Main.isEven(a);
//        //THEN
//        assertTrue(actual);
//    }
//
//    @Test
//    void isEven_shouldReturnFalse_whenCalledWith1() {
//      assertFalse(Main.isEven(1));
//    }


    @Test
    void fizzBuzz_shouldReturn1_whenGiven1(){
        //GIVEN
        int n = 1;
        String expected = "1";
        //WHEN
        String actual = Main.fizzBuzz(n);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzz_shouldReturn2_whenGiven2(){
        //GIVEN
        int n = 2;
        String expected = "2";
        //WHEN
        String actual = Main.fizzBuzz(n);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzz_shouldReturnFizz_whenGiven3(){
        //GIVEN
        int n = 3;
        String expected = "Fizz";
        //WHEN
        String actual = Main.fizzBuzz(n);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzz_shouldReturnFizz_whenGiven6(){
        //GIVEN
        int n = 6;
        String expected = "Fizz";
        //WHEN
        String actual = Main.fizzBuzz(n);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzz_shouldReturnBuzz_whenGiven5(){
        //GIVEN
        int n = 5;
        String expected = "Buzz";
        //WHEN
        String actual = Main.fizzBuzz(n);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzz_shouldReturnFizzBuzz_whenGiven15(){
        //GIVEN
        int n = 15;
        String expected = "FizzBuzz";
        //WHEN
        String actual = Main.fizzBuzz(n);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzz_shouldReturnFizzBuzz_whenGiven0(){
        //GIVEN
        int n = 0;
        String expected = "FizzBuzz";
        //WHEN
        String actual = Main.fizzBuzz(n);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzz_shouldReturnFizz_whenGivenMinus3(){
        //GIVEN
        int n = -3;
        String expected = "Fizz";
        //WHEN
        String actual = Main.fizzBuzz(n);
        //THEN
        assertEquals(expected, actual);
    }











}