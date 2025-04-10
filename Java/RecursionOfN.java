public class Factorial {
    // Recursive method to calculate factorial
    public static int factorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }
        // Recursive call
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int number = 5; // Example number
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }
}
// https://takeuforward.org/data-structure/factorial-of-a-number-iterative-and-recursive/
// https://www.perplexity.ai/search/use-recursion-to-return-factor-J6LK9gYeRG.XMEqbGvKgWA
