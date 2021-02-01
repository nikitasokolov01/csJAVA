import java.util.* ;                            // Made by Nikita Sokolov
public class geoCalc
{
    public static void shapeCalc(){
        Scanner numbr = new Scanner(System.in);

        int l;
        int w;
        int perimeter;
        double area;
        int radius;
        int diameter;
        double circumference;
        

        System.out.println("Pick one of the options below to start a calculation. (ENTER THE NUMBER)");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.println("4. Quit");  

        l = numbr.nextInt();
        

        if (l==1){
            System.out.println("State the length of any side.");
            l = numbr.nextInt();
            perimeter = l * 4;
            area = l * l;
            System.out.println("Perimeter of the square: " + perimeter);
            System.out.println("Area of the square: " + area);
        }
        else if (l==2){
            System.out.println("State the length of the rectangle.");
            l = numbr.nextInt();
            System.out.println("State the width of the rectangle.");
            w = numbr.nextInt();
            perimeter = l * 2 + w * 2;
            area = l * w;
            System.out.println("Perimeter of the rectangle: " + perimeter);
            System.out.println("Area of the rectangle: " + area);
        }
        else if (l==3){
            System.out.println("Enter the radius of the circle.");
            radius = numbr.nextInt();
            diameter = radius * 2;
            circumference = Math.round(diameter * 3.14);
            area = 3.14 * (radius * radius);
            System.out.println("Diameter of the circle: " + diameter + " units");
            System.out.println("Circumference of the circle: " + circumference + " units");
            System.out.println("Area of the circle: " + area + " sq. units");
        }
        else if (l==4){
            System.out.println("Quitting program...");
            System.exit(0);
        }
    }
    public static void main(String[] args){
        while(true){
            shapeCalc();
        }
    }

        
}