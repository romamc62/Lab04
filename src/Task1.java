public class Task1 {
    void countDown(int num)

    {

        if (num == 0) // test

            System.out.println("Blastoff!");

        else {

            System.out.println("...");

            countDown(num-1); // recursive call

        }

    }
}
// The output of this code is "..." num times, followed by the string "Blastoff!"
//to make it only print even numbers, you would change countDown(num-1); to countDown(num-2);

// the time complexity of this algorithm changes at the same rate as num, because the recursion is limited to the same rate each loop