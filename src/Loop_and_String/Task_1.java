package Loop_and_String;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int remainder;
        int dividend;
        int sum=0;
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        while(true)
        {
            remainder=num%10;
            dividend=num/10;
            num=dividend;
            sum+=remainder;
            if(dividend==0)
            {
                break;
            }
        }
        System.out.println("Sum of the digits = "+sum);
    }
}
