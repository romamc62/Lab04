//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int n = 3;
        HelloWorld(n);

        int n1=1;
        int n2=25;
        System.out.println(SumOfSeven(n1,n2,0));

        int l1=1;
        int l2=20;
        int s=12;
        System.out.println(BSR(l1,l2,s));

    }

    static void HelloWorld(int num) {

        if (num != 0) { // test

            System.out.println("HelloWorld");

            HelloWorld(num - 1); // recursive call
        }

    }

    static int SumOfSeven(int num1,int num2,int sum){
        if(num2!=num1){
            if(num2 % 7==0){ //checks if num2 is a multiple of 7
                sum+=num2; //if so, adds to sum
            }
             return SumOfSeven(num1,num2-1,sum); //loops again while iterating through values
        }
        return sum;
    }

    static int BSR(int num1, int num2, int s) {

        int mid = num1 + (num2 - num1) / 2; //get the middle number

        if (mid == s) { //check if the middle number is the one we searching for
            return mid;
        }
        else if (mid > s) { //if number is smaller than middle, search lower
            return BSR(num1, mid - 1, s);
        }
        else { //if number is larger than middle, search higher
            return BSR(mid + 1, num2, s);
        }
    }
}