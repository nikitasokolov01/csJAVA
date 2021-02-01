import java.util.* ;                            // Made by Nikita Sokolov
public class timesTable
{
    public static void tableNmbrs(){
        Scanner numbr = new Scanner(System.in);

        int n;

        System.out.println("times table up to what number?");
        n = numbr.nextInt();

        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < n+1; j++){
               System.out.print(i * j + " ");
            }
            System.out.println("\n");
          }
    }
    public static void main(String[] args){
        boolean multiTable = true;

        while(multiTable){
            tableNmbrs();
        }
    }

        
}
