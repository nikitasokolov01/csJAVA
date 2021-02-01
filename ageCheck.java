import java.util.* ;
public class ageCheck {
    public static void main(String[] args){

        Scanner oldEnough = new Scanner(System.in);

        int age;
        int legal = 18;

        System.out.println("Enter your age to see if you can vote.");

        age = oldEnough.nextInt();

            if (age >= legal){
                    System.out.println("You are allowed to vote!");
            }

            else if (age < legal && age > 0){
                System.out.println("No you cannot vote, you must wait " + (legal - age) + " years until you can vote.");       
            }    
            else {
                System.out.println("Please put a valid age!");
                oldEnough.close(); 
            }

    }
} 