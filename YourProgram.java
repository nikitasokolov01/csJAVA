import java.util.* ;
public class YourProgram 
{
    public static void main(String[] args){
    
        Scanner myInput = new Scanner(System.in);

        int guess;
        int sn = (int) (Math.random()*15);
      
        do{
             System.out.print("What's your guess? ");
            
                guess = myInput.nextInt();
                

                if(guess>sn) System.out.println("Go lower!");
                    else if(guess==sn) System.out.println("You got it!");                  
                    else System.out.println("Go higher!");
                    
                
        }while(guess != sn); 
    } 
}


// \\ = backslash \n= new line \t = tab

// order of precedence works like in the real world (THINK PEMDAS) 

// if statements can be used to read differences in numbers and else statements can be
// used to the do the opposite after an if statement or just to do a different function
// if the function does not do what the if statement looked for.

// java will let you do two same if statements with different println and on a test you
// will call these an error even though the program doesnt call it an error.

 // else if can be used to seperate functions so you wouldnt have overlapping prints and such


 // can also write System.out.println(guess < sn ? "Go lower!" : "Go Higher!" ); and this is called a ternary operator which is basically a