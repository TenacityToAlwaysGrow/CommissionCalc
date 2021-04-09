/*
 * Assignment 1
 * Question 6
 * Jennifer Carr
 * 672-249317
 */

package assignoneques6;

/**
 * sales commission calculator application
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //array holding item values
        int item[] = new int [] {1, 2, 3, 4};

        //index counter
        int x = 0;

        //variables to hold sale items
        double amountSold = 0.00;


        //variables to calculate pay and commission
        double weeklyPay;
        double commissionMade;


        String empName;

        System.out.println ("Enter Employee Name");//prompt user for name
        empName = input.nextLine();//set employee name

        while (item[x] > 0)
        {
          System.out.println ("Select which item was sold, 1-4, or -1 to quit");
          item[x] = input.nextInt();

           //loop until sentinel value or error
            if (item[x] == 1)
             amountSold = amountSold + 239.99;
            
              else if (item[x] == 2)
                amountSold = amountSold + 129.75;
            
                else if (item[x] == 3)
                   amountSold = amountSold + 99.95;
            
                  else if (item[x] == 4)
                     amountSold = amountSold + 350.89;

               //error message if provide wrong value
               System.out.println("Enter an item number between 1 and 4, or -1 to quit");
               item[x] = input.nextInt();

             x++;
        
        
             if (x !=0)
             {
                 //calculate gross sales and weekly earnings
                 commissionMade = (double)(amountSold * .09);
                 weeklyPay = (double) commissionMade + 200;

                 System.out.printf("\n Total Commission Made " +commissionMade);
                 System.out.println();
                 System.out.printf ("\n Total Weekly Pay " +weeklyPay);
                 System.out.println();
             }//end if
           }//end while

    }//end main method

}//end main class
