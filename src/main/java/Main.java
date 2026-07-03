public class Main {

    static void main() {
        System.out.println("Hello World");

    }

    /**
     * Spielregeln FizzBuzz
     * Wir geben die übergebene Zahl zurück, ausser in folgenden Fällen:
     * 1. Ist eine Zahl durch drei teilbar? -> Ausgabe "Fizz"
     * 2. Ist eine Zahl durch fünf teilbar? -> Ausgabe "Buzz"
     * 3. Ist eine Zahl durch drei und fünf teilbar? -> Ausgabe "FizzBuzz"
     *
     */

    public static String fizzBuzz(int number){
        if (number % 3 ==0 && number % 5==0){
            return "FizzBuzz";
        } else if(number % 5==0){
            return "Buzz";
        } else if (number % 3 ==0) {
            return  "Fizz";
        }
        return ""+number;
    }











    public static int add(int a, int b) {
        return a+b;
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

}
