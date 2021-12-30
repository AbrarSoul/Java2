package Loop_and_String;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count=0;
        System.out.println(" ----- Digital Tasbeeh ----- ");

        while(true)
        {
            String enter = input.nextLine();
            if (enter.equals(""))
            {
                count++;
                System.out.println(count);
            }
            else if(enter.compareTo("0")==0)
            {
                System.out.println("Total tasbeeh count: "+count);
                System.out.println("Counting ended.");
                break;
            }
        }
    }
}
