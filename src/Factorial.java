import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        factorialNumber();

    }

    private static void factorialNumber() {

        int num=1;
        float fact=1;

        Scanner scn= new Scanner(System.in);
        System.out.println("Enter the number");
        num= scn.nextInt();

        for (int i=num;i>1;i--)
        {
            fact=fact*i;


        }
        System.out.println(fact);


    }
}

