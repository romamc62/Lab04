public class Task2 {
    int gcd(int x, int y) {

        if (x % y == 0) //base case

            return y;

        else

            return gcd(y, x % y);

    }
}
//the output is the greatest common denominator of x and y. for example, using the numbers 64 and 80, the gcd is 16

//below is how to find the gcd using subtraction instead:
/*
    int gcd(int x, int y) {

        if (x == y) //base case

            return y;

        else if (x>y)

            return gcd(x-y,y);

        else
            return gcd(x,y-x);

    }
*/