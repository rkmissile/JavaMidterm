package math.problems;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        // recursion way to get factorial of numbers>>
        int factorial= factRecursion(5);
        System.out.println("Factorial of given n in recursion way is: "+factorial);

        //iterator way to get factorial of numbers>>>
        factIteration();



    }


    static int factRecursion(int n)
    {
        int output;
        if(n==1){
            return 1;
        }
        //Recursion: Function calling itself!!
        output = factRecursion(n-1)* n;
        return output;
    }


    static void factIteration(){

        int fact=1;
        int number=5;

        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" in iterator way is: "+fact);

    }
}
