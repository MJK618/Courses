import java.util.Scanner;  
public class Exercise1_1 {
       public static void main(String[] args) {
Scanner s = new Scanner(System.in); 
       double radius= s.nextDouble();
       double perimeter;
       double area;
       
            //Calculate the perimeter 
            //Calculate the area
            if (radius <= 0) {

                System.out.println(" please enter non zero positive number");
            } else {
                area = Math.PI * radius * radius;
                System.out.println(area);
                perimeter = 2 * Math.PI * radius;
                System.out.print(perimeter);
            }       
    }
}
