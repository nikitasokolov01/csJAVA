public class Practice {
    static void randomNumber(){
        int rn = (int) (Math.random()*15);
        System.out.println(rn);
    }
public static void main(String[] args) {
    System.out.println("Your lucky numbers are: ");
    randomNumber();
    randomNumber();
    randomNumber();
    randomNumber();
    randomNumber();
    randomNumber();
    
}
}
