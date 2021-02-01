// char and String
import java.util.* ;
public class words
{
 public static void main(String[] args)
 {
 Scanner myInput = new Scanner(System.in);  
 
 String fname , lname , fullname ;
 char fi , li ;
 int nl ;
  
 System.out.print("What's your first name? ");
 fname = myInput.next();
 fi = fname.charAt(0);
  
 System.out.print("What's your last name? ");
 lname = myInput.next();
 li = lname.charAt(0);  
 
 fullname = fname + " " + lname ;
 
 nl = fname.length() + lname.length();
 
 System.out.println("\n\nHi "+ fullname +"!");
 System.out.println("initials: "+fi+"."+li+".");
 System.out.println("email: "+fi+lname+"@kbcc.students.cuny.edu");
 System.out.println("your name has "+nl+" letters in it");
 System.out.println("Your name written backwards is: ");
 
 for(int i = (fullname.length()-1) ; i >= 0 ; i--)
                     System.out.print(fullname.charAt(i));
  
 }
} 