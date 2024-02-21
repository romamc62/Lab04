public class Task3 {
    int fib(int n)

    {

        if (n <= 0) // base case

            return 0;

        else if (n == 1) // base case

            return 1;

        else

            return fib(n - 1) + fib(n - 2);

    }

    //the time complexity of this algorithm is exponential, O(2^n).
    //This is because the number does not change at a fixed rate, and is instead based on the previous calculation
}
