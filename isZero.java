import java.util.* ;                            // Made by Nikita Sokolov
public class isZero
{
    public static void main(String[] args){

        Scanner numCheck = new Scanner(System.in);

        int no1;                                            // integers setup for later code
        int no2;
        int sum;
        int product;
        int difference;
        float quotient;                                     // float tells java to use floating point math instead of normal integer math, basically this will let me show a decimal as the quotient answer instead of just 0

        System.out.println("Enter first number");             // asks to enter number
                            
        no1 = numCheck.nextInt();                           // defines int no1 as whatever will be inputed next in the terminal and stores it for later

        System.out.println("Enter a second number");        // asks to enter a second number

        no2 = numCheck.nextInt();                           // defines int no2 as whatever will be inputed in the terminal again

        sum = no1 + no2;                                    // gives the integers sum,product,difference,and quotient some meaning to make it easier to type later.
        product = no1 * no2;
        difference = no2 - no1;
        quotient = ((float)no2) / no1;                      // here it states that this will be a floating equation letting us have a nice decimal number instead of it being rounded down to 0 when using weird numbers

        System.out.println("Sum: "+ sum);                   // prints the sum, product, difference. Quotient will come later.
        System.out.println("Product: "+ product);
        System.out.println("Difference: " + difference);

        if(no2 > 0 || no2 < 0){                                         // if else statement telling the computer to check if int no2 is greater than 0 or less than 0
            System.out.println("Quotient: " + quotient);                // if it isnt 0 it will run the quotient integar which will divide no2 by no1
        }
        else {                                                          // if no2 is neither greater than 0 or less than 0, then that means it must be 0 so it will print out
            System.out.println("Quotient: Cannot divide by zero.");     // a message saying that you cannot divide by zero!
        }
    }

}